package com.ads.examenfinal.student.domain.contracts;

import com.ads.examenfinal.student.domain.entites.DoctoradoStudent;
import com.ads.examenfinal.student.domain.entites.Student;

public class CalculatePayDoctorado implements CalculatePay{

	@Override
	public long calculate(Student student) {
		// TODO Auto-generated method stub
		return 300;
	}

	@Override
	public boolean IsMatch(Student student) {
		if(student instanceof DoctoradoStudent)
			return true;
		
		return false;
	}

}
