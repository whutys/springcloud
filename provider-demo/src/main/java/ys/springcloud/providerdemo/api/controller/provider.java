package ys.springcloud.providerdemo.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class provider {

    @RequestMapping("/provide")
    public String provide(){
        return "provider";
    }
}
