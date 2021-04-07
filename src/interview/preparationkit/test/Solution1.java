package interview.preparationkit.test;

import java.util.Scanner;

class A {}

class B extends A {}

class C extends B {}

public class Solution1 {

	private static final Scanner sc = new Scanner(System.in);
	
	
	
	public static void main(String[] args) {
		
		int rows = 3;
		
		String grid[] = new String[]{". .",". .","# #"};
		
		int maxTime = 2;
		
		int column = grid[0].split(" ").length;
		
		String array[][] = new String[rows][column];
		
		for(int i = 0; i<rows;i++) {
			String row[] = grid[i].split(" ");
			
			for(int j=0; j<column;j++) {
				array[i][j]=row[j];
			}
		}
		reachToEnd(array, maxTime);
	}



	private static void reachToEnd(String[][] array, int maxTime) {
		// TODO Auto-generated method stub
		
	}
	
}
