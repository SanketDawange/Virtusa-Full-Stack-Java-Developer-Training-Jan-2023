class A{
    public int a = 9;
    public A() {
        System.out.println("This is default constructor and value of a is: "+a);
    }
    public A(int a) {
        this.a = a;
        System.out.println("This is parameterized constructor and value of a is: "+ a);
    }
}

public class Constructor {
    public static void main(String[] args) {
        A obj1 = new A();
        A obj2 = new A(5);
    }
}
