package pl.example.restfootball.service;


import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import pl.example.restfootball.model.newv2model.RootObject;
import pl.example.restfootball.model.v1model.Example;

import java.util.HashMap;
import java.util.Map;

@Service
public class FootballService implements pl.example.restfootball.service.Service{
    private Map<String,String> adressV2;
    private Map<String,String> adressV1;



    public FootballService() {
        this.adressV2 = new HashMap<>();
        this.adressV2.put("seriea","http://api.football-data.org/v2/competitions/SA/standings");
        this.adressV2.put("premierleague","http://api.football-data.org/v2/competitions/PL/standings");
        this.adressV1 = new HashMap<>();
        this.adressV1.put("seriea","http://api.football-data.org/v1/competitions/456/leagueTable");
        this.adressV1.put("premierleague","http://api.football-data.org/v1/competitions/445/leagueTable");


    }

    @Override
    public RootObject getTableV2(String league){
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set("X-Auth-Token","e62b55062bc74ffb85a000d6d42e6803");
        HttpEntity httpEntity = new HttpEntity("parameters",httpHeaders);
        ResponseEntity<RootObject> exampleResponseEntity =restTemplate.exchange(adressV2.get(league), HttpMethod.GET,httpEntity,RootObject.class);
        System.out.println(exampleResponseEntity.getBody().getStandings().get(0).getTable().get(0).getPoints());
        return exampleResponseEntity.getBody();
    }

    @Override
    public Example getTableV1(String league) {
        RestTemplate restTemplate = new RestTemplate();
//        HttpHeaders httpHeaders = new HttpHeaders();
//        httpHeaders.set("X-Auth-Token","e62b55062bc74ffb85a000d6d42e6803");
//        HttpEntity httpEntity = new HttpEntity("parameters",httpHeaders);
//        RootObject rootObject = restTemplate.getForObject(adressV2.get(league),RootObject.class);
        Example example = restTemplate.getForObject(adressV1.get(league),Example.class);
//        ResponseEntity<RootObject> exampleResponseEntity =restTemplate.exchange(adressV2.get(league), HttpMethod.GET,httpEntity,RootObject.class);
//        System.out.println(exampleResponseEntity.getBody().getStandings().get(0).getTable().get(0).getPoints());
        return example;
    }
}

