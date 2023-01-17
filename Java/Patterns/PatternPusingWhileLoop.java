public class PatternPusingWhileLoop {
    public static void main(String[] args) {
        int n = 1;
        while(n<=5) {
            int i = n;
            while(i>0) {
                System.out.print("*");
                i--;
            }
            System.out.println();
            n ++;
        }
        n = 4;
        while(n>=0) {
            int i = n;
            while(i>0) {
                System.out.print("*");
                i--;
            }
            System.out.println();
            n --;
        }
    }
}
