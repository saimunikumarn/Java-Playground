import java.util.*;
class Main 
{
static boolean isPrime(int n) 
{ 
  if (n <= 1) 
	return false; 
for (int i = 2; i < n; i++) 
	if (n % i == 0) 
		return false; 
return true; 
} 
static void printPrime(int n) 
{ 
for (int i = 2; i <= n; i++) 
{ 
	if (isPrime(i)) 
		System.out.println(i); 
} 
} 

public static void main(String[] args) 
{ 
  Scanner s = new Scanner(System.in);	
  int n = s. nextInt(); 
	printPrime(n); 
} 
}
