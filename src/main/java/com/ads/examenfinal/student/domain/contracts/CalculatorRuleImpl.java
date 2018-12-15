package com.ads.examenfinal.student.domain.contracts;

import java.util.ArrayList;
import java.util.List;

import com.ads.examenfinal.student.domain.entites.Student;

public class CalculatorRuleImpl implements CalculatorRule {
	private List<CalculatePay> rules; 
	
	public CalculatorRuleImpl() {
		rules = new ArrayList<CalculatePay>();
		rules.add(new CalculatePayPregrado());
		rules.add(new CalculatePayMaestria());
		rules.add(new CalculatePayDoctorado());
	}
	@Override
	public long calculateMontoBeca(Student student) {
		long montoBeca = 0;
        if (student == null) return 0;

        montoBeca = rules.stream().filter(x->x.IsMatch(student)).findFirst().get().calculate(student);

        return montoBeca;
	}
	
}
