package test;

import java.util.Scanner;

public class homework {
	public  static void sumNumber(){

		int A = 10;int B=10;
		int sum = A+B;
		System.out.println("value the number: "+sum);

	}
	public static void divnumber(){
		try {
			int A=10;int B=0;
			int div= A/B;
			System.out.println("print the value of: "+div);
		} catch (Exception e) {
			System.out.println("handled");
		}
	}
	{

		int A = 10;int B=10;
		int sum = A+B;
		System.out.println("value the number: "+sum);

	}
	
	//Try and catch format
	//Do and while
	public static void scannervalue(){

		int x=1;
		do{
			try {
				Scanner input = new Scanner(System.in);
				System.out.println("put the value");
				int A=input.nextInt();
				System.out.println("enter the number");
				int B=input.nextInt();
				int sum = A/B;
				System.out.println("enter the value:"+sum);
			}
			catch (Exception e) {
				System.out.println("enter the number again");
			}
		}
		while(x==1);
	}
}
