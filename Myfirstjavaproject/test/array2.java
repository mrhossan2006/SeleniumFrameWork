package test;

public class array2 {
	public static void main(String[] args) {
		int [][] deba={{1,3,4},{5,7,8}};
		int [][] md={{1,3,4,6},{5,0,9}};
		System.out.println("this is for deba array ");
		display(deba);
		System.out.println("this is for md array");
		display(md);
	}


	private static void display(int x[][]) {
		for(int row=0;row<x.length;row++){
			for(int col=0;col<x[row].length;col++){
				System.out.println(x[row][col]+ "\t");
			}
			System.out.println();
		}	
	}		
}
