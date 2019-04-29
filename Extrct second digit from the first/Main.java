import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s. nextInt();
        int rev = 0, rem, n1;
        while(n != 0)
        {
            rem = n%10;
            rev = rev * 10 +rem;
            n = n/10;
        }
        n1 = rev / 10;
        n1 = n1 % 10;
        System.out.println(n1);
    }
}