import java.util.*;
class StringToInteger {
    public static void main(String[] args) {
        String str;
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
        int num = Integer.parseInt(str);
        System.out.println("The integer value is: " + num);
    }
}
