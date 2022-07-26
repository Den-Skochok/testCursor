import java.util.Scanner;

public class FirstHomeWork {

    private static int firstDigit;
    private static int secondDigit;
    public static String mathAction;

    public static float result;
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Please enter first Digit:");
        firstDigit = scanner.nextInt();
//        if(scanner.hasNextInt()){
//            System.out.println("Please enter action +, -, *, / :");
//            mathAction = scanner.next();
//        } else {
//            System.out.println("You can enter only digits. Try again: ");
//            firstDigit = scanner.nextInt();
//        }

        System.out.println("Please enter action +, -, *, / :");
        mathAction = scanner.next();

        System.out.println("Please enter second Digit:");
        secondDigit = scanner.nextInt();

        if (mathAction.equals("+")) {
            System.out.println("Result: " + firstDigit + " " + mathAction + " " + secondDigit + " = " + (firstDigit + secondDigit));
        } else if (mathAction.equals("-")) {
            System.out.println("Result: " + firstDigit + " " + mathAction + " " + secondDigit + " = " + (firstDigit - secondDigit));
        } else if (mathAction.equals("*")) {
            System.out.println("Result: " + firstDigit + " " + mathAction + " " + secondDigit + " = " + (firstDigit * secondDigit));
        } else if (mathAction.equals("/")) {
            if (secondDigit == 0) {
                System.out.println("Cannot be divided by 0");
            } else {
                System.out.println("Result: " + firstDigit + " " + mathAction + " " + secondDigit + " = " + ((float)firstDigit / secondDigit));
            }
        } else if(!mathAction.equals("+") || !mathAction.equals("-") || !mathAction.equals("*") || !mathAction.equals("/")){
            System.out.println("Enter correct math Action from the proposed");
        }
    }
}
