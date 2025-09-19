package TandemloopExam;

import java.util.Scanner;

public class OddSeriesWithEven {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int a=sc.nextInt();
		if(a%2==0) {
			a=a-1;
		}
		System.out.println("Output is:");
		for(int i=1;i<=a;i+=2) {
			System.out.print(i);
			
		 if(i+2<=a) {
			System.out.print(", ");
		}
		
		}
	}

}
