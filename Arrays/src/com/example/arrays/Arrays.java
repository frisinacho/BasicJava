package com.example.arrays;

/**
 * Created by Nacho on 6/10/15.
 */
public class Arrays {
    public static void main(String[] args){
        int wagons[][] = new int[5][2];

        wagons[0][0] = 23; // 23 seating in the first wagon
        wagons[0][1] = 20; // 20 passengers in the first wagon
        wagons[1][0] = 15; // 15 seating in the second wagon
        wagons[1][1] = 10; // 10 passengers in the second wagon
        wagons[2][0] = 20; // 20 seating in the third wagon
        wagons[2][1] = 20; // 20 passengers in the third wagon
        wagons[3][0] = 32; // 32 seating in the forth wagon
        wagons[3][1] = 30; // 32 passengers in the forth wagon
        wagons[4][0] = 10; // 10 seating in the last wagon
        wagons[4][1] = 10; // 10 passengers in the last wagon

        System.out.println("There are " + wagons[1][1] + "/" + wagons[1][0] + "passengers in the second wagon");
    }
}
