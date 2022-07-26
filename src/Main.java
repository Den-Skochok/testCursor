import java.lang.annotation.*;
import java.util.Scanner;

public class Main {
    static void myMethod() {
        System.out.println("Hello World!");
    }

    // Static method
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    // Public method
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }

    public static void main(String[] args) {
//            myMethod();
//
//            myStaticMethod();
//
//            Main newObject = new Main();
//            newObject.myPublicMethod();
//
//
//        int i = 0;
//        while (i < 5) {
//            System.out.println(i);
//            i++;
//        }
//
//        int j = 0;
//        do {
//            System.out.println("j = " + j);
//            j++;
//        }
//        while (j < 5);
        int firstNumber, secondNumber;
        String action;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please. enter the first integer number:");
        firstNumber = scanner.nextInt();
        System.out.println("Please. enter the math operand (+, -, * , /)");
        action = scanner.next();
        System.out.println("Please. enter the second integer number:");
        secondNumber = scanner.nextInt();

        switch (action) {
            case "+":
                System.out.println("The result is: " + (firstNumber + secondNumber));
                break;
            case "-":
                System.out.println("The result is: " + (firstNumber - secondNumber));
                break;
            case "*":
                System.out.println("The result is: " + (firstNumber * secondNumber));
                break;
            case "/":
                System.out.println("The result is: " + ((float) firstNumber / secondNumber));
                break;
            default:
                System.out.println("Нou entered an incorrect math operand!");
        }
    }
}