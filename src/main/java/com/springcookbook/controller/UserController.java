package com.springcookbook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springcookbook.domain.User;

@Controller
public class UserController {

    @RequestMapping("/addUser")
    public String addUser() {
        return "addUser";
    }

    @RequestMapping(value = "addUser", method = RequestMethod.POST)
    public String addUser(@ModelAttribute("defaultUser") User user) {
        System.out.println(user.getFirstName());
        System.out.println(user.isMarried());
        return "redirect:/home";
    }

    @ModelAttribute("defaultUser")
    public User defaultUser() {
        User user = new User();
        user.setFirstName("Joe");
        user.setMarried(true);
        return user;
    }

}
