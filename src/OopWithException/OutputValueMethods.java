package OopWithException;

import java.util.Scanner;

public class OutputValueMethods {

    private static Scanner scanner = new Scanner(System.in);

    public static int enterFirstDigit() {
        System.out.print("Please enter First Digit: ");
        return scanner.nextInt();
    }

    public static String enterMathAction() {
        System.out.print("Please enter action +, -, *, / : ");
        return scanner.next();
    }

    public static int enterSecondDigit() {
        System.out.print("Please enter Second Digit: ");
        return scanner.nextInt();
    }
}
