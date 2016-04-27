package com.uninassau.soccer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.uninassau.soccer.model.Team;
import com.uninassau.soccer.repository.Teams;

@RestController
public class Index {
	private final Teams teams;
	
	@Autowired
	public Index(Teams teams) {
		this.teams = teams;
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public Iterable<Team> getSoccerStatistics() {
		return teams.findAll();
	}
}
