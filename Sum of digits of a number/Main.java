import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s. nextInt();
        int sum = 0, rem;
        while(n != 0)
        {
            rem = n%10;
            sum = sum + rem;
            n = n/10;
        }
        System.out.println(sum);
    }
}