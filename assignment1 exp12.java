import java.util.*;
class invertedfullpyramid2 {
   public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     System.out.print("Enter the number of rows: ");
     int rows = input.nextInt();
        for (int i = rows; i >= 1; i--) {
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2*i-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
