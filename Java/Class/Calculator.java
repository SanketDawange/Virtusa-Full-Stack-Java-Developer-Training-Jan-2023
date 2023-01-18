import java.util.Scanner;
class Calc{
    public int add(int a, int b) {
        return (a+b);
    }
    public int sub(int a, int b) {
        return (a-b);
    }
    public int mul(int a, int b) {
        return (a*b);
    }
    public int div(int a, int b) {
        return (a/b);
    }
}
public class Calculator {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int ch;
        int c;
        int a, b;
        Calc obj = new Calc();
        do{
            System.out.println("Welcome to Calculator");
            System.out.println("Choose any of the operation");
            System.out.println("1. Addition\n2. Substraction\n3. Multiplication\n4. Division");
            ch = sc.nextInt();
            System.out.println("Enter first number: ");
            a = sc.nextInt();
            System.out.println("Enter second number: ");
            b = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Addition is: "+obj.add(a,b));
                    break;

                case 2:
                    System.out.println("Substraction is: "+obj.sub(a,b));
                    break;

                case 3:
                    System.out.println("Multiplication is: "+obj.mul(a,b));
                    break;

                case 4:

                    if(b==0) {
                        System.out.println("Cannot divide by zero");
                    }else{
                        System.out.println("Division is: "+obj.div(a,b));
                    }
                    break;
            
                default:
                    System.out.println("Wrong choice !");
                    break;
            }

            System.out.println("Do you want to continue(1.YES/2.NO)");
            c = sc.nextInt();
            

        }while(c==1);
        sc.close();
    }
    
}
