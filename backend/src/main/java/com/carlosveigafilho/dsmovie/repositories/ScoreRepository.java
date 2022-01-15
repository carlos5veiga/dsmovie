package com.carlosveigafilho.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carlosveigafilho.dsmovie.entities.Score;
import com.carlosveigafilho.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK>{

}
