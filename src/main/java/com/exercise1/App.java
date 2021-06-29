package com.exercise1;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		//makes static reference or call
		exercise1();
    	primitives();
    	branching();
    	looping();
    	sum();
    	cases();
    	looping2();
    	sum();
    	cases();
    	looping2();
    	exercise9();
    	exercise10();
    	exercise11(14,5);
    	exercise12(15,13,12);
    	exercise13(23,21);
    	isPrime(332);
    	ascii('b');
		fizz();
    	
	}
	static void exercise1() {
    	System.out.println("Exercise 1");
    	System.out.println("Hello World");
    	System.out.println("*****************************");
    }
    
    static void primitives() {
    	System.out.println("Primitives");
    	int a = 9;
    	byte b = 5;
    	short c = 6;
    	long d = 34;
    	float e = 65f;
    	double f = 43.21;
    	
    	System.out.println("Int : " + a + "\nByte: " + b + "\nShort: " + c + "\nLong: " + d + "\nFloat: " + e + "\nDouble: " + f);
    	System.out.println("*****************************");
    }
    
    static void branching() {
    	System.out.println("Branching");
    	int x = 2, y = 5, z = 0;
    	if(x == 2 && y == 5 && z ==0) {
    		System.out.println(x==2);
    		System.out.println(x!=5);
    		System.out.println(x!=5 && y>=5);
    		System.out.println(z!=0 || x == 2);
    		System.out.println(!(y<10));
    	}
    	System.out.println("*****************************");
    }
    
    static void looping() {
    	System.out.println("Looping");
    	for(int i = 1; i<=10; i++) {
    		System.out.println(i);
    	}
    	System.out.println("*****************************");
    }
    
    static void sum() {
    	System.out.println("Sum");
    	int sum = 0;
    	for(int i = 0; i<=10; i++) {
    		sum+=i;
    		
    	}
    	System.out.println(sum);
    	System.out.println("*****************************");
    }
    
    static void cases() {
    	char an = 'a';
    	switch(an) {
    	case 'a' : System.out.println("a");
    	break;
    	default : System.out.println("default");
    	System.exit(1);
    	}
    	System.out.println("*****************************");
    }
    static void looping2() {
    	int age = 0;
    	outer :
    	while(true) {
    		System.out.println("outer");
    		while(true) {
    			age++;
    			System.out.println(age);
    			if(age == 16) {
        			System.out.println("Get your driver license");
        			continue;
        		}
    			else if(age == 21) {
    				break outer;
    			}
        		else{
        			System.out.println("Another year");
        			continue;
        		}
    		}
    		
    		
    	}
    }
    static void exercise9() {
    	
    	System.out.println("Enter 3 integers");
    	
    }
    
   static void exercise10() {
    	System.out.println(-5+(8*6));
    	System.out.println((55+9)%9);
    	System.out.println(20+(-3*5)/8);
    	System.out.println(5+(15/3)*2-(8%2));
    }
   //take input 2 input
   static void exercise11(int num1, int num2) {
	   int sum = num1+num2;
	   int multiply = num1*num2;
	   int sub = num1-num2;
	   //cast int to double
	   double divide = num1/(double)num2;
	   double rem = num1%num2;
	   
	   System.out.println("Sum: "+ sum + "\nMultiply: "+ multiply + "\nSubtraction: "+ sub + "\nDivide: " + divide + "\nRemainder: "+ rem);
   }
   
   static void exercise12(int num1,int num2, int num3) {
	   double average = (num1+num2+num3)/3.0;
	   System.out.println(average);
   }
   
   static void exercise13(int num1, int num2) {
	   int temp;
	   temp= num1;
	   num1=num2;
	   num2=temp;
   }
   
   static void isPrime(int num) {
	   boolean prime = false; 
	   int i = 0;
	   
	   //check for non prime numbers
	   while(i <=num / 2) {
		   if(num % i == 0) {
			   prime = true;
			   break;
		   }
		   i++;
	   }
	   if(!prime) {
		   System.out.println(num + " is a prime number");
	   }else {
		   System.out.println(num + " is not a prime number");
	   }
   }
   
   static void ascii(char a) {
	   int val = a;
	   System.out.println(val);
   }
   
   static void fizz() {
	   for(int i = 1; i<=100; i++) {
		   
		   if(i%3 == 0 && i%5 == 0) {
			   System.out.println("FizzBuzz");
		   }
		   else if(i%5 == 0) {
			   System.out.println("Buzz");
		   }
		   else if(i%3 == 0) {
			   System.out.println("Fizz");
		   }
		   else {
			   System.out.println(i);
		   }
		   
	   }
   }
   
   

}
