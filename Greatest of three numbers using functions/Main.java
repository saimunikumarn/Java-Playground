import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner s = new Scanner(System.in);
      int n1 = s.nextInt();
      int n2 = s.nextInt();
      int n3 = s.nextInt();
      if(n3 > bigger(n1, n2))
        System.out.println(n3);
      else
        System.out.println(bigger(n1, n2));
	}
  public static int bigger(int n1, int n2)
  {
    if(n1 > n2)
      return n1;
    else return n2;
  }
}