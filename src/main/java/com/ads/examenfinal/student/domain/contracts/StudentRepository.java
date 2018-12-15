package com.ads.examenfinal.student.domain.contracts;

import java.util.List;

import com.ads.examenfinal.student.domain.entites.Student;

public interface StudentRepository {
	List<Student> get(int page,int pageSize);

	Student getById(int studentId);
}
