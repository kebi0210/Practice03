package com.javaex.problem07;

public class Account {

	private String accountNo;
	private int balance;


	// 생성자 작성
	public Account(String accountNo, int balance) {
		this.accountNo = accountNo;
	}
	// 필요한 메소드 작성
	
	public Account(String account) {
		System.out.println(account+" "+"계좌가 개설되었습니다.");
	}
		
	public void deposit(int money) {
		balance += money;
	}

	public void withdraw(int money) {
		
		if(balance > money) {
			balance -= money;
		}else {
			System.out.println("예금액이 부족하여 출금하지 못햇습니다.");
		}
	}
	
	public void showBalance() {
		System.out.println(balance);
		}
	}


