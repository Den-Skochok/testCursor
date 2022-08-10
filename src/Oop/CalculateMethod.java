package oop;

public class CalculateMethod extends OutputValueMethods {

//    private static Scanner scanner = new Scanner(System.in);
    private static MathAction mathAction = new MathAction(enterFirstDigit(), enterMathAction(), enterSecondDigit());

    public static void getCalculateResult() {
        try {
            switch (mathAction.enterMathValue) {
                case ("+"):
                    System.out.println("Result: " + mathAction.addMethod());
                    break;
                case "-":
                    System.out.println("Result: " + mathAction.subtractionMethod());
                    break;
                case "*":
                    System.out.println("Result: " + mathAction.multiplicationMethod());
                    break;
                case "/":
                    if (mathAction.enterSecondValue == 0) {
                        System.out.println("Cannot be divided by 0");
                    } else {
                        System.out.println("Result: " + mathAction.divisionMethod());
                    }
                    break;
                default:
                    System.out.println("Enter correct math Action from the proposed");
            }
        } catch (Exception e) {
//            throw new RuntimeException(e);
            System.out.println(e);
        }

    }
}
