package com.uninassau.soccer.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.uninassau.soccer.model.Team;

@Repository
public interface Teams extends CrudRepository<Team, Long> {

}
