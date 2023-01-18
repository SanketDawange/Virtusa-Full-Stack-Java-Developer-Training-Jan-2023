class A{
    public void printName(){
        System.out.println("Name is Kartik");
    }
}

class B extends A{
    @Override
    public void printName() {
        System.out.println("Name is Sanket");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        System.out.println("Method overridding in JAVA");
        A a = new A();
        a.printName();
        B b = new B();
        b.printName();
    }
}
