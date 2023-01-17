class Heart{
    public static void main(String[] args) {
        int n = 50;
        int m = 25;
        for(int i=1; i<=m; i++) {
            for(int j=m-i; j>=1; j--) {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            for(int j=1; j<i; j++) {
                System.out.print("*");
            }
            for(int j=m-i; j>=1; j--) {
                System.out.print(" ");
            }
            for(int j=m-i; j>=1; j--) {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            for(int j=1; j<i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=n-i; j++) {
                System.out.print("*");
            }
            for(int j=1; j<n-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}