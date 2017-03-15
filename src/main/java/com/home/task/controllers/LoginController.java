package com.home.task.controllers;

import com.home.task.controllers.form.LoginForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
@RequestMapping("login")
public class LoginController {

    @RequestMapping(method = RequestMethod.GET)
    public String init(ModelMap modelMap) {
        modelMap.put("loginForm", new LoginForm());
        return "Login";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String checkRegistrationInfo(
            @Valid @ModelAttribute("loginForm") LoginForm loginForm,
            BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "Login";
        }

        return "redirect:welcome";
    }
}
