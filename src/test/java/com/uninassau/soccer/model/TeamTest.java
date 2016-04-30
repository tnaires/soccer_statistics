package com.uninassau.soccer.model;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class TeamTest {
	@Test
	public void equalsAndHashCodeShouldCheckTeamNameOnly() {
		Team team = new Team("Team", 1, 1, 1, 1, 1);
		Team sameTeam = new Team("Team", 2, 2, 2, 2, 2);
		Team differentTeam = new Team("Different team", 1, 1, 1, 1, 1);

		assertThat(team, is(sameTeam));
		assertThat(team, is(not(differentTeam)));

		assertThat(team.hashCode(), is(sameTeam.hashCode()));
		assertThat(team.hashCode(), is(not(differentTeam.hashCode())));
	}
	
	@Test
	public void shouldReturnCalculatedInformation() {
		Team team = new Team("Time", 10, 5, 3, 10, 10);
		
		assertThat(team.getTotalGames(), is(18));
		assertThat(team.getAmountOfPoints(), is(35));
		assertThat(team.getGoalsDifference(), is(0));
	}
}








