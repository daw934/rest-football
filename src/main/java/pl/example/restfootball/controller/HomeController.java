package pl.example.restfootball.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
//@RequestMapping(path =)
public class HomeController {

    @GetMapping
    public String getMainPage(){
        return "mainRest";
    }

//    @GetMapping("/teams1")
//     public ResponseEntity getTeams(){
//        Table table = footballService.getTeams();
//        System.out.println(table.getTeams().get(0).getName());
//        return new ResponseEntity(table, HttpStatus.OK);
//    }


}
