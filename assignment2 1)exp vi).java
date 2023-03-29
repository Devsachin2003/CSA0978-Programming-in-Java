public class Rangesub{
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        int start = 9;
        int end = 14;
        
        String result = str.substring(start, end);
        System.out.println(result);
    }
}
