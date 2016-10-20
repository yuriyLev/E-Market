package com.market.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/Emarket")
public class HomePageController {

        @RequestMapping(method = RequestMethod.GET)
        public ModelAndView welcomePage() {

            ModelAndView model = new ModelAndView("home");
            model.addObject("msg", "Hello, Welcome to Emarket home page");
            return model;
        }

    }
