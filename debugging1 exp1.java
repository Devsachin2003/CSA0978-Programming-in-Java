import java.util.*;
class Solution{
    public static void main(String[] args) {
        int x;
        System.out.println("Enter number:");
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        int sqrt = mySqrt(x);
        System.out.println("Square root of " + x + " is " + sqrt);
    }

    public static int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        int left = 1, right = x;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid == x / mid) {
                return mid;
            } else if (mid < x / mid) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return right;
    }
}
