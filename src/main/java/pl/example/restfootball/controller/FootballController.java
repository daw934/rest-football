package pl.example.restfootball.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import pl.example.restfootball.model.newv2model.Example;
import pl.example.restfootball.model.service.FootballService;

@Controller
public class FootballController {
    @Autowired
    FootballService footballService;
    public static final String serieA = "http://api.football-data.org/v1/competitions/456/teams";
//    @GetMapping("/teams")
//    public String getTeams(Model model){
//        Table table = footballService.getTeams();
//        System.out.println(table.getTeams().get(0).getName());
//        model.addAttribute("teams",table);
//        return "main";
//    }
    @GetMapping("/table")
    public String getTable(Model model){
        Example example = footballService.getTable1();
        model.addAttribute("tables",example.getStandings().get(0).getTable());
        return "table";
    }
}

