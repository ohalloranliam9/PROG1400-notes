package Decisions;

import java.util.Scanner;

public class decisions {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int num = s.nextInt();

        if (num < 0){
            System.out.println("Negative.");
        } else {
            if (num ==0) {
                System.out.println("Zero");
            } else {
                System.out.println("positive");
            }
        }


    }
}
