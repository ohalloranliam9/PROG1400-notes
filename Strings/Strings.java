package Strings;

import java.util.Locale;

public class Strings {
    public static void main(String[] args) {

        String str1 = "hello world";
        String paragraph = """
                This is a story about a man named Jed.
                A poor mountaineer. Barely kept his family fed.""";

        System.out.println(str1);
        System.out.println(paragraph);

        String str2 = str1.toUpperCase();
        System.out.println(str2);

        System.out.println("length: " + str2.length());
        System.out.println("Char: " + str2.charAt(6));

        double money =123.456789;
        String moneyString = String.format("$%.2f", money);
        System.out.println(moneyString);
    }
}
