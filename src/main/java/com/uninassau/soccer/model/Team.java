package com.uninassau.soccer.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Team {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private Integer won;
	private Integer drawn;
	private Integer lost;
	private Integer goalsFor;
	private Integer goalsAgainst;

	protected Team() {

	}

	public Team(String name, Integer won, Integer drawn, Integer lost, Integer goalsFor,
			Integer goalsAgainst) {
		this.name = name;
		this.won = won;
		this.drawn = drawn;
		this.lost = lost;
		this.goalsFor = goalsFor;
		this.goalsAgainst = goalsAgainst;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Integer getWon() {
		return won;
	}

	public Integer getDrawn() {
		return drawn;
	}

	public Integer getLost() {
		return lost;
	}

	public Integer getGoalsFor() {
		return goalsFor;
	}

	public Integer getGoalsAgainst() {
		return goalsAgainst;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Team other = (Team) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}
