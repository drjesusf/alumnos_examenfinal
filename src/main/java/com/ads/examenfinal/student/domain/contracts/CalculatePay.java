package com.ads.examenfinal.student.domain.contracts;

import com.ads.examenfinal.student.domain.entites.Student;

public interface CalculatePay {
	boolean IsMatch(Student student);
	long calculate(Student student);
}
