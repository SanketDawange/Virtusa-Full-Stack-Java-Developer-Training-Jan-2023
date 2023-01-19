abstract class Human{
    abstract void Run();
}

class Men extends Human{
    public void Run(){
        System.out.println("Men is running");
    }
}

class Women /*🍵 */ extends Human{
    public void Run(){
        System.out.println("Women is running");
    }
}

public class AbstractClasses {
    public static void main(String[] args) {
        Men m = new Men();
        Women w = new Women(); // 🍵
        m.Run();
        w.Run();
    }
}
