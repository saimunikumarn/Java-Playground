import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner s = new Scanner(System.in);
      int number = s.nextInt();
      int First_Digit = 0, Last_Digit, sum;
      Last_Digit = number % 10;
      while(number > 1)
      {
        First_Digit = number;
        number = number/10;
      }
      sum= First_Digit + Last_Digit;
      System.out.println(sum);
    }
}