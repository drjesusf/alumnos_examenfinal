package com.ads.examenfinal.student.application.service;

import java.util.List;


import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ads.examenfinal.student.application.dtos.StudentDto;
import com.ads.examenfinal.student.domain.contracts.StudentRepository;
import com.ads.examenfinal.student.domain.entites.Student;

import seedWork.Notification;

@Service
public class StudentApplicationService {
	@Autowired
	StudentRepository studentRepository;
	
	@Autowired
	private ModelMapper mapper;
	
	public List<StudentDto> get(int page, int pageSize) {
		Notification notification = this.getValidation(page, pageSize);
        if (notification.hasErrors()) {
            throw new IllegalArgumentException(notification.errorMessage());
        }
		List<Student> students = this.studentRepository.get(page, pageSize);
		List<StudentDto> studentsDto = mapper.map(students, new TypeToken<List<StudentDto>>() {}.getType());
        return studentsDto;
	}

	private Notification getValidation(int page, int pageSize) {
		Notification notification = new Notification();
		if (pageSize <0 || page<0) {
			notification.addError("Page size can not be less than 0");
		}
		return notification;
	}

	public long calculateMontoBeca(int studentId) {
		// TODO Auto-generated method stub
		Student student = this.studentRepository.getById(studentId);
		
		return 0;
	}
	
}
