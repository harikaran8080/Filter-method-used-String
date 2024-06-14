package com.OrginalFilter.OrginalFilter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.OrginalFilter.OrginalFilter.dto.StudentDto;
import com.OrginalFilter.OrginalFilter.service.ServiceImplement;

@RestController
@RequestMapping("/Student/Mark/api")
public class StudentController {
	
	@Autowired
	private ServiceImplement implement;
	
	
	@PostMapping("/post")
	public StudentDto post(@RequestBody StudentDto dto) {
		return implement.post(dto);
	}
	
	@PostMapping("/postall")
	public List<StudentDto>postall(@RequestBody List<StudentDto> dto){
		return implement.postall(dto);
	}
	
//	@GetMapping("/get/{studentName}")
//	public StudentDto get(@PathVariable String studentName) {
//		return implement.get(studentName);
//	}
	
	
	@GetMapping("/getall")
	public List<StudentDto>getall(){
		return implement.getall();
	}
	
	
	@PutMapping("/update")
	public StudentDto update(@RequestBody StudentDto dto) {
		return implement.update(dto);
	}
	
	@DeleteMapping("/delete/{studentId}")
	public String delete(@PathVariable int studentId) {
		return implement.delete(studentId);
	}
	
	@GetMapping("/getzz")
	public List<Object>getzz(@RequestParam (value = "key") Object key){
		return implement.getzz(key);
	}
	
	@GetMapping("/getquery")
	public List<Object>give(@RequestParam (value = "list") Object list){
		return implement.give(list);
	}

	@GetMapping("/gett/{word}")
	public List<Object>gett(@PathVariable (value = "word")String word){
		return implement.gett(word);
	}
	


	

}
