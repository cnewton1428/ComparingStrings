package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        System.out.println("How is the weather?");
        String answer = kbd.nextLine();


        if (answer.equals("rainy")) {
            System.out.println("Take your umbrella!");
        }else if (answer.equals("windy")){
            System.out.println("Wear your jacket!");
        }else if (answer.equals("snowy")) {
            System.out.println("Wear a coat and take a shovel!");
        }else if (answer.equals("stormy")) {
            System.out.println("You should stay inside!");
        }else {
            System.out.println("Enjoy your day!");
        }
    }
}
