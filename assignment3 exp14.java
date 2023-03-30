import java.util.*;
class Sortreverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.next();

        char[] chars = word.toCharArray();
        Arrays.sort(chars);

        System.out.print("Letters in reverse alphabetical order: ");
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i]);
        }
        System.out.println();
    }
}
