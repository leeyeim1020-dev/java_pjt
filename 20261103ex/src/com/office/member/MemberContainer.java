package com.office.member;

public class MemberContainer {
	
	final private MemberController MEMBER_CONTROLLER = new MemberController();
	final private MemberService MEMBER_SERVICE = new MemberService();
	final private MemberDao MEMBER_DAO = new MemberDao();
	
	private static MemberContainer memberContainer;
	
	private MemberContainer() {}
	
	public static MemberContainer getInstance() {
		if (memberContainer == null) {
			memberContainer = new MemberContainer();
		}
	
	public MemberService getMemberService() {
		return memberService;
	}

	public MemberDao getMemberDao() {
		return memberDao;
	}
		
		return memberContainer;
	}

	public static MemberContainer getMemberContainer() {
		return memberContainer;
	}



}
