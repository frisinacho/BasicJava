package com.example.switchcase;

/**
 * Created by Nacho on 5/10/15.
 */
public class SwitchCase {
    public void main(String[] args){
        int month = 3;

        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Has 31 days");
                break;
            default:
                System.out.println("Doesn't have 31 days");
        }
    }
}
