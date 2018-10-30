package pl.example.restfootball.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.example.restfootball.model.v1model.Example;
import pl.example.restfootball.service.FootballService;

@Controller
@RequestMapping("/v1/league")
public class FootballControllerV1 {

    FootballService footballService;

    @Autowired
    public FootballControllerV1(FootballService footballService) {
        this.footballService = footballService;
    }

    @GetMapping("/{league}/table")
    public String getTableV1(@PathVariable String league, Model model){
        Example example = footballService.getTableV1(league);
        model.addAttribute("caption",example.getLeagueCaption());
        model.addAttribute("tables", example.getStanding());
        return "tablev1";
    }
}
