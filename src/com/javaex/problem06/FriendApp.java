package com.javaex.problem06;

import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {

        Friend[] friendArray = new Friend[3];
        Scanner sc = new Scanner(System.in);

        System.out.println("친구를 3명 등록해 주세요");

        	// 친구정보 입력받기
        	String friendArray1 =sc.nextLine();
        	String friendArray2 =sc.nextLine();
        	String friendArray3 =sc.nextLine();
        	
        	// 입력받은 친구정보를 공백으로 분리
        	String[] friends1 = friendArray1.split(" ");
        	String[] friends2= friendArray2.split(" ");
        	String[] friends3 = friendArray3.split(" ");
        	// Friend 객체 생성하여 데이터 넣기
        	Friend friend1 = new Friend(friends1[0],friends1[1],friends1[2]); 
        	Friend friend2 = new Friend(friends2[0],friends2[1],friends2[2]);
        	Friend friend3 = new Friend(friends3[0],friends3[1],friends3[2]); 
        	// 배열에 추가하기
        	friendArray[0] = friend1;
        	friendArray[1] = friend2;
        	friendArray[2] = friend3;
        	// 친구정보 출력	
        	
            for (int i = 0; i < friendArray.length; i++) {
            //친구정보 출력 메소드 호출
            	friendArray[i].showInfo();
        }

        sc.close();
    }

}
