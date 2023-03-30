import java.util.*;
class Removeduplicates {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(10);
        num.add(25);
        num.add(33);
        num.add(25);
        num.add(40);

        System.out.println("Before removing duplicates: " + num);

        HashSet<Integer> set = new HashSet<Integer>(num);
        num.clear();
        num.addAll(set);

        System.out.println("After removing duplicates: " + num);
    }
}
