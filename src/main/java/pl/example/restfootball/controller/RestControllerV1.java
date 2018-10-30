package pl.example.restfootball.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.example.restfootball.model.v1model.Example;
import pl.example.restfootball.service.Service;

@RestController
@RequestMapping(path = "/api/v1/league")
public class RestControllerV1 {

    private Service service;

    @Autowired
    public RestControllerV1(Service service) {
        this.service = service;
    }

    @CrossOrigin
    @GetMapping("/{id}/table")
    public ResponseEntity getTableV1(@PathVariable String id){

        Example example = service.getTableV1(id);
        System.out.println("tutaj");
        return new ResponseEntity(example.getStanding(), HttpStatus.OK);
    }
}
