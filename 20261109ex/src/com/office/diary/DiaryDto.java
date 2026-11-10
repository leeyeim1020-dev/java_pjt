package com.office.diary;

public class DiaryDto {

	private String diaryTitle;
	private String diaryBady;
	
	public DiaryDto() {
		// TODO Auto-generated constructor stub
	}
	
	public DiaryDto(String diaryTitle, String diaryBody) {
		this.diaryTitle = diaryTitle;
		this.diaryBady = diaryBody;
	}

	public String getDiaryTitle() {
		return diaryTitle;
	}

	public void setDiaryTitle(String diaryTitle) {
		this.diaryTitle = diaryTitle;
	}

	public String getDiaryBady() {
		return diaryBady;
	}

	public void setDiaryBady(String diaryBady) {
		this.diaryBady = diaryBady;
	}
	
	
	
}
