package com.kkadziolka.TODOList.TODO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

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
}
