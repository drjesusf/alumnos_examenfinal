package com.ads.examenfinal.student.domain.entites;

import com.ads.examenfinal.student.domain.enums.EnumStudenType;

public class PregradoStudent extends Student{
	
	public PregradoStudent() {
		super.setStudenType(EnumStudenType.PREGRADO);
	}
}
