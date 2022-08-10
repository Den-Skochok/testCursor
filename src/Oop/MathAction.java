package oop;

public class MathAction {

    public int enterFirstValue;
    public String enterMathValue;
    public int enterSecondValue;


    public MathAction(int enterFirstValue, String enterMathValue, int enterSecondValue){
        this.enterFirstValue = enterFirstValue;
        this.enterMathValue = enterMathValue;
        this.enterSecondValue = enterSecondValue;
    }

    public int addMethod(){
        return this.enterFirstValue + this.enterSecondValue;
    }

    public int subtractionMethod(){
        return this.enterFirstValue - this.enterSecondValue;
    }

    public int multiplicationMethod(){
        return this.enterFirstValue * this.enterSecondValue;
    }

    public float divisionMethod(){
        return (float) this.enterFirstValue / this.enterSecondValue;
    }
}
