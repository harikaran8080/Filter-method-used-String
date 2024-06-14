package com.OrginalFilter.OrginalFilter.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "student_mark")
public class StudentMark {
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private int markId;
	
	private String totalMark;
	

}
