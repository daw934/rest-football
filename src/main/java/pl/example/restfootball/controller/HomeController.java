package pl.example.restfootball.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
//@RequestMapping(path =)
public class HomeController {

    @GetMapping("/v2")
    public String getV2age(){
        return "resttablev2";
    }
    @GetMapping("/v1")
    public String getV1Page(){
        return "resttablev1";
    }
    @GetMapping()
    public String getMainPage(){
        return "mainPage";
    }
}
