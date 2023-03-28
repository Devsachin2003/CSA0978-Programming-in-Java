import java.util.*;
class hollowsquare{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the side length of the square: ");
        int side = s.nextInt();
        

        for (int i = 1; i <= side; i++) {
            for (int j = 1; j <= side; j++) {
                if (i == 1 || i == side || j == 1 || j == side) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
