package com.springbootapp.managment;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {


    @GetMapping("/index")
    public String home(){
        return "index";
    }

    @GetMapping("/contact")
    public String cont(){
        return "pages-contact";
    }
}
