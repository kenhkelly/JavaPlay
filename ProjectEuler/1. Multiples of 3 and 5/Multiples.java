public class Multiples {

  public static int start = 1, end = 1000 - 1;

  public static void main(String[] args) {
    int sum = 0;

    for (int i = start; i <= end; i++) {
      if (i % 3 == 0 || i % 5 == 0) {
        sum += i;
      }
    }

    System.out.println(String.format("Sum of multiples is %d", sum));
  }
}