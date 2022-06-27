package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;

@Controller
public class IndexController {

    String svar1 = "seks";
    String svar1Buffer = "6";

    String svar2 = "gudhjem";
    String svar2Buffer = "gudhjem havn";

    String svar3 = "6009";
    String svar3Buffer = "år 6009";

    String svar4 = "test";
    String svar4Buffer = "tester";


    @RequestMapping("/")
    public String frontpage(){
        return "index";
    }

    @GetMapping("/post1")
    public String post1(){

        return "post1";
    }

    @RequestMapping("/post1svar")
    public String post1svar(WebRequest dataFromForm){
        String answer = dataFromForm.getParameter("answer");
        if (answer != null) {

            if (answer.equalsIgnoreCase(svar1) || answer.equals(svar1Buffer)) {

                return "post1kort";
            }
        }
        return "index";
    }

    @GetMapping("/post2")
    public String post2(){

        return "post2";
    }

    @RequestMapping("/post2svar")
    public String post2svar(WebRequest dataFromForm){
        String answer = dataFromForm.getParameter("answer");
        if (answer != null) {

            if (answer.equalsIgnoreCase(svar2) || answer.equalsIgnoreCase(svar2Buffer)) {

                return "post2kort";
            }
        }
        return "index";
    }

    @GetMapping("/post3")
    public String post3(){

        return "post3";
    }

    @GetMapping("/post3svar")
    public String post3svar(WebRequest dataFromForm){
        String answer = dataFromForm.getParameter("answer");
        if (answer != null) {
            if (answer.equalsIgnoreCase(svar3) || answer.equalsIgnoreCase(svar3Buffer)) {

                return "post3kort";
            }
        }
        return "index";
    }

    @GetMapping("/post4")
    public String post4(){

        return "post4";
    }

    @GetMapping("/post4svar")
    public String post4svar(WebRequest dataFromForm){
        String answer = dataFromForm.getParameter("answer");
        if (answer != null) {
            if (answer.equalsIgnoreCase(svar4) || answer.equalsIgnoreCase(svar4Buffer)) {

                return "post4kort";
            }
        }
        return "index";
    }

    @GetMapping("/post5")
    public String post5(){

        return "post5";
    }

    @GetMapping("/post5svar")
    public String post5svar(){

        return "index";
    }

    @PostMapping("/test")
    public String test(WebRequest dataFromForm){
        String answer1 = dataFromForm.getParameter("post1");
        String answer2 = dataFromForm.getParameter("post2");
        String answer3 = dataFromForm.getParameter("post3");
        String answer4 = dataFromForm.getParameter("post4");

        if(answer1 != null && answer2 != null && answer3 != null && answer4 != null){
            if (!(answer1.equalsIgnoreCase(svar1) || answer1.equalsIgnoreCase(svar1Buffer))) {
                return "index";
            }
            if (!(answer2.equalsIgnoreCase(svar2) || answer2.equalsIgnoreCase(svar2Buffer))) {
                return "index";
            }
            if (!(answer3.equalsIgnoreCase(svar3) || answer3.equalsIgnoreCase(svar3Buffer))) {
                return "index";
            }
            if (!(answer4.equalsIgnoreCase(svar4) || answer4.equalsIgnoreCase(svar4Buffer))) {
                return "index";
            }
            return "post5kort";
        }

        return "index";
    }

    @GetMapping("/fejl")
    public String fejl(){

        return "fejl";
    }





}
