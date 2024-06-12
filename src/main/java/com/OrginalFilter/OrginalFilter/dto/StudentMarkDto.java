package com.OrginalFilter.OrginalFilter.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class StudentMarkDto {
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private int id;
	
	private String Tamil;
	
	private String english;
	
	private String maths;
	
	private String science;
	
	private String socialscience;
	

}
