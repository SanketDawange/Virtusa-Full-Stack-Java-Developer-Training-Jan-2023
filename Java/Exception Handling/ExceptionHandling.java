public class ExceptionHandling {
    public static void main(String[] args) {
        System.out.println("Exception Handling in JAVA");
        int a = 6;
        int b = 0;
        try{
            System.out.println("Division is: "+ (a/b));
        }
        catch(Exception e){
            System.out.println("Exception occured: "+ e.getMessage());
        }
        finally{
            System.out.println("Execution done");
        }
    }
}
