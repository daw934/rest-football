package pl.example.restfootball.model.service;

import pl.example.restfootball.model.newmodel.Table;
import pl.example.restfootball.model.newv2model.Example;

public interface Service {

    Table getTeams();
    Example getTable1();
    pl.example.restfootball.model.newv2model.Table getTable2();

}
