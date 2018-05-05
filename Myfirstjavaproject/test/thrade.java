package test;

class thrade extends Thread {

	public void run() {
		int a=10;
		for(int i=0;i<10;i++){
			System.out.println("print the value:"+i);
		}
	}
	public static void main(String[] args) {
		thrade objthrade = new thrade();
		objthrade.start();
	}
}
