import java.util.*;
class ReverseWord {
    public static void main(String[] args) {
        String word;
        Scanner sc=new Scanner(System.in);
        word=sc.nextLine();
        String reversedWord = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord += word.charAt(i);
        }

        System.out.println("Original word: " + word);
        System.out.println("Reversed word: " + reversedWord);
    }
}
