package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@EnableAutoConfiguration
@Controller
public class oneController  {



	@RequestMapping("/list")
	public String one(){
		System.out.println("你好啊");
		return "list";
		
	}


    public static void main(String[] args) {
        SpringApplication.run(oneController.class, args);
    }




}


