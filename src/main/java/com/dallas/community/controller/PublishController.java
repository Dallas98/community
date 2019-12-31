package com.dallas.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @program: community
 * @description:
 * @author: Dallas
 * @create: 2019-12-31 13:35
 */

@Controller
public class PublishController {
    @GetMapping("/publish")
    public String publish() {
        return "publish";
    }
}
