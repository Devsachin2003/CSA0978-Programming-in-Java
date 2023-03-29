import java.util.*;
class endswithcontents {
    public static void main(String[] args) {
        System.out.println("Enter string1 and string2:");
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        boolean result = str1.endsWith(str2);
        
        if (result) {
            System.out.println("String 1 ends with the contents of string 2");
        } else {
            System.out.println("String 1 does not end with the contents of string 2");
        }
    }
}
