package com.OrginalFilter.OrginalFilter.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.OrginalFilter.OrginalFilter.entity.Student;



@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{
//	@Query(value = "select s.studentName as StudentName,"
//			+"s.classs as StudentClasss,"
//			+"s.mark as StudentMark,"
//			+"sm.tamil as StudentMarkTamil,"
//			+"sm.english as StudentMarkEnglish,"
//			+ "sm.maths as StudentMarkMaths,"
//			+ "sm.science as StudentMarkScience,"
//			+ "sm.socialscience as StudentMarkSocialscience,"
//			+ "from student s inner join studentmark sm on s.studentId=sm.id where s.name=:studentName,",nativeQuery = true)
//	
	
	@Query(value = "SELECT s FROM Student s WHERE s.name = :studentName",nativeQuery = true)

	Student findByStudentName(String studentName);


	


}
