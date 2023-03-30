
import java.util.*;
class Removevowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String output = "";
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' &&
                ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U') {
                output += ch;
            }
        }

        System.out.println("String with vowels removed: " + output);
    }
}
