package pl.example.restfootball.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.example.restfootball.model.newv2model.RootObject;
import pl.example.restfootball.service.Service;
import pl.example.restfootball.model.v1model.Example;

@RestController
@RequestMapping(path = "api/v2/league")
public class FootballRestController {


    private Service service;

    @Autowired
    public FootballRestController(Service service) {
        this.service = service;
    }

    @CrossOrigin
    @GetMapping("/{id}/table")
    public ResponseEntity getTableV2(@PathVariable String id){

        RootObject rootObject = service.getTableV2(id);
        System.out.println("tutaj");
        return new ResponseEntity(rootObject.getStandings().get(0).getTable(), HttpStatus.OK);
    }


}
