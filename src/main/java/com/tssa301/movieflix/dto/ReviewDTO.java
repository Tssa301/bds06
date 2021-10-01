package com.tssa301.movieflix.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.tssa301.movieflix.entities.Review;

public class ReviewDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String text;
	private Long movieId;
	
	List<UserDTO> list = new ArrayList<>();
	
	public ReviewDTO() {
	}

	public ReviewDTO(Long id, String text, Long movieId) {
		this.id = id;
		this.text = text;
		this.movieId = movieId;
	}
	
	public ReviewDTO(Review entity) {
		id = entity.getId();
		text = entity.getText();
		movieId = entity.getMovie().getId();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Long getMovieId() {
		return movieId;
	}

	public void setMovieId(Long movieId) {
		this.movieId = movieId;
	}

	public List<UserDTO> getList() {
		return list;
	}
}
