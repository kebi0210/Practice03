package com.javaex.problem08;

public class Book {

	int bookNo;
	String title;
	String author;
	int stateCode;
	
	public Book() {	}
	
	public Book(int bookNo, String title, String author){
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		stateCode=1; 
//		 필드에서 선언만 해준 멤버변수를 생성자 안에서 초기화해준 것.
//		 원래 하신것 : " int stateCode = 1; "
//		 필드에 선언한 변수 = 멤버변수 
//		 메소드에 선언한 변수=지역변수. 지역변수는 메소드가 실행된 후 끝나버림!
//		 따라서 위에 선언한 클래스 변수를 가져와서 쓰려면 새로운 변수를 선언하는게 아니라 변수네임만 가져오면됨.
		
	}
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public void rent(int number){
		stateCode=0;
		System.out.println(title + "이(가) 대여됐습니다.");
	}
//  rent() 함수 호출하면 생성자에서 1로 셋팅해준 stateCode가 1로 바뀌고 sysout한 내용들이 나옴.
//  원래하신것 :	
//	public void rent() {
//		if(stateCode == 0) {
//			System.out.println(title+"이(가) 대여 됐었습니다.");
//		}
//	}
	
	
	public String print () { 
		if(stateCode == 1) {
			return "재고있음";
		}else if(stateCode == 0) {
			return "대여중";
		}else {
			return "잘못 입력하셨습니다.";
		}
	}
//  print함수를 리턴값이 있게 만들어줘야 displayBookInfo 함수에서 한줄에 같이 뽑을 수 있음
//  원래하신것 :
//	public void print() {
//		if(stateCode == 1) {
//			System.out.println("재고 있음");  
//		}else if(stateCode == 0) {
//			System.out.println("대여중");
//		}else {
//			System.out.println("잘못 입력 하였습니다.");
//		}
//	}
	


}
