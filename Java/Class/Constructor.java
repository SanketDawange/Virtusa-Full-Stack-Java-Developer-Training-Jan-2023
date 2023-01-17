class A{
    public int a;
    public A() {
        System.out.println("This is default constructor");
    }
    public A(int a) {
        this.a = a;
        System.out.println("This is parameterized constructor "+ a);
    }
}

public class Constructor {
    public static void main(String[] args) {
        A obj1 = new A();
        A obj2 = new A(5);
    }
}
