package com.example.io;
import java.io.*;

/**
 * Created by Nacho on 9/10/15.
 */
public class IO {
    public static void main(String[] args){
        try{
            FileWriter file = new FileWriter("example.txt");
            file.write("Hello world!");
            file.close();
        }catch (Exception ex){ex.printStackTrace();}

        try{
            FileReader reader = new FileReader("example.txt");
            BufferedReader BR = new BufferedReader(reader);
            System.out.println(BR.readLine());
        }catch (Exception ex){ex.printStackTrace();}
    }
}
