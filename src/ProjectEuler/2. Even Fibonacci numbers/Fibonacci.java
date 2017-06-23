public class Fibonacci {

  public static int first = 1, second = 2, valueStop = 4000000;

  public static void main(String[] args) {
    int f, s, sum;
    f = first;
    s = second;
    sum = 2;

    // System.out.println(f);
    System.out.println(s);

    for (int i = 3; ; i++) {
      int v = f + s;
      f = s;
      s = v;
      if (v % 2 == 0) {
        System.out.println(v);
        sum += v;
      }
      if (v > valueStop) {
        break;
      }
    }

    System.out.println(String.format("Sum is: %d", sum));
  }
}