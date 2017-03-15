package com.home.task.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/")
public class HomeController {

    @RequestMapping(method = RequestMethod.GET)
    public String init(final HttpServletRequest request, final HttpServletResponse response) {
        return "head";
    }

    @RequestMapping(path = "welcome", method = RequestMethod.GET)
    public String welcome(final HttpServletRequest request, final HttpServletResponse response) {
        return "Welcome";
    }
}
