package pl.example.restfootball.service;

import org.junit.jupiter.api.Test;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import pl.example.restfootball.model.newv2model.RootObject;


class FootballServiceTest {

//    @Test
//    void getTeams() {
//        FootballService footballService = new FootballService();
//         Table table= footballService.getTeams();
//        assertNotNull(table);
//    }
    @Test
    void getTable() {
        //FootballService footballService = new FootballService();
//        Table table =footballService.getTeams();
//        table.getTeams().forEach(object -> System.out.println(object.getName()));
//        table.getTeams().get(0);
//        RootObject example = footballService.getTable1();


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
//        ResponseEntity<RootObject> exampleResponseEntity =restTemplate.exchange(serieATableN, HttpMethod.GET,entity,RootObject.class);
       HttpEntity httpEntity = new HttpEntity("parameters",httpHeaders);
        ResponseEntity<RootObject> exampleResponseEntity =restTemplate.exchange(serieATableN, HttpMethod.GET,httpEntity,RootObject.class);

//        RootObject example1 = exampleResponseEntity.getBody();
//        HttpEntity httpEntity = new HttpEntity();
//        restTemplate.exchange(serieATableN,HttpMethod.GET,)
        System.out.println(exampleResponseEntity.getBody().getStandings().get(0).getTable().get(0).getPoints());

    }
}