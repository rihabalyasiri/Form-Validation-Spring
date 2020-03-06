package com.example.formvalidation;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class FormController {

    @GetMapping("/form")
    public String showForm(Model model) {
        model.addAttribute("formElements", new FormElements());
        return "form";
    }

    @PostMapping("/form")
    public String validateForm(@Valid FormElements formElements, BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
            return "form";
        }
        return "submit";
    }
}
