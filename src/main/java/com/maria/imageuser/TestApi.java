package com.maria.imageuser;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestApi {

    @GetMapping("/test1")
    public String test1(){
        return "hello";
    }

    @GetMapping("/test2")
    public String test2(){
        return "";
    }

    @GetMapping("/test3")
    public String test3(){
        return "";
    }
}
