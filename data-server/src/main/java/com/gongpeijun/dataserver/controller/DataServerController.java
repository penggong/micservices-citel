package com.gongpeijun.dataserver.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataServerController {

    @RequestMapping("/person/get")
    public String personGet(){
        return "success";
    }
}
