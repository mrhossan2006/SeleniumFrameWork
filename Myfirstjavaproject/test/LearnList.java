package test;

import java.util.ArrayList;
import java.util.List;

public class LearnList {
	ArrayList<String>lststr=new ArrayList<String>();
	
   public void listString() {
		lststr.add("one");
		lststr.add("two");
		lststr.add("three");
		lststr.add("four");
		lststr.add("five");
		System.out.println("list value is: "+lststr);
		}
   public void AaaValueToTheList(){
	   lststr.add("six");
	   lststr.add("seven");
	   System.out.println("list the value is: "+lststr);
	   }
   public void RemoveValueForTheList(){
	   lststr.remove("three");
	   System.out.println("list the value is: "+lststr);

	}

}
