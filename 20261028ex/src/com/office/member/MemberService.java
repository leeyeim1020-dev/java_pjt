package com.office.member;

import java.util.Scanner;

public class MemberService {
	
	
	// 속성
	MemberDB db;
	// 생성자
	public MemberService(MemberDB memberDB) {
		this.db = memberDB;
	}
	
	// 메서드
	/*
	 * 회원 가입
	 */
	public void doSignUp(Scanner scanner) {
		
		System.out.println("Input new member ID");
		String memberId = scanner.next();
		
		System.out.println("Input new member PW");
		String memberPw = scanner.next();
		
		System.out.println("Input new member MAIL");
		String memberMail = scanner.next();
		
		System.out.println("Input new member PHONE");
		String memberPhone = scanner.next();
		
		Member member = new Member(memberId, memberPw, memberMail, memberPhone);
		// MemberDB db = new MemberDB();
		
		db.memberDB.put(memberId, member);
		
		db.memberDB.get(memberId).printInfo();
		
		/*
		 * 과제4: ID 중복 체크 기능 추가
		 * 과제5: 비밀번호는 8~12 문자로 표현
		 */
	}

	/*
	 * 로그인
	 */
	public void doSignIn(Scanner scanner) {
		System.out.println("Input new member ID");
		String memberId = scanner.next();
			
		System.out.println("Input new member PW");
		String memberPw = scanner.next();
			
		// MemberDB db = new MemberDB();
		Member searchedMember = db.memberDB.get(memberId);
			
		// searchedMember: Member or null
		if (searchedMember != null) {
			
			if (searchedMember.memberPw.equals(memberPw)) {
				System.out.println("SIGN-IN SUCCESS!!");
				
			} else {
				System.out.println("SIGN-IN FAIL!!");
					
			}
				
		} else {
			System.out.println("SIGN-IN FAIL!!");
		}
		
		/*
		 * 과제6: 로그인 실패가 3회 초과되면 시스템 종료
		 */
	}
	
	/*
	 * 정보 수정
	 */
	public void doModify(Scanner scanner) {
		
		System.out.println("Input member ID");
		String memberId = scanner.next();
		
		System.out.println("Input member PW");
		String memberPw = scanner.next();
		
		System.out.println("Input member MAIL");
		String memberMail = scanner.next();
		
		System.out.println("Input member PHONE");
		String memberPhone = scanner.next();
		
		Member searchedMember = db.memberDB.get(memberId);
		searchedMember.memberPw = memberPw;
		searchedMember.memberMail = memberMail;
		searchedMember.memberPhone = memberPhone;
		
		// 로깅
		searchedMember = db.memberDB.get(memberId);
		searchedMember.printInfo();
		
//		System.out.println(searchedMember.memberId);
//		System.out.println(searchedMember.memberPw);
//		System.out.println(searchedMember.memberMail);
//		System.out.println(searchedMember.memberPhone);
	
		
		/*
		 * 과제7: ID, PW 인증 -> ok -> 정보 수정
		 */
	}
	
	
	public void doPrintAllMembers() {
		
		System.out.println("--- 전체 회원 정보 ---");

	    if (db.memberDB.isEmpty()) {
	        System.out.println("등록된 회원이 없습니다.");
	        return;
	    }
		
	    for (Member member : db.memberDB.values()) {
	        member.printInfo();
	        System.out.println("--------------------");
	    }
	}
	
	
	
	
	
	
	
	/*
	 * 회원 탈퇴
	 */
	public void doDelete(Scanner scanner) {
		
		System.out.println("Input member ID");
		String memberId = scanner.next();
		
		System.out.println("Input member PW");
		String memberPw = scanner.next();
		
		Member searchedMember = db.memberDB.get(memberId);
		
		if (searchedMember != null && searchedMember.memberPw.equals(memberPw)) {
			db.memberDB.remove(memberId);
		}
	}	
}
