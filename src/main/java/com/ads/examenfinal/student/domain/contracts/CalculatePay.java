package com.ads.examenfinal.student.domain.contracts;

import com.ads.examenfinal.student.domain.entites.Student;

public interface CalculatePay {
	long calculate(Student student);
}
