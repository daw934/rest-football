package pl.example.restfootball.model.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.example.restfootball.model.newmodel.Table;
import pl.example.restfootball.model.newnewmodel.Example;

@Service
public class FootballService implements pl.example.restfootball.model.service.Service{
    public static final String serieATeams = "http://api.football-data.org/v1/competitions/456/teams";
    public static final String serieATable = "http://api.football-data.org/v1/competitions/456/leagueTable";
    @Override
    public Table getTeams(){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serieATeams,Table.class);
    }
    @Override
    public Example getTable1(){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serieATable,Example.class);
    }
}
