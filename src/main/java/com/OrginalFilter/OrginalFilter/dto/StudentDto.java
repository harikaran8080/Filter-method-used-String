package com.OrginalFilter.OrginalFilter.dto;

import com.OrginalFilter.OrginalFilter.entity.StudentMark;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class StudentDto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studentId;
	
	private String studentName;
	
	private int classs;
	
	private StudentMark mark;

}
