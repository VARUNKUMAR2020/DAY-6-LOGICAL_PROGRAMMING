package Logical_programming.day6;
import java.util.*;
public class Logical_program 
{
	static int Fibonacci(int n) {
    	if(n==1)
    	{
    		System.out.println(0+", ");
    		return 0;
    	}
    	if(n==2)
    	{
    		System.out.println(1+", ");
    		return 1;
    	}
    	System.out.print("Fibonacci series is: " + 0 +", ");
    	System.out.print(1+", ");
    	int n1=0, n2=1, n3=0;
    	for(int i=0; i<n-2; i++)
    	{
    		n3=n2+n1;
    		n1=n2;
    		n2=n3;
    		System.out.print(n3+ ", ");
    	}
    	return n3;
    }
    public static void main( String[] args )
    {
        System.out.println( "WELCOME TO LOGICAL PROGRAMS" );
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to get Fibonacci: ");
        int n = sc.nextInt();
        int term = Fibonacci(n);
        System.out.println(n+"th term is: "+ term);
       
        System.out.println(" ");
        System.out.println(" ");
        Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int b = s.nextInt();
    		int sum=0;
    		for(int i=1; i<b; i++) 
    		{
    			if(b%i == 0) {
    				sum+=i;
    			}
    		}

    		if(sum==b) 
    			System.out.println(b +" is a perfect number");

    		else
    			System.out.println(b +" is not a perfect number");
    		
    		  System.out.println(" ");
    	      System.out.println(" ");
    	      Scanner r = new Scanner(System.in);
    		  System.out.println("Enter a number");
    		  int num = r.nextInt();
    		  int reverse = 0;
    			int temp = num;
    			while(temp>0)
    			{
    				int remaindar = temp % 10;
    				reverse = reverse*10 + remaindar;
    				temp=temp/10;
    				System.out.println(reverse);
    }
}
}