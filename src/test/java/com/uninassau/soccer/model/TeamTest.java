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
}
