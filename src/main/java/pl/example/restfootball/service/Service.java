package pl.example.restfootball.service;


import pl.example.restfootball.model.newv2model.RootObject;
import pl.example.restfootball.model.v1model.Example;

public interface Service {


    RootObject getTableV2(String league);
    Example getTableV1(String league);

}
