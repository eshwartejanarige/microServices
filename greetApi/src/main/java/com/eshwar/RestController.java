package com.eshwar;

import org.springframework.web.bind.annotation.GetMapping;


@org.springframework.web.bind.annotation.RestController
public class RestController {
    @GetMapping("/greet")
    public String Greet(){
        String a="good news u r in greet page ";
        return a;
    }
    @GetMapping("/math")
    public int math(){
        int a=20;
        int b=30;
        return a*b;
    }
    @GetMapping("/test")
    public String test(){
        return "u r in a test in greetApi";
    }
}
