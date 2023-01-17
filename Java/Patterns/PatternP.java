public class PatternP {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1; i<=n; i++) {
            for(int j=i; j>=1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0; i<n; i++) {
            for(int j=n-i; j>=1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
