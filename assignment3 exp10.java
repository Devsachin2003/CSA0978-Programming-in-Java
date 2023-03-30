
import java.util.*;
class Countspecialchars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int count = 0;

        System.out.println("Special characters in the string:");
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (!Character.isLetterOrDigit(ch) && ch != ' ') {
                System.out.println(ch);
                count++;
            }
        }

        System.out.println("Number of special characters: " + count);
    }
}
