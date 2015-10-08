package com.example.objects;

/**
 * Created by Nacho on 8/10/15.
 */
public class Objects {
    public static void main(String[] args){
        Train first = new Train();
        System.out.println(first.machinist);

        Train second = new Train("Nacho", 25);
        System.out.println(second.machinist);
        System.out.println(second.antiquity);
    }
}
