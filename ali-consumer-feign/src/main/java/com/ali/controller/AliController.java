package com.ali.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("ali")
public class AliController {

    @RequestMapping("test")
    @ResponseBody
    public String test(){
        return "six,six,six";
    }

}
