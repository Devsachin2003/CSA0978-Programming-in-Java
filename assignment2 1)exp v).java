class replacement{
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        String a = "fox";
        String replace = "cat";
        
        String result = str.replaceAll(a, replace);
        System.out.println(result);
    }
}
