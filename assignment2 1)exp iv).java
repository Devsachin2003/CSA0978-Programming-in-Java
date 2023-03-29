import java.util.*;
class indexchar{
    public static void main(String[] args) {
        String alphabet;
        System.out.println("Enter string:");
        Scanner sc=new Scanner(System.in);
        alphabet=sc.nextLine();
        for (int i = 0; i < alphabet.length(); i++) {
            char letter = alphabet.charAt(i);
            int index = letter - 'a';
            System.out.println("Letter " + letter + " has index " + index);
        }
    }
}
