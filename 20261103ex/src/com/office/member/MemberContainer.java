package com.office.member;

public class MemberContainer {
	
	final private MemberDao MEMBER_DAO = new MemberDao();
	final private MemberService MEMBER_SERVICE = new MemberService();
	final private MemberController MEMBER_CONTROLLER = new MemberController();
	
	
	
	private static MemberContainer memberContainer;
	
	private MemberContainer() {}
	
	public static MemberContainer getInstance() {
		if (memberContainer == null) {
			memberContainer = new MemberContainer();
		}
		
		return memberContainer;
		
	}
	
	
	public MemberController getMemberContainer() {
		return MEMBER_CONTROLLER;
	}
	
	public MemberService getMemberService() {
		return MEMBER_SERVICE;
	}

	public MemberDao getMemberDao() {
		return MEMBER_DAO;
	}



}
