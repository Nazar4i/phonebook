package com.home.task.controllers;

import com.home.task.controllers.form.RegistrationForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
@RequestMapping("registration")
public class RegistrationController {

    @RequestMapping(method = RequestMethod.GET)
    public String init(ModelMap modelMap) {
        modelMap.put("registrationForm", new RegistrationForm());
        return "Register";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String checkRegistrationInfo(
            @Valid @ModelAttribute("registrationForm") RegistrationForm registrationForm,
            BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "Register";
        }

        return "redirect:welcome";
    }

}
