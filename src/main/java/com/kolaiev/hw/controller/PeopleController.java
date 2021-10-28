package com.kolaiev.hw.controller;

import com.kolaiev.hw.repo.PersonDAO;
import com.kolaiev.hw.repo.PersonDAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PeopleController {

    @Autowired
    private PersonDAOImpl personDAOImpl;

    @GetMapping("/")
    public String all(Model model){
        model.addAttribute("people", personDAOImpl.getAllPerson());
        return "people";
    }

}
