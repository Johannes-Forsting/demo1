package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {


    @GetMapping("/")
    public String frontpage(){

        return "index";
    }

    @GetMapping("/page1")
    public String page1(){

        return "page1";
    }

    @GetMapping("/page2")
    public String page2(){

        return "page2";
    }

    @GetMapping("/page3")
    public String page3(){

        return "page3";
    }

    @GetMapping("/page4")
    public String page4(){

        return "page4";
    }

    @GetMapping("/page5")
    public String page5(){

        return "page5";
    }

    @GetMapping("/page6")
    public String page6(){

        return "page6";
    }

    @GetMapping("/page7")
    public String page7(){

        return "page7";
    }

    @GetMapping("/page8")
    public String page8(){

        return "page8";
    }

    @GetMapping("/page9")
    public String page9(){

        return "page9";
    }

    @GetMapping("/page10")
    public String page10(){

        return "page10";
    }
}
