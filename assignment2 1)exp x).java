class sameornot{
    public static void main(String[] args) {
        String str1 = "The quick brown fox jumps over the lazy dog";
        String str2 = "The quick brown fox jumps over the lazy dog";
        String str3 = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
        
        boolean result1 = str1.equals(str2);
        boolean result2 = str1.equalsIgnoreCase(str3);
        
        System.out.println(result1);
        System.out.println(result2);
    }
}
