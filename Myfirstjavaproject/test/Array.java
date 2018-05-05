package test;
class Array extends Thread{
	public void run() {
		for(int i=0; i<=10;i++){
			System.out.println(i);
		}
		
	}
public static void main(String[] args) {
	Array obj = new Array();
	obj.start();
	overload addon = new overload();
	addon.add(10, 10);
	addon.add("NY", "PA");
}	
}
class overload {

	public void add(int a, int b){
		int sum = a+b;
		System.out.println(sum);
	}
	public void add(String a, String b){
		String sum = a+b;
		System.out.println(sum);
}
	
}



