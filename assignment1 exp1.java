import java.util.*;
class RightTrianglePattern{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = s.nextInt();
 

        for (int i = 1; i <= n; i++) {
            for (int j = n; j >=i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
System.out.println();
        }
    }
}
