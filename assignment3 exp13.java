
import java.util.*;
class FindCharacterInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("Enter a character to search: ");
        char ch = sc.next().charAt(0);

        boolean found = false;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                System.out.println("Character '" + ch + "' found at index " + i);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Character '" + ch + "' not found in the string.");
        }
    }
}
