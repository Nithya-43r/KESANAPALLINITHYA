package TandemloopExam;

import java.util.Scanner;

public class SimpleCalculator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number:");
	     double a=sc.nextDouble();
	     
	     System.out.println("Enter second number:");
	     double b=sc.nextDouble();
	   		sc.nextLine();
	     
	     System.out.println("Enter operation (add,subtract,multiply,divide): ");
	    
		String operation=sc.nextLine().toLowerCase();
		double result;
		switch(operation) {
		case "add":
			result=a+b;
			System.out.println("result: "+result);
			break;
		case "subtract":
			result=a-b;
			System.out.println("result: "+result);
			break;
		case "multiply":
			result=a*b;
			System.out.println("result: "+result);
			break;
		case "divide":
			if(b!=0) {
				result=a/b;
				System.out.println("result: "+result);
			}else {
				System.out.println("Error: Division by zero!");
			}
			break;
			default:
				System.out.println("Invalid operation");
			
	 }
  }
}

	
