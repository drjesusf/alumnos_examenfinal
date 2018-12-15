package com.ads.examenfinal.student.domain.entites;

import com.ads.examenfinal.student.domain.enums.EnumStudenType;

public abstract class Student {
	private long id;
	private String firstName;	
	private String lastName;
	private String identityDocument;
	private long amount;
	private EnumStudenType studenType;
	
	public EnumStudenType getStudenType() {
		return studenType;
	}
	public void setStudenType(EnumStudenType studenType) {
		this.studenType = studenType;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getIdentityDocument() {
		return identityDocument;
	}
	public void setIdentityDocument(String identityDocument) {
		this.identityDocument = identityDocument;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	
}

