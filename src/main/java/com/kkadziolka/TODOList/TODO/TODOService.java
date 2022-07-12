package com.kkadziolka.TODOList.TODO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TODOService {

    private final TODORepository todoRepository;

    @Autowired
    public TODOService(TODORepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<TODO> getTODOs() {
        return todoRepository.findAll();
    }

    public void deleteTODO(Long id){
        todoRepository.deleteById(id);
    }

    public void postTODO(TODO todo) {
        TODO todoOptional = todoRepository.findByTitle(todo.getTitle());
        if (todoOptional != null) {
            throw new IllegalStateException("You have already add this task into TODO list");
        }
        todoRepository.save(todo);
    }
}
