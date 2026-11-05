package com.office.diary;

public class DiaryAssembler {
	
	private static DiaryAssembler diaryAssembler;
	
	
	final private DiaryDao DIARY_DAO = new DiaryDao();
	final private DiarySevice DIARY_SEVICE = new DiarySevice(DIARY_DAO);
	final private DiaryController DIARY_CONTROLLER = new DiaryController(DIARY_SEVICE);
	
	
	private DiaryAssembler() { }
	
	public static DiaryAssembler getInstance() {
		if (diaryAssembler == null) {
			diaryAssembler = new DiaryAssembler();
		}
		
		return diaryAssembler;
	}

	public DiaryController getDiaryController() {
		return DIARY_CONTROLLER;
	}

	public DiarySevice getDiarySevice() {
		return DIARY_SEVICE;
	}

	public DiaryDao getDiaryDao() {
		return DIARY_DAO;
	}

}
