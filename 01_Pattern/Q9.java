public class Q9 {
    public static void main(String[] args) {
        int n = 5;
        // top (1..n)
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) System.out.print("*");
            System.out.println();
        }
        // bottom (n-1..1)
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) System.out.print("*");
            System.out.println();
        }
    }
}