package com.example.objects;

/**
 * Created by Nacho on 9/10/15.
 */
public class Luxury extends Train {
    String waiter;  // Name of the waiter
    boolean bar;    // Open or Close

    public Luxury() {
        waiter = "Anonymous";
        bar = false;
    }

    public Luxury(String name, boolean state) {
        waiter = name;
        bar = state;
    }

    public void StatusBar(boolean state){
        bar = state;

        if (bar){   // bar == true
            System.out.println("The bar is open");
        }else{
            System.out.println("The bar is close");
        }
    }
}
