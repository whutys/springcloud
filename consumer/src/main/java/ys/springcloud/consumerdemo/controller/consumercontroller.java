package ys.springcloud.consumerdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class consumercontroller {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/consume")
    public String consume() {
        String result = restTemplate.getForObject("http://providerdemo/provide", String.class);
        return result;
    }
}
