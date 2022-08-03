package secondHomeWork;

import java.util.Scanner;

public class OutputMethods {

    private static Scanner scanner = new Scanner(System.in);

    public int enterFirstDigit() {
        System.out.print("Please enter First Digit: ");
        return scanner.nextInt();
    }

    public String enterMathAction() {
        System.out.print("Please enter action +, -, *, / : ");
        return scanner.next();
    }

    public int enterSecondDigit() {
        System.out.print("Please enter Second Digit: ");
        return scanner.nextInt();
    }
}
