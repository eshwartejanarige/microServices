package com.eshwar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class WelcomeApi {
    @Autowired
    GreetClient greetClient;
    @GetMapping("/welcome")
    public String Welcome(){
        String a="u r in................ welcomeApi ";
        String msg=greetClient.invokeGreet();
        return a + ".........."+msg;
    }
}
