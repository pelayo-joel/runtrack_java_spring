package edu.laplateforme.runtrack_java_spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;

import edu.laplateforme.runtrack_java_spring.controllers.view_utilities.Greeting;
import java.util.ArrayList;

@Controller
public class ViewController {
    @GetMapping("/Job_TwoAndThree")
    public String ThymeleafJob_TwoAndThree(Model model) {
        //Job 2
        model.addAttribute("message", "Je suis le message");

        //Job 3
        ArrayList<String> job_three = new ArrayList<>();
        job_three.add("Test");
        job_three.add("Test2");
        model.addAttribute("students", job_three);

        return "view";
    }

    @GetMapping("/Job_Four")
    public String ThymeleafJob_Four(Model model) {
        //Job 4
        model.addAttribute("greeting", new Greeting());
        return "view";
    }
    @PostMapping("/Job_Four")
    public String ThymeleafJob_FourSubmit(@ModelAttribute Greeting greeting, Model model) {
        //Job 4
        model.addAttribute("greeting", greeting);
        return "result_job4";
    }
}
