package com.eshwar;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
@FeignClient(name="GREETAPI")
public interface GreetClient {
    @GetMapping("/greet")
    public String invokeGreet();
}
