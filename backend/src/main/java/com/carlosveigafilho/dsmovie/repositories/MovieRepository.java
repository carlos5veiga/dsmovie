package com.carlosveigafilho.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carlosveigafilho.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

}
