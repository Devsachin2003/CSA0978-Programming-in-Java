   import java.util.*;
class ValidateUsername {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = sc.nextLine();
        boolean isValid = username.matches("^[a-zA-Z]\\w{5,11}$");
        if (isValid) {
            System.out.println("Username is valid.");
        } else {
            System.out.println("Username is invalid.");
        }
    }
}
