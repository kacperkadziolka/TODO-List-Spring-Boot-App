package com.kkadziolka.TODOList.TODO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/TODO")
public class TODOController {

    private final TODOService todoService;

    @Autowired
    public TODOController(TODOService todoService) {
        this.todoService = todoService;
    }

    @GetMapping
    public List<TODO> getTODOs() {
        return todoService.getTODOs();
    }

    @DeleteMapping(path = "{todoId}")
    public void deleteTODO(@PathVariable("todoId") Long todoId) {
        todoService.deleteTODO(todoId);
    }

    @PostMapping
    public void postTODO(@RequestBody TODO todo) {
        todoService.postTODO(todo);
    }

}
