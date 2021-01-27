package UserInput;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter some text: ");
        String userInput = s.nextLine();

        System.out.println("You typed: "+ userInput);

        System.out.print("Enter your number: " );
        int number = s.nextInt();

        int answer =number +1;

        System.out.println("you added 1 to " + number + " and got " + answer);
    }
}
