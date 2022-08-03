package secondHomeWork;

public class InputMethods {

    private static OutputMethods outMethods = new OutputMethods();
    private static int firstValue = outMethods.enterFirstDigit();
    private static String mathValue = outMethods.enterMathAction();
    private static int secondValue = outMethods.enterSecondDigit();

    public static void getResult() {
        switch (mathValue) {
            case ("+"):
                System.out.println("Result: " + firstValue + " " + mathValue + " " + secondValue + " = " + (firstValue + secondValue));
                break;
            case "-":
                System.out.println("Result: " + firstValue + " " + mathValue + " " + secondValue + " = " + (firstValue - secondValue));
                break;
            case "*":
                System.out.println("Result: " + firstValue + " " + mathValue + " " + secondValue + " = " + (firstValue * secondValue));
                break;
            case "/":
                if (secondValue == 0) {
                    System.out.println("Cannot be divided by 0");
                } else {
                    System.out.println("Result: " + firstValue + " " + mathValue + " " + secondValue + " = " + ((float) firstValue / secondValue));
                }
                break;
            default:
                System.out.println("Enter correct math Action from the proposed");
        }
    }
}
