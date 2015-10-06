package com.example.loops;

/**
 * Created by Nacho on 6/10/15.
 */
public class Loops {
    public static void main(String[] args){
        int wagons[] = new int[5];
        int i;

        for (i = 0; i < 5; i++){
            wagons[i] = (i + 1) * 10;
            System.out.println("The " + (i + 1) + " wagon has " + wagons[i] + " passengers.");
        }
    }
}
