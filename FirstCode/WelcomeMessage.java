package FirstCode;
import java.lang.*;
class WelcomeMessage
{
  public static void printMessage()
  {
      System.out.println("Hello World");
  }
}
class Myclass
{
   public static void main(String  []args)
   {
      WelcomeMessage obj=new  WelcomeMessage ();
      obj.printMessage();
   }
}