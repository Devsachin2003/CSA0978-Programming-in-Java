import java.util.*;
class Solution1{
    public static void main(String[] args) {
        int x;
        System.out.println("Enter number:");
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        boolean isPalindrome = isPalindrome(x);
        System.out.println(x + " is a palindrome: " + isPalindrome);
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false; 
        }
        int reversed = 0, original = x;
        while (x > 0) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }
        return original == reversed;
    }
}
