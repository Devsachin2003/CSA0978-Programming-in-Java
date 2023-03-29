import java.util.*;

class Pattern3{
    public static void main(String[] args) {
        int num,maxtimes;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to be printed: ");
        num = sc.nextInt();
        System.out.print("Max number of times printed: ");
        maxtimes = sc.nextInt();
        for (int i = 1; i <= maxtimes; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
            }
            System.out.println();
        }
        for (int i = maxtimes - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
            }
            System.out.println();
        }
    }
}
