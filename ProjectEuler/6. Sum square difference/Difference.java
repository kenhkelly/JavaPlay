public class Difference {


  public static void main(String[] args) {
    int start = 1;
    int stop = 100;

    int sumSquares = 0;
    int sum = 0;

    for (int i = start; i <= stop; i++) {
      sumSquares += Math.pow(i, 2);
      sum += i;
    }
    sum = (int) Math.pow(sum, 2);

    System.out.println(String.format("Sum of squares: %d | Sum: %d | diff: %d", sumSquares, sum, sum - sumSquares));

    // System.out.println(nums);
  }
}