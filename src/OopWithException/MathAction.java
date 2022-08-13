package OopWithException;

public class MathAction {

    public int enterFirstValue;
    public String enterMathValue;
    public int enterSecondValue;

    public float result;


    public MathAction(int enterFirstValue, String enterMathValue, int enterSecondValue){
        this.enterFirstValue = enterFirstValue;
        this.enterMathValue = enterMathValue;
        this.enterSecondValue = enterSecondValue;
    }

    public void addMethod() throws ExceptionTest {
        result = this.enterFirstValue + this.enterSecondValue;
        if(result <= 100){
            System.out.println(result);
        } else throw new ExceptionTest("Result is more than 100. Result must be less than 100. Your result is: " + result);
    }

    public void subtractionMethod() throws ExceptionTest{
        result = this.enterFirstValue - this.enterSecondValue;
        if(result <= 100){
            System.out.println(result);
        } else throw new ExceptionTest("Result is more than 100. Result must be less than 100. Your result is: " + result);
    }

    public void multiplicationMethod() throws ExceptionTest {
        result = this.enterFirstValue * this.enterSecondValue;
        if(result <= 100){
            System.out.println(result);
        } else throw new ExceptionTest("Result is more than 100. Result must be less than 100. Your result is: " + result);
    }

    public void divisionMethod() throws ExceptionTest {
        result = (float)this.enterFirstValue / this.enterSecondValue;
        if(result <= 100){
            System.out.println(result);
        } else throw new ExceptionTest("Result is more than 100. Result must be less than 100. Your result is: " + result);
    }
}
