package test;

import java.util.Scanner;

public class swtchstatements {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter your score number ");
		int x=1;
		do{
		try {
			int a = input.nextInt();
			if(a>=90){
				System.out.println("Your Grade is A ");
			}
			if(a>=60 && a<=89){
				System.out.println("Your Grade is B ");
			}	
			if(a>=30 && a<=59){
				System.out.println("Your Grade is C ");
			}
			if(a<=29){
				System.out.println("Your Grade is fail ");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		}
		while(x==1);
	}


}

