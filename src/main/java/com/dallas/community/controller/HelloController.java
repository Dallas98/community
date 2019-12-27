package com.dallas.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @program: community
 * @description:
 * @author: Dallas
 * @create: 2019-12-27 21:03
 */

@Controller
public class HelloController {
    @GetMapping("/hello")
    public String hello(@RequestParam(name = "name") String name, Model model) {
        model.addAttribute("name",name);
        return "hello";
    }
}
