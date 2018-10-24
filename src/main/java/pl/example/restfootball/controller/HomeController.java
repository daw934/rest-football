package pl.example.restfootball.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import pl.example.restfootball.model.newmodel.Table;
import pl.example.restfootball.model.service.FootballService;

@Controller
public class HomeController {

    @Autowired
    FootballService footballService;
    public static final String serieA = "http://api.football-data.org/v1/competitions/456/teams";
    @GetMapping("/seriea")
     public void getTable(){
        Table table = footballService.getTeams();
        System.out.println(table.getTeams().get(0).getName());
    }
}
