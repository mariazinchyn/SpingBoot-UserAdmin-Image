package com.maria.imageuser;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestApi {

    @GetMapping("/test1")
    public String test1(){
        return "hello for user";
    }

    @GetMapping("/test2")
    public String test2(){
        return "test2 for admin only";
    }

    @GetMapping("/test3")
    public String test3(){
        return "test3 for all";
    }
}
