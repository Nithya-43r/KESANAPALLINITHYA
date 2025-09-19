package TandemloopExam;

import java.util.Scanner;

public class OddNumberSeries {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int a=sc.nextInt();
		System.out.println("Output is:");
		for(int i=1;i<=a;i++) {
			int oddNumber=2*i-1;
			System.out.print(oddNumber);
			
		if(i<a) {
			System.out.print(", ");
		}
		}
	}
}
