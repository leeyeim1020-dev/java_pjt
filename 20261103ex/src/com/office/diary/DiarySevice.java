package com.office.diary;

import java.util.ArrayList;

public class DiarySevice {

	final private DiaryDao diaryDao;
	
	public DiarySevice(DiaryDao diaryDao) {
		this.diaryDao = diaryDao;
	}

	public void witeNewDiary(DiaryDto diaryDto) {
		
		boolean result = diaryDao.insertDiary(diaryDto);
		
		if (result) {
			System.out.println("WRITE DIARY SUSSESS!");
		} else {
			System.out.println("WRITE DIARY FIAL!");
		}
		
	}

	public void readDiaries() {
		
		ArrayList<String> diaries = diaryDao.getDiaries();
		for (int i = 0; i < diaries.size(); i++) {
			System.out.println(diaries.get(i));
		}
	}
	
	
}
