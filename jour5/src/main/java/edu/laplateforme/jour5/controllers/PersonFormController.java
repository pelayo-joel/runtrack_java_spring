package edu.laplateforme.jour5.controllers;

import edu.laplateforme.jour5.entities.Person;
import edu.laplateforme.jour5.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PersonFormController {
    @Autowired
    private PersonService personService;

    @GetMapping("/personform")
    public String AddPerson(Model model) {
        model.addAttribute("person", new Person());
        return "personform";
    }
    @PostMapping("/personform")
    public String ViewData(@ModelAttribute("person") Person person, Model model) {
        //model.addAttribute("person", person);
        System.out.println(person.getFirstName());
        personService.NewPerson(person);
        return "datalist";
    }
}
