package com.gyf.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@EnableAutoConfiguration
@Controller
public class TeacherController {

    @RequestMapping("list")
    public String list(){
        System.out.println("aaaaaaaaaaaaa");
        return "teacher/list";
    }

    public static void main(String[] args) {
        SpringApplication.run(TeacherController.class,args);
    }
}
