package test;


public class overloading {
	public void addnum(int a, int b){
		int sum=a+b; 
		System.out.println("show the number:"+sum);
        }
	public void addnum(String a, String b){
		String sum = a+b;
		System.out.println("show the value:"+ sum);
	}
	
	public static void main(String[] args) {
		overloading objoverloading = new overloading();
		objoverloading.addnum(10, 20);
		objoverloading.addnum("NY  ", "NJ");
	
	}


}
