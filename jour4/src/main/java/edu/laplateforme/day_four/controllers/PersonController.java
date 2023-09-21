package edu.laplateforme.day_four.controllers;

import edu.laplateforme.day_four.entities.Person;
import edu.laplateforme.day_four.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

import java.util.List;
import java.util.Random;

@Controller
public class PersonController {
    @Autowired
    private PersonService personService;

    @GetMapping("/daythree")
    public String DisplayAll(Model model) {
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            Person test = new Person();

            test.setName("Jojo");
            test.setAge(rand.nextInt(35));
            personService.NewPerson(test);
        }

        List<Person> personsList = personService.AllPerson();
        model.addAttribute("persons", personsList);
        return "test";
    }
}
