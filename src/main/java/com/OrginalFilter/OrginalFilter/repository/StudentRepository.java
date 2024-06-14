package com.OrginalFilter.OrginalFilter.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.OrginalFilter.OrginalFilter.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

	@Query(value = "select student.student_name,student.classs,student_mark.total_mark "
			+ "from student inner join student_mark on student.mark_id=student_mark.mark_id"
			+ " where student.student_name like%:key% or student.classs like %:key% or"
			+ "  student_mark.total_mark like %:key% ", nativeQuery = true)
	List<Object> findByKey(Object key);

	@Query(value = "select student.student_name,student.classs,student_mark.total_mark "
			+ "from student inner join student_mark on student.mark_id=student_mark.mark_id"
			+ " where student.student_name like %:list% or student.classs like %:list% or "
			+ "student_mark.total_mark like %:list% ", nativeQuery = true)
	List<Object> findByObj(Object list);
     
	@Query(value = "select s.student_name,s.classs,m.total_mark "+
	    "from student s inner join student_mark m on s.mark_id=m.mark_id "+
			"where s.student_name like %:word% or s.classs like %:word% or m.total_mark like %:word% ",nativeQuery = true)
	List<Object> findByWord(String word);
	

}
