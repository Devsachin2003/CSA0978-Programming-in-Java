import java.util.*;

class Pascal{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            int num = 1;
            for (int j = n - i; j > 1; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.printf("%-4d", num);
                num = num * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
