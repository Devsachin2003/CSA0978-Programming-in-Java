
import java.util.*;
class Printconsonantsandvowels {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        String vowels = "";
        String consonants = "";

        for (int i = 0; i < word.length(); i++) {
            char ch = Character.toLowerCase(word.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels += ch;
            } else if (Character.isLetter(ch)) {
                consonants += ch;
            }
        }

        System.out.println("Vowels in the word: " + vowels);
        System.out.println("Consonants in the word: " + consonants);
    }
}
