package com.example.arrays;

/**
 * Created by Nacho on 6/10/15.
 */
public class Arrays {
    public static void main(String[] args){
        int wagons[] = new int[5];

        wagons[0] = 23; // 23 passengers in the first wagon
        wagons[1] = 15; // 15 passengers in the second wagon
        wagons[2] = 20; // 20 passengers in the third wagon
        wagons[3] = 32; // 32 passengers in the forth wagon
        wagons[4] = 10; // 10 passengers in the last wagon

        System.out.println("There are " + wagons[2] + " passengers in the third wagon");
    }
}
