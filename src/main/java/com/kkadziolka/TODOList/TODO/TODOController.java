package com.kkadziolka.TODOList.TODO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
