import java.util.Scanner;

class MultipleThreads extends Thread{
    public void Run(){
        try{
            System.out.println("Running thread with id " + threadId()+" and name "+ getName());
        }
        catch(Exception e){
            System.out.println("Exception occured");
        }
    }
}

public class MultiThreds {
    public static void main(String[] args) {
        int n = 8; 
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<n; i++){
            MultipleThreads thread = new MultipleThreads();
            thread.setName("Thread "+(i+1));
            thread.Run();
        }
    }
}
