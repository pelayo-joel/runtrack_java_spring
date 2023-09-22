package edu.laplateforme.jour5.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import edu.laplateforme.jour5.services.PersonService;
import edu.laplateforme.jour5.entities.Person;

import java.util.List;


@Controller
public class DataListController {
    @Autowired
    private PersonService personService;

    @GetMapping("/datalist")
    public String DisplayAll(Model model) {
        List<Person> personsList = personService.AllPerson();
        model.addAttribute("persons", personsList);
        return "datalist";
    }
}
