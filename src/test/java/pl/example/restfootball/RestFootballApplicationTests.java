package pl.example.restfootball;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pl.example.restfootball.model.newmodel.Table;
import pl.example.restfootball.model.service.FootballService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RestFootballApplicationTests {

	@Autowired
	FootballService footballService;
	@Test
	public void contextLoads() {

	}

}