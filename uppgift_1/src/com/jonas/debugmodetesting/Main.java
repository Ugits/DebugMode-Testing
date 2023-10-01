package com.jonas.debugmodetesting;

public class Main {

    public static void main(String[] args) {

        int[] number = {5,10,50,100};

        for (int i = 0; i < number.length; i++) {
            if(number[i] == number[2]){
                continue;
            }
            System.out.println(number[i]);

        }
    }
}
