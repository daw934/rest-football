package pl.example.restfootball.model.service;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import pl.example.restfootball.model.newv2model.Example;

import java.util.Arrays;


class FootballServiceTest {

//    @Test
//    void getTeams() {
//        FootballService footballService = new FootballService();
//         Table table= footballService.getTeams();
//        assertNotNull(table);
//    }
    @Test
    void getTable() {
        FootballService footballService = new FootballService();
//        Table table =footballService.getTeams();
//        table.getTeams().forEach(object -> System.out.println(object.getName()));
//        table.getTeams().get(0);
//        Example example = footballService.getTable1();


//        example.getStanding().forEach(a-> System.out.println(a.getTeamName()));
//        table.getTeams().forEach(object -> System.out.println(object.getName()));
//        table.getTeams().get(0);
//        assertNotNull(example);
       String serieATableN = "http://api.football-data.org/v2/competitions/SA/standings";


        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set("X-Auth-Token","e62b55062bc74ffb85a000d6d42e6803");
//        httpHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
//        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
//        HttpEntity<String> entity = new HttpEntity<>("parameters", httpHeaders);
//        ResponseEntity<Example> exampleResponseEntity =restTemplate.exchange(serieATableN, HttpMethod.GET,entity,Example.class);
       HttpEntity httpEntity = new HttpEntity("parameters",httpHeaders);
        ResponseEntity<Example> exampleResponseEntity =restTemplate.exchange(serieATableN, HttpMethod.GET,httpEntity,Example.class);

//        Example example1 = exampleResponseEntity.getBody();
//        HttpEntity httpEntity = new HttpEntity();
//        restTemplate.exchange(serieATableN,HttpMethod.GET,)
        System.out.println(exampleResponseEntity.getBody().getStandings().get(0).getTable().get(0).getPoints());

    }
}