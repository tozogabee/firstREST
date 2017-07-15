package com.soterline.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainSiteController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/other")
    public String main2()
    {
        return "othersite5_10";
    }


}