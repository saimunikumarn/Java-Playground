import java.util.*;
import java.math.*;
class Main
{
  public static double power_of_number(int base, int exponent)
  {
    return Math.pow(base,exponent);
  }
  public static void main(String args[])
  {
    Scanner s = new Scanner(System.in);
    int base = s.nextInt();
    int exponent = s.nextInt();
    System.out.println(power_of_number(base, exponent));
  }
}