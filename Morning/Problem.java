package Morning;

import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        //ask user for two numbers

        Scanner s = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        int num1 = s.nextInt();
        int num2 = s.nextInt();

        //loop between the two entered numbers
        System.out.println("You typed: " + num1 + " and " + num2);
        for (int i = num1; i <= num2; i++) {
            System.out.print(i + ": ");


            //for each number in loop
            //do another loop that starts at 1 and ends at that number
            //ex. 10 should loop between 1 and 10
            for (int j = 1; j <= i; j++) {


                //divide the number by each number in that loop
                if (i % j == 0) {

                    //if evenly divisible print out the number
                    System.out.print(j + " ");
                }
            }
            System.out.println("");


        }
    }
}