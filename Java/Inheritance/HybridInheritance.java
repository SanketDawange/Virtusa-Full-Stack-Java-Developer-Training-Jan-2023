class D{
    public void inD(){
        System.out.println("Inside D");
    }
}

interface C{
    public void inSideC();
}

class A extends D{
    public void inA(){
        System.out.println("In class A");
    }
}

class B extends A implements C {
    public void inB() {
        System.out.println("In class B");
    }

    @Override
    public void inSideC() {
        System.out.println("Inside B");
    }
}


public class HybridInheritance {
    public static void main(String[] args) {
        System.out.println("Hybrid inheritance in java");
        B objB = new B();
        objB.inB();
        objB.inA();
        objB.inSideC();
        objB.inD();
    }
}
