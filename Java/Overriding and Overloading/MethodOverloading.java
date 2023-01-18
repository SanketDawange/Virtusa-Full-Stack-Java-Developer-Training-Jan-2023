class A{
    public int add(int a, int b) {
        return (a+b);
    }
    public int add(int a, int b, int c) {
        return (a+b+c);
    }
    public int add(int a, int b, int c, int d) {
        return (a+b+c+d);
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println("Method overloading in JAVA");
        A a = new A();
        System.out.println("With two params :"+a.add(5,6)); 
        System.out.println("With three params :"+a.add(5,6, 7));
        System.out.println("With four params :"+a.add(5,6,7,8));
    }
}
