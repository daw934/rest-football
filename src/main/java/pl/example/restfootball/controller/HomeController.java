package pl.example.restfootball.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.example.restfootball.model.newmodel.Table;
import pl.example.restfootball.model.newv2model.Example;
import pl.example.restfootball.model.service.FootballService;

@RestController
//@RequestMapping(path =)
public class HomeController {

    @Autowired
    FootballService footballService;
    public static final String serieA = "http://api.football-data.org/v1/competitions/456/teams";

    @GetMapping("/teams1")
     public ResponseEntity getTeams(){
        Table table = footballService.getTeams();
        System.out.println(table.getTeams().get(0).getName());
        return new ResponseEntity(table, HttpStatus.OK);
    }
    @CrossOrigin
    @GetMapping("/seriea/table")
    public ResponseEntity getTable(){
        Example example = footballService.getTable1();
        pl.example.restfootball.model.newv2model.Table table = footballService.getTable2();
        System.out.println("tutaj");
        return new ResponseEntity(table, HttpStatus.OK);
    }

}
