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

        first.machinist = "New name";
        System.out.println(first.machinist);

        System.out.println(first.wagons[2][1]);
        first.FillingWagon(2);
        System.out.println(first.wagons[2][1]);

        Luxury third = new Luxury();
        System.out.println(third.machinist);
        System.out.println(third.waiter);
        System.out.println(third.wagons[2][1]);
        third.FillingWagon(2);
        System.out.println(third.wagons[2][1]);
    }
}
