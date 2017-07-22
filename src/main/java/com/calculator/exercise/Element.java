package com.calculator.exercise;

public class Element {
	
	
	
	String  keyword;
	float number;
	public Element(String keyword, float number) {
		super();
		this.keyword = keyword;
		this.number = number;
	}

	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public float getNumber() {
		return number;
	}
	public void setNumber(float number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Element [keyword=" + keyword + ", number=" + number + "]";
	}
	
	
	
 	
   	

}
