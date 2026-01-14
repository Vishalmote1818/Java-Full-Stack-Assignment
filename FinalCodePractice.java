public interface FinalCodePractice {
    
// Fibonacci Series
    package ControlFlow;
import java.util.Scanner;

public class FibonacciNum {

	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		
		sc.close();
		
		for(int i=0;i<n;i++) {
			
			System.out.println(fib(i));
		}
	}
	
	public static int fib(int n) {
		
		if(n<=1) {
			return 1;
			
		}
		
		return fib(n-1)+fib(n-2);
	}
}

// Prime Number

package ControlFlow;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		
		boolean isPrime=true;
		
		if(n<=1) {
			isPrime=false;
			
		}
		
		for(int i=2;i<=Math.sqrt(n);i++) {
			
			if(n%i==0) {
				
				isPrime=false;
			}
		}
		
		if(isPrime) {
			
			System.out.println(n+" is prime number");
		}
		
		else {
			
			System.out.println(n+" is not a prime number.");
		}
	}
}


// Reverse Number

package ControlFlow;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int n=sc.nextInt();
		
		int rev=0;
		
		while(n>0) {
			int rem=n%10;
			rev=rev*10+rem;
			n/=10;
		}
		
		System.out.println("Reverse Number: "+rev);
		
	}
}

// Even Odd

package ControlFlow;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		
		if(n%2==0) {
			System.out.println(n+" is a Even number");
		}
		else {
			
			System.out.print(n+" is Odd number");
		}
		
	}
}


// LCM

package ControlFlow;

import java.util.Scanner;

public class LCMNum {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the 1st number: ");
        int n1 = sc.nextInt();

        System.out.print("Enter the 2nd number: ");
        int n2 = sc.nextInt();

        int lcm = Math.max(n1, n2);

        while (true) {
            if (lcm % n1 == 0 && lcm % n2 == 0) {
                break;
            }
            lcm++;
        }

        System.out.println("LCM = " + lcm);
        sc.close();
    }
}

// Armstrong NUmber

package ControlFlow;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int n=sc.nextInt();
		
		int temp=n;
		int sum=0;
		while(temp>0) {
			int rem=temp%10;
			sum+=Math.pow(rem, 3);
			temp/=10;
			
		}
		
		if(sum==n) {
			System.out.println(n+" is a Armstrong number.");
			
		}
		
		else {
			
			System.out.println(n+ " is not an Armstrong number.");
		}
		
		sc.close();
	}
}





}
