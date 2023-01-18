public class Throws {
    public static void main(String[] args) {
        System.out.println("Throws an Exception in JAVA");
        int a = 6;
        // int a = 5;
        if(a<=5) {
            throw new ArithmeticException("Number less than or equal to 5");
        }
        else{
            System.out.println("Number is greater tha 5 and is: " + a);
        }
    }
}
