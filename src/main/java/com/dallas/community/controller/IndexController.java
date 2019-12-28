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
public class IndexController {
    @GetMapping("/")
    public String index(){
        return "index";
    }
}
