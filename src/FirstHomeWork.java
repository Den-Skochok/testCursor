import java.util.Scanner;

public class FirstHomeWork {

    private static int firstDigit;
    private static int secondDigit;
    private static String mathAction;

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Please enter first Digit: ");
        firstDigit = scanner.nextInt();

        System.out.print("Please enter action +, -, *, / : ");
        mathAction = scanner.next();

        System.out.print("Please enter second Digit: ");
        secondDigit = scanner.nextInt();

        switch (mathAction) {
            case ("+"):
                System.out.println("Result: " + firstDigit + " " + mathAction + " " + secondDigit + " = " + (firstDigit + secondDigit));
                break;
            case "-":
                System.out.println("Result: " + firstDigit + " " + mathAction + " " + secondDigit + " = " + (firstDigit - secondDigit));
                break;
            case "*":
                System.out.println("Result: " + firstDigit + " " + mathAction + " " + secondDigit + " = " + (firstDigit * secondDigit));
                break;
            case "/":
                if (secondDigit == 0) {
                    System.out.println("Cannot be divided by 0");
                } else {
                    System.out.println("Result: " + firstDigit + " " + mathAction + " " + secondDigit + " = " + ((float) firstDigit / secondDigit));
                }
                break;
            default:
                System.out.println("Enter correct math Action from the proposed");
        }
    }
}
