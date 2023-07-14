package com.rscruz.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rscruz.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
	
}
