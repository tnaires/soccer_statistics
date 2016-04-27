package com.uninassau.soccer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.uninassau.soccer.model.Team;
import com.uninassau.soccer.repository.Teams;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
public class Index {
	private final Teams teams;
	
	@Autowired
	public Index(Teams teams) {
		this.teams = teams;
	}
	
	@ApiOperation(value = "Get all soccer statistics")
	@ApiResponses({
		@ApiResponse(code = 200, message = "Statistics for all the teams")
	})
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public Iterable<Team> getSoccerStatistics() {
		return teams.findAll();
	}
}
