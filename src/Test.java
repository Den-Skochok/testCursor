public class Test {
    static int plusMethod(int x, int y) {
        return x + y;
    }

    static double plusMethod(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        int myNum1 = plusMethod(100, 5);
        double myNum2 = plusMethod(4.3, 6.5);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);


        Car myCar = new Car();
        myCar.fullThrottle();
        myCar.speed(1000);

        int day = 3;
        int day1 = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }

    }
}
