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

    public void FillingWagon(int wagon){
        wagons[wagon][1] = wagons[wagon][0];    // Number of passengers is equal at number of seats
        System.out.println("The " + (wagon+1) + " has been filled.");
    }

    public void PutPassengers(int wagon, int passengers){
        if ((wagons[wagon][1] + passengers) > wagons[wagon][0]){
            System.out.println("There are not enough seats on " + (wagon+1) + " wagon.");
        }else {
            wagons[wagon][1] = wagons[wagon][1] + passengers;
            System.out.println(passengers + " passengers has been putted into the " + (wagon + 1) + " wagon.");
        }
    }
}
