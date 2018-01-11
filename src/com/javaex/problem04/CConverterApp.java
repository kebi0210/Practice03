package com.javaex.problem04;


public class CConverterApp {

    public static void main(String[] args) {

        double dollar;
        double won;
        
        CConverter.setRate(1118.70);
        
        
        System.out.println("백만원은"+CConverter.toDoller(1000000)+"달러입니다.");
        
        
        System.out.println("백달러는"+CConverter.toKWR(100)+"입니다.");
        
        
    }

}
