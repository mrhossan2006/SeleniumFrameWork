package test;

public class ConditionalStatement {

	public void ifStatement(){
		int x=10;
		if(x<20){
			System.out.println("this is only if Statement");
		}
	}
	public void ifelseStatement(){
		int x=30;
		if(x<20){
			System.out.println("This is if statement");
		}
		else{
			System.out.println("this is else ");
		}
	}
	public void NestedStatement(){
		int x=30;
		int y=10;
		if(x<35){
			if(y<15){
				System.out.println("This is nested if statement");
			}
		}
	}
	public void SwitchStatement(char grade){
		switch(grade){
		case 'A':System.out.println("Excilent");
		break;
		case 'B':System.out.println("Well done");
		break;
		case 'C':System.out.println("Average");
		break;
		case 'D':System.out.println("You arw passed");
		break;
		case 'F':System.out.println("Better try again");
		break;
		default:System.out.println("Invalid grade");

		}
		System.out.println("Your grade is:"+grade);
	}
	public void ConditionalOperator(){
		int a,b;
		a= 10;
		b=(a==1) ? 20:30;
		System.out.println("value of b is: "+b);
		b=(a==10)? 20:30;
		System.out.println("value of b is: "+b);
	}
}

