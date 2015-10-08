package com.example.whileloop;

/**
 * Created by Nacho on 8/10/15.
 */
public class WhileLoop {
    public static void main(String[] args){
        int wagons[][] = new int[5][2];
        int i, j;

        for (i = 0; i < 5; i++) {
            for (j = 0; j < 2; j++) {
                if (j == 0) wagons[i][j] = (i + 1) * 10;
                if (j == 1) wagons[i][j] = wagons[i][0] / 2;
            }
        }
        System.out.println("There are " + wagons[0][1] + " passengers at the start.");


        while (wagons[0][1] < wagons[0][0]){
            wagons[0][1]++;
            System.out.println("Now, there are " + wagons[0][1] + " passengers.");
        }


        do{
            wagons[0][1]++;
            System.out.println("Now, there are " + wagons[0][1] + " passengers.");
        }while (wagons[0][1] < wagons[0][0]);
    }
}
