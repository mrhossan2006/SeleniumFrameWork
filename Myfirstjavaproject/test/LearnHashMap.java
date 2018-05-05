package test;

import java.util.*;
public class LearnHashMap {
	public void HashMap(){
		HashMap<String,String> hmap =new HashMap<String,String>();
		hmap.put("Wells fargo","my bank name");
		hmap.put("New York","my state name");
		System.out.println(hmap.get("New York"));
	}
	public void openBrawser(){
		HashMap<String,String> browserName=new HashMap<String,String>();
		browserName.put("IE","iexplore.exp");
		browserName.put("firefox","firefox.exp");
		System.out.println(browserName.get("firefox"));
	}

}
