import java.util.*;
class Fibonacci{

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int num;
        System.out.println("Enter the number:");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        System.out.println("Fibonacci number at position " + num + " is " + fibonacci(num));
    }
}
