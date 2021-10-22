package com.kolaiev.hw.controller;

import com.kolaiev.hw.repo.PersonDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    private final PersonDAO personDAO;

    @Autowired
    public HelloController(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    @GetMapping("/")
    public String all(Model model){
        model.addAttribute("people", personDAO.all());
        return "users";
    }

}
