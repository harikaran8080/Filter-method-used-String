package com.OrginalFilter.OrginalFilter.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OrginalFilter.OrginalFilter.dto.StudentDto;
import com.OrginalFilter.OrginalFilter.entity.Student;
import com.OrginalFilter.OrginalFilter.repository.StudentRepository;

@Service
public class StudentService implements ServiceImplement {

	@Autowired
	private StudentRepository repository;

	@Override
	public StudentDto post(StudentDto dto) {
		Student student = new Student();
		student.setClasss(dto.getClasss());
		student.setMark(dto.getMark());
		student.setStudentId(dto.getStudentId());
		student.setStudentName(dto.getStudentName());
		repository.save(student);
		return dto;

	}

	@Override
	public List<StudentDto> postall(List<StudentDto> dto) {
		List<Student> list = new ArrayList<Student>();
		for (StudentDto studentDto : dto) {
			Student student = new Student();
			student.setClasss(studentDto.getClasss());
			student.setMark(studentDto.getMark());
			student.setStudentId(studentDto.getStudentId());
			student.setStudentName(studentDto.getStudentName());
			list.add(student);
		}
		List<Student> list2 = repository.saveAll(list);
		List<StudentDto> dtos = new ArrayList<StudentDto>();
		for (Student student : list2) {
			StudentDto ddo = new StudentDto();
			ddo.setClasss(student.getClasss());
			ddo.setMark(student.getMark());
			ddo.setStudentId(student.getStudentId());
			ddo.setStudentName(student.getStudentName());
			dtos.add(ddo);

		}
		return dtos;

	}

//	@Override
//	public StudentDto get(String studentName) {
//		Student student=repository.findByStudentName(studentName);
//		StudentDto dto=new StudentDto();
//		dto.setClasss(student.getClasss());
//		dto.setMark(student.getMark());
//		dto.setStudentId(student.getStudentId());
//		dto.setStudentName(student.getStudentName());
//		return dto;
//		
//	}

	@Override
	public List<StudentDto> getall() {
		List<Student>list=repository.findAll();
		List<StudentDto>dtos=new ArrayList<StudentDto>();
		for(Student student:list) {
			StudentDto dto=new StudentDto();
			dto.setClasss(student.getClasss());
			dto.setMark(student.getMark());
			dto.setStudentId(student.getStudentId());
			dto.setStudentName(student.getStudentName());
			dtos.add(dto);
			
		}return dtos;
		
	}

	@Override
	public StudentDto update(StudentDto dto) {
		Optional<Student>optional=repository.findById(dto.getStudentId());
		Student student=optional.get();
		student.setClasss(dto.getClasss());
		student.setMark(dto.getMark());
		student.setStudentId(dto.getStudentId());
		student.setStudentName(dto.getStudentName());
		repository.save(student);
		return dto;
		
	}

	@Override
	public String delete(int studentId) {
		repository.deleteById(studentId);
		return "Successsfully Deleted";
	}

	@Override
	public List<StudentDto> getz(String studentname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Object> getzz(Object key) {
		return repository.findByKey(key);
	}

	@Override
	public List<Object> give(Object list) {
		return repository.findByObj(list);
	}

	@Override
	public List<Object> gett(String word) {
		return repository.findByWord(word);
	}




}
