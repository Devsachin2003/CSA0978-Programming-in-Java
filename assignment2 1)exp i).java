import java.util.*;
public class Stringlexicographicallycompared{
    public static void main(String[] args) {
        String str1;
        String str2;
        System.out.println("Enter string1 and string2:");
        Scanner sc=new Scanner(System.in);
        str1=sc.nextLine();
        str2=sc.nextLine();
        int result = str1.compareToIgnoreCase(str2);

        if (result == 0) {
            System.out.println("str1 and str2 are equal.");
        } else if (result < 0) {
            System.out.println("str1 comes before str2.");
        } else {
            System.out.println("str1 comes after str2.");
        }
    }
}
