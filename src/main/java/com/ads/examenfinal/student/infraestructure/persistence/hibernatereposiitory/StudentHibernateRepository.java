package com.ads.examenfinal.student.infraestructure.persistence.hibernatereposiitory;

import java.util.ArrayList;
import java.util.List;

import com.ads.examenfinal.student.domain.contracts.StudentRepository;
import com.ads.examenfinal.student.domain.entites.PregradoStudent;
import com.ads.examenfinal.student.domain.entites.Student;

public class StudentHibernateRepository implements StudentRepository{

	@Override
	public List<Student> get(int page, int pageSize) {
		List<Student> students = new ArrayList<Student>();
		return students;
	}

	@Override
	public Student getById(int studentId) {
		return new PregradoStudent();
		
	}

}
