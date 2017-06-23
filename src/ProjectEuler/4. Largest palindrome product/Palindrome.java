public class Palindrome {

  public static void main(String[] args) {
    int pm = 0;
    outerloop:
    for (int i = 999; i > 99; i--) {
      for (int u = 999; u > 99; u--) {
        int m = i * u;
        String mstr = Integer.toString(m);
        String mrstr = new StringBuilder(mstr).reverse().toString();
        if (mstr.equals(mrstr)) {
          System.out.println(String.format("%d*%d=%d | %s | %s", i, u, m, mstr, mrstr));
          pm = Math.max(m, pm);
        }
      }
    }
    System.out.println(String.format("Biggest Palindrome: %d", pm));
  }
}