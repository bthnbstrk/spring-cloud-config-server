package com.example.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class ConfigController {


    @Value("${main.site}")
    private String mainSite;

    @GetMapping("/getMainSite")
    public String getMainSite(){
        return mainSite;
    }

}
