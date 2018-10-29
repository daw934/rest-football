package pl.example.restfootball.model.service;


import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import pl.example.restfootball.model.newv2model.Example;

@Service
public class FootballService implements pl.example.restfootball.model.service.Service{
    public static final String serieATeams = "http://api.football-data.org/v1/competitions/456/teams";
    public static final String serieATable = "http://api.football-data.org/v1/competitions/456/leagueTable";
    public static final String serieATableN = "http://api.football-data.org/v2/competitions/SA/standings";


    @Override
    public Example getTable1(){
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set("X-Auth-Token","e62b55062bc74ffb85a000d6d42e6803");
        HttpEntity httpEntity = new HttpEntity("parameters",httpHeaders);
        ResponseEntity<Example> exampleResponseEntity =restTemplate.exchange(serieATableN, HttpMethod.GET,httpEntity,Example.class);
        System.out.println(exampleResponseEntity.getBody().getStandings().get(0).getTable().get(0).getPoints());
        return exampleResponseEntity.getBody();
    }

    @Override
    public pl.example.restfootball.model.newv2model.Table getTable2() {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set("X-Auth-Token","e62b55062bc74ffb85a000d6d42e6803");
        HttpEntity httpEntity = new HttpEntity("parameters",httpHeaders);
        ResponseEntity<pl.example.restfootball.model.newv2model.Table> exampleResponseEntity =restTemplate.exchange(serieATableN, HttpMethod.GET,httpEntity, pl.example.restfootball.model.newv2model.Table.class);
//        System.out.println(exampleResponseEntity.getBody()
        return exampleResponseEntity.getBody();

    }
}

