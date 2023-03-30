import java.util.*;
class SortNames{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter names separated by commas: ");
        String input = sc.nextLine();
        String[] namesArray = input.split(",");
        ArrayList<String> namesList = new ArrayList<String>();
        for (String name : namesArray) {
            namesList.add(name.trim());
        }
        System.out.print("Sort names in ascending (A) or descending (D) order? ");
        String order = sc.nextLine().toUpperCase();
        if (order.equals("A")) {
            Collections.sort(namesList);
        } else if (order.equals("D")) {
            Collections.sort(namesList, Collections.reverseOrder());
        } else {
            System.out.println("Invalid order specified.");
            return;
        }
        System.out.println("Sorted names:");
        for (String name : namesList) {
            System.out.println(name);
        }
    }
}
