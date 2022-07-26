public class NewClass {

    static void myMethod(String fname, int age){
        System.out.println(fname + " is " + age + " Refsnes");
    }

    static void myMethod1(int x){
        if (x < 10) {
            System.out.println("Access denied - You are not old enough!");
        } else {
            System.out.println("1111111");
        }
    }

    public static void main(String[] args){
        myMethod("Liam", 100);
        myMethod("Jenny", 100);
        myMethod("Anja", 100);

        myMethod1(10);

        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());
    }


}
