public class Multiple {

  public static void main(String[] args) {
    int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
    int start = 10;

    outerloop:
    for (int i = start; ; i++) {
      for (int n : nums) {
        if (i % n != 0) {
          continue outerloop;
        }
      }

      System.out.println(i);
      break;
    }
  }
}