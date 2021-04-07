package interview.preparationkit.test;

import java.util.ArrayList;
import java.util.Arrays;

public class Vowel {
	
//	public static ArrayList<String> vowel = (ArrayList<String>) Arrays.asList("a","e","i","o","u"); 
	
	private static Solution1 sol1;
	
	public static void main(String[] args) {
		
		
//		sol1 = new Solution1();
//		takeDemo(sol1);
		
		try {
			handle("x");
		}catch(Exception e) {
			System.out.println("exe");
		}
		handle("x");
		
//		String input = "awuichuaeio";
//		
//		findSubstring(input);
	}

	private static int handle(String args) {
		// TODO Auto-generated method stub
		return Integer.parseInt(args);
	}

	private static void takeDemo(Solution1 sol12) {
		sol12 = null;
		sol12 = new Solution1();
	}

//	private static void findSubstring(String input) {
//		
//		int count = 0;
//		StringBuffer sb = new StringBuffer();
//		
//		String inputs[] = input.split("");
// 		for (int i = 0; i < inputs.length; i++) {
//			
// 			if(vowel.contains(inputs[i])) {
// 				++count;
// 				sb.append(inputs[i]);
// 				vowel.remove(inputs[i]);
// 			}
// 			
// 			
// 			
//		}
//	}

}
