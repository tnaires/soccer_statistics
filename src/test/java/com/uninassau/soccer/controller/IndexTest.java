package com.uninassau.soccer.controller;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.uninassau.soccer.repository.Teams;

@RunWith(MockitoJUnitRunner.class)
public class IndexTest {
	@Mock
	private Teams teams;

	@InjectMocks
	private Index index;

	@Test
	public void shouldFetchTeamsFromRepository() {
		teams = mock(Teams.class);
		index = new Index(teams);

		index.getSoccerStatistics();

		verify(teams).findAll();
	}
}
