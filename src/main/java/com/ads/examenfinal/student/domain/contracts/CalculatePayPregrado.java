package com.ads.examenfinal.student.domain.contracts;

import com.ads.examenfinal.student.domain.entites.PregradoStudent;
import com.ads.examenfinal.student.domain.entites.Student;

public class CalculatePayPregrado implements CalculatePay{

	@Override
	public long calculate(Student student) {
		// TODO Auto-generated method stub
		return 100;
	}

	@Override
	public boolean IsMatch(Student student) {
		if(student instanceof PregradoStudent)
			return true;
		
		return false;
	}

}
