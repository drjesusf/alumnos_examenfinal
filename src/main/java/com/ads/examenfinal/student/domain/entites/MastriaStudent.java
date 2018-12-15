package com.ads.examenfinal.student.domain.entites;

import com.ads.examenfinal.student.domain.enums.EnumStudenType;

public class MastriaStudent extends Student{
	public MastriaStudent() {
		super.setStudenType(EnumStudenType.MAESTRIA);
	}
}
