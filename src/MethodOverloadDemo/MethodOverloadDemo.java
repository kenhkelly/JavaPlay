public class MethodOverloadDemo {

  void sumOfParams() { // First Version
    System.out.println("No parameters");
  }
  void sumOfParams(int a) { // Second Version
    System.out.println("One parameter: " + a);
  }
  int sumOfParams(int a, int b) { // Third Version
    System.out.println("Two parameters: " + a + " , " + b);
    return a + b;
  }
  double sumOfParams(double a, double b) { // Fourth Version
    System.out.println("Two double parameters: " + a + " , " + b);
    return a + b;
  }
  public static void main(String args[]) {
    MethodOverloadDemo moDemo = new MethodOverloadDemo();
    int intResult;
    double doubleResult;
    moDemo.sumOfParams();
    System.out.println();
    moDemo.sumOfParams(2);
    System.out.println();
    intResult = moDemo.sumOfParams(10, 20);
    System.out.println("Sum is  " + intResult);
    System.out.println();
    doubleResult = moDemo.sumOfParams(1.1, 2.2);
    System.out.println("Sum is  " + doubleResult);
    System.out.println();
  }
}