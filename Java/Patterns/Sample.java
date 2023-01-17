import java.util.Scanner; 
class Sample{
    public static void main(String[] args) {
        System.out.println("Enter pecentage: ");
        Scanner sc = new Scanner(System.in);
        int percentage = sc.nextInt();
        if(percentage > 66) {
            System.out.println("first class with extinction");
        }
        else if(percentage > 60) {
            System.out.println("first class");
        }
        else if(percentage >= 58) {
            System.out.println("higher second class");
        }
        else if(percentage >= 40) {
            System.out.println("pass");
        }
        else{
            System.out.println("Failed");
        }
    }
}