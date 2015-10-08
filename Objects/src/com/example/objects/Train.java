package com.example.objects;

/**
 * Created by Nacho on 8/10/15.
 */
public class Train {
    int wagons[][] = new int[5][2];
    String machinist;
    int antiquity;

    public Train() {
        for (int i = 0; i < 5; i++) {
            wagons[i][0] = (i+1) * 10;  // 10 seats per waggon
            wagons[i][1] = 0;           // Empty wagon for start
        }

        machinist = "Anonymous";
        antiquity = 0;
    }

    public Train(String name, int years) {
        for (int i = 0; i < 5; i++) {
            wagons[i][0] = (i+1) * 10;  // 10 seats per waggon
            wagons[i][1] = 0;           // Empty wagon for start
        }

        machinist = name;
        antiquity = years;
    }
}
