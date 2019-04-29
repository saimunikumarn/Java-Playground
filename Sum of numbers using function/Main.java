import java.util.Scanner;
class Main{
    public static int sum_of_digits(int num)
    {
      int sum = 0;
      for(int i = 0; i <= num; i++)
        sum = sum + i;
      return sum;
    }
	public static void main (String[] args){
	    // Type your code here
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      System.out.println(sum_of_digits(n));      
	}
}