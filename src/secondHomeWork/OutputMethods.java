package oop;

import java.util.Scanner;

public class OutputMethods {

    private static Scanner scanner = new Scanner(System.in);

    public int enterFirstNumber() {
        System.out.print("Please enter First Digit: ");
        return scanner.nextInt();
    }

    public String enterMathAction() {
        System.out.print("Please enter action +, -, *, / : ");
        return scanner.next();
    }

    public int enterSecondNumber() {
        System.out.print("Please enter Second Digit: ");
        return scanner.nextInt();
    }
}
