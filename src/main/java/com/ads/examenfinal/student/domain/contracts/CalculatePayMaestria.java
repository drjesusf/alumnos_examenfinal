package com.ads.examenfinal.student.domain.contracts;

import com.ads.examenfinal.student.domain.entites.MastriaStudent;
import com.ads.examenfinal.student.domain.entites.Student;

public class CalculatePayMaestria implements CalculatePay{

	@Override
	public long calculate(Student student) {
		// TODO Auto-generated method stub
		return 200;
	}

	@Override
	public boolean IsMatch(Student student) {
		if(student instanceof MastriaStudent)
			return true;
		
		return false;
	}

}
