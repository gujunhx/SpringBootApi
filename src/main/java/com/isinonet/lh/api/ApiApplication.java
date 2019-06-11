package com.isinonet.lh.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@SpringBootApplication
@RestController
public class ApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);
    }

    @GetMapping("/hello")
    public String hello(@RequestParam Map<String,String> params){
        System.out.println(params);
        return "hello=====================";
    }

    @PostMapping("/myapi")
    public String cutContent(@RequestBody Map param){
        return DealWith.getContent(param);
    }

}
