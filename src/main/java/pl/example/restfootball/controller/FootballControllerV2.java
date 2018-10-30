package pl.example.restfootball.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.example.restfootball.model.newv2model.RootObject;
import pl.example.restfootball.service.FootballService;

@Controller
@RequestMapping("/v2/league")
public class FootballControllerV2 {
    @Autowired
    FootballService footballService;


    @GetMapping("/{league}/table")
    public String getTable(@PathVariable String league, Model model){
        RootObject rootObject = footballService.getTableV2(league);
        model.addAttribute("tables", rootObject.getStandings().get(0).getTable());
        return "table";
    }

}

