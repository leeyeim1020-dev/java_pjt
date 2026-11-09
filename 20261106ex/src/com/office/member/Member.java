package com.office.member;

public class Member {

	String memberId;
	String memberPw;
	String memberMail;
	String memberPhone;
	
	public Member() {
	
	}

	public Member(String memberId, String memberPw, String memberMail, String memberPhone) {
		super();
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberMail = memberMail;
		this.memberPhone = memberPhone;
	}
	
	public void printInfo() {
		System.out.println("Member ID: " + memberId);
		System.out.println("Member PW: " + memberPw);
		System.out.println("Member MAIL: " + memberMail);
		System.out.println("Member PHONE: " + memberPhone);
	}
	
	
}
