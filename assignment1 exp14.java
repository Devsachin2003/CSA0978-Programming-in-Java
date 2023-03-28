import java.util.*;

class MatrixAddition {
   public static void main(String args[]) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter number of rows and columns of matrix: ");
      int rows = scanner.nextInt();
      int columns = scanner.nextInt();


      System.out.println("Enter first matrix:");
      int[][] matrix1 = new int[rows][columns];
      for (int i = 0; i < rows; i++) {
         for (int j = 0; j < columns; j++) {
            matrix1[i][j] = scanner.nextInt();
         }
      }

      System.out.println("Enter second matrix:");
      int[][] matrix2 = new int[rows][columns];
      for (int i = 0; i < rows; i++) {
         for (int j = 0; j < columns; j++) {
            matrix2[i][j] = scanner.nextInt();
         }
      }


      int[][] sum = new int[rows][columns];
      for (int i = 0; i < rows; i++) {
         for (int j = 0; j < columns; j++) {
            sum[i][j] = matrix1[i][j] + matrix2[i][j];
         }
      }


      System.out.println("Matrix Sum:");
      for (int i = 0; i < rows; i++) {
         for (int j = 0; j < columns; j++) {
            System.out.print(sum[i][j] + " ");
         }
         System.out.println();
      }
   }
}
