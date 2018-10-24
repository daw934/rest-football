package pl.example.restfootball.model.service;

import org.junit.jupiter.api.Test;
import pl.example.restfootball.model.newmodel.Table;
import pl.example.restfootball.model.newnewmodel.Example;


class FootballServiceTest {

    @Test
    void getTeams() {
        FootballService footballService = new FootballService();
//         = footballService.getTeams();
    }
    @Test
    void getTable() {
        FootballService footballService = new FootballService();
//        Table table =footballService.getTeams();
//        table.getTeams().forEach(object -> System.out.println(object.getName()));
//        table.getTeams().get(0);
        Example example = footballService.getTable1();

        example.getStanding().forEach(a-> System.out.println(a.getTeamName()));
//        table.getTeams().forEach(object -> System.out.println(object.getName()));
//        table.getTeams().get(0);
    }
}