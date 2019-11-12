package com.ali.controller;

import com.ali.service.AliService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("ali")
public class AliController {

    @Resource
    private AliService aliService;

    @RequestMapping("test")
    @ResponseBody
    public String test(){
        return aliService.test();
    }

}
