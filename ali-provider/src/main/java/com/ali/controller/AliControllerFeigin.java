package com.ali.controller;

import com.ali.service.AliService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AliControllerFeigin implements AliService {

    @Value("${1904b.api-a.hi}")
    String name;

    @Override
    public String test() {
        return name;
    }
}
