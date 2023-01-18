interface A{
    public void printName();
}

class B implements A{
    @Override
    public void printName() {
        System.out.println("Name is Sanket");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        System.out.println("Method overridding in JAVA");
        B b = new B();
        b.printName();
    }
}
