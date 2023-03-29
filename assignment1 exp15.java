import java.util.*;
class MeanMedianMode {
   public static void main(String[] args) {
      int[] arr = {16, 18, 27, 16, 23, 21, 19};
      double mean = 0;
      for (int i = 0; i < arr.length; i++) {
         mean += arr[i];
      }
      mean /= arr.length;
      Arrays.sort(arr);
      double median = 0;
      if (arr.length % 2 == 0) {
         median = (arr[arr.length/2] + arr[arr.length/2 - 1]) / 2.0;
      } else {
         median = arr[arr.length/2];
      }
      Map<Integer, Integer> freq = new HashMap<>();
      for (int i = 0; i < arr.length; i++) {
         freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
      }
      int maxFreq = 0;
      int mode = 0;
      for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
         if (entry.getValue() > maxFreq) {
            maxFreq = entry.getValue();
            mode = entry.getKey();
         }
      }
      System.out.println("Mean = " + mean);
      System.out.println("Median = " + median);
      System.out.println("Mode = " + mode);
   }
}
