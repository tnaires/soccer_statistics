package com.uninassau.soccer.integration;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

import com.uninassau.soccer.Application;
import com.uninassau.soccer.model.Team;
import com.uninassau.soccer.repository.Teams;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
@WebIntegrationTest
public class IndexTest {
	@Autowired
	private Teams teams;
	
	private List<Team> savedTeams = new ArrayList<>();
	
	private RestTemplate restTemplate = new TestRestTemplate();
	
	@Before
	public void setUp() {
		savedTeams.add(new Team("Team 1", 1, 1, 1, 1, 1, 1));
		savedTeams.add(new Team("Team 2", 2, 2, 2, 2, 2, 2));
		teams.save(savedTeams);
	}
	
	@Test
	public void shouldRenderSoccerStatisticsAsJSON() {
		Team[] returnedTeams = restTemplate.getForObject("http://localhost:8080", Team[].class);
		
		for (int i = 0; i < returnedTeams.length; i++) {
			assertThat(returnedTeams[i], is(savedTeams.get(i)));
		}
	}
}
