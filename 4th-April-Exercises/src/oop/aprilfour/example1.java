package oop.aprilfour;
import java.util.*;	

public class example1 {
		
	  public static int divideTwoNumbers(int number1,int number2) {
		  int result =number1/number2;
		  return result;
	  }
	  public static void main(String args[]) {
		  Scanner sc=new Scanner(System.in);
		  System.out.print("Enter the number 1 :");
		  int x= sc.nextInt();
		  System.out.print("Enter the number 2 :");
		  int y = sc.nextInt();
		  try {
		System.out.println("The answer is : "+ divideTwoNumbers(x,y) );
	  }
		  catch(ArithmeticException ex) {
			  System.out.print("Division by zero is not possible. ");
		  }
		  finally {
			  System.out.print("Thanks for using the application.");
		  }
	}
}
