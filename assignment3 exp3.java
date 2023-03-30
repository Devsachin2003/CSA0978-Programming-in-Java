import java.util.*;
class Uglynumber {
    public static boolean isUgly(int num) {
        if (num == 0) {
            return false;
        }

        while (num % 2 == 0) {
            num /= 2;
        }

        while (num % 3 == 0) {
            num /= 3;
        }

        while (num % 5 == 0) {
            num /= 5;
        }

        return num == 1;
    }

    public static void main(String[] args) {
        int num;
        System.out.println("Enter the number:");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        if (isUgly(num)) {
            System.out.println("Ugly number.");
        } else {
            System.out.println("Not an ugly number.");
        }
    }
}
