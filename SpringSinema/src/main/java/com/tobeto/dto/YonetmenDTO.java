package com.tobeto.dto;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class YonetmenDTO {
	private String ad;
	private List<FilmDTO> filmler = new ArrayList<FilmDTO>();
}
