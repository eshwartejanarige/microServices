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
    @GetMapping("/products")
    public String Products(){
        return "products are in progress";
    }
    @GetMapping("/students")
    public String Students(){
        return "there are 32 students in my java class";
    }
    @GetMapping("/IDE")
    public String Ide(){
        return "intellij";
    }
    @GetMapping("/1")
    public String number(){
        return "1st";
    }

}
