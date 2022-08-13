package OopWithException;

public class CalculateMethod extends OutputValueMethods {

    private static MathAction mathAction = new MathAction(enterFirstDigit(), enterMathAction(), enterSecondDigit());

    public static void getCalculateResult() {

        switch (mathAction.enterMathValue) {
            case ("+"):
                try {
                    mathAction.addMethod();
                } catch (ExceptionTest e) {
                    throw new RuntimeException(e);
                }
                break;
            case "-":
                try {
                    mathAction.subtractionMethod();
                } catch (ExceptionTest e) {
                    throw new RuntimeException(e);
                }
                break;
            case "*":
                try {
                    mathAction.multiplicationMethod();
                } catch (ExceptionTest e) {
                    throw new RuntimeException(e);
                }
                break;
            case "/":
                if (mathAction.enterSecondValue == 0) {
                    throw new ArithmeticException("Cannot be divided by 0");
                } else {
                    try {
                        mathAction.divisionMethod();
                    } catch (ExceptionTest e) {
                        throw new RuntimeException(e);
                    }
                }
                break;
            default:
                throw new ArithmeticException("Enter correct math Action from the proposed");
        }
    }
}
