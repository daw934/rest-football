package pl.example.restfootball.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.example.restfootball.model.newv2model.Example;
import pl.example.restfootball.model.service.Service;

@RestController
public class FootballRestController {

    private Service service;

    @Autowired
    public FootballRestController(Service service) {
        this.service = service;
    }

    @CrossOrigin
    @GetMapping("/seriea/table")
    public ResponseEntity getTable(){
        Example example = service.getTable1();
        System.out.println("tutaj");
        return new ResponseEntity(example.getStandings().get(0).getTable(), HttpStatus.OK);
    }

}
