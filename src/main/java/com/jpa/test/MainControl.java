package com.jpa.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class MainControl {

    @GetMapping( "")
    public String showhomepage(){
        return "index";
    }
}
