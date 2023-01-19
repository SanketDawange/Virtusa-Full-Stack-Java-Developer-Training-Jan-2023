class MultipleThreads extends Thread{
    public void Run(){
        try{
            System.out.println("Running thread with id " + threadId());
        }
        catch(Exception e){
            System.out.println("Exception occured");
        }
    }

    
}

public class MultiThreds {
    public static void main(String[] args) {
        int n = 8; 
        for(int i=0; i<n; i++){
            MultipleThreads thread = new MultipleThreads();
            thread.Run();
        }
    }
}
