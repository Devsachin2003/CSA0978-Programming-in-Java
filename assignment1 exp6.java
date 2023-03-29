import java.util.*;

class Pattern6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ch;
        System.out.print("Enter the character to be printed: ");
        ch = sc.nextLine();
        System.out.print("Max number of times printed: ");
        int maxTimes = sc.nextInt();
        for (int i = 1; i <= maxTimes; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
