package com.tssa301.movieflix.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tssa301.movieflix.entities.Review;

public interface ReviewRepository extends JpaRepository<Review, Long> {

}
