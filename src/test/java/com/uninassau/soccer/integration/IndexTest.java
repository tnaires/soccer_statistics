package com.uninassau.soccer.integration;

import static org.hamcrest.Matchers.hasItemInArray;
import static org.junit.Assert.assertThat;

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

	private Team savedTeam;
	private RestTemplate restTemplate;

	@Before
	public void setUp() {
		restTemplate = new TestRestTemplate();

		savedTeam = new Team("Team 1", 1, 1, 1, 1, 1);
		teams.save(savedTeam);
	}

	@Test
	public void shouldRenderSoccerStatisticsAsJSON() {
		Team[] returnedTeams = restTemplate.getForObject("http://localhost:8080", Team[].class);

		assertThat(returnedTeams, hasItemInArray(savedTeam));
	}
}
