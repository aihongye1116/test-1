package com.example.springboot002;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class aa {


    @RequestMapping("/aa")
    public String aa(){
        System.out.println("aa");
        return "jsp/success";

    }

    @RequestMapping("/bb")
    public String bb(){
        System.out.println("bb");
        return "view/list";

    }








}
