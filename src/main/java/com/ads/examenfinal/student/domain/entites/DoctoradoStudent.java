package com.ads.examenfinal.student.domain.entites;

import com.ads.examenfinal.student.domain.enums.EnumStudenType;

public class DoctoradoStudent extends Student{
	public DoctoradoStudent() {
		super.setStudenType(EnumStudenType.DOCTORADO);
	}
}
