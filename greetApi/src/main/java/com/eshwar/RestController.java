package com.eshwar;

import org.springframework.web.bind.annotation.GetMapping;


@org.springframework.web.bind.annotation.RestController
public class RestController {
    @GetMapping("/greet")
    public String Greet(){
        String a="good news u r in greet page ";
        return a;
    }
//    merge
}
