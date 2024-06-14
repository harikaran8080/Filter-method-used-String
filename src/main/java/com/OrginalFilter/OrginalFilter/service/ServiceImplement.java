package com.OrginalFilter.OrginalFilter.service;

import java.util.List;

import com.OrginalFilter.OrginalFilter.dto.StudentDto;

public interface ServiceImplement {

	StudentDto post(StudentDto dto);

	List<StudentDto> postall(List<StudentDto> dto);

//	StudentDto get(String studentName);

	List<StudentDto> getall();

	StudentDto update(StudentDto dto);

	String delete(int studentId);

	List<StudentDto> getz(String studentname);

	List<Object> getzz(Object key);

	List<Object> give(Object list);

	List<Object> gett(String word);

	


}
