import java.util.*;

class Rectangle {
    public static void main(String[] args) {
    Scanner m = new Scanner(System.in);
        System.out.print("Enter the symbol to use: ");
        char symbol = m.nextLine().charAt(0);
        System.out.print("Enter the width of the rectangle: ");
        int width = m.nextInt();
        System.out.print("Enter the height of the rectangle: ");
        int height = m.nextInt();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
}
