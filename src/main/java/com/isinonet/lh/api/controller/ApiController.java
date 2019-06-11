package com.isinonet.lh.api.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/call")
    public String getApi(){
        RestTemplate restTemplate=new RestTemplate();
        return restTemplate.getForObject("http://localhost:8080/hello?hello=world",String.class);
    }

    @PostMapping("/callPost")
    public String postApi(){
        Map map = new HashMap();
        map.put("key1","大家饿哦个脑袋就");
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject("http://localhost:8080/test", map, String.class);
    }

    public static void main(String[] args) {
        String s = new ApiController().postApi();
        System.out.println(s);
    }

}
