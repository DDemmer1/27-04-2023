package de.demmer.dennis;

import java.util.ArrayList;

public class Application {
		
	public static void main(String[] args) {
		
		Object[] a3 = new Object[10];
		
		a3[0] = "Hallo Welt";
		a3[1] = 2;
		
		// |  0  |  0  |  0  |
		int[] a1 =  new int[3];

		// |  1  |  2  |  3  |
		int[] a2 = {1,2,3};
		
		
		int i = a2[0];
		a2[0] = 5; 
		
		
//		System.out.println(a3.length);
//		
//		System.out.println(a1[0]);
		
		
		// Primitiver Datentyp int
		int i2 = 5;
	
		
		//Wrapper Klasse für int
		Integer i3 = 5;
		
		
		
		ArrayList<Integer> list = new ArrayList<Integer>();
	
		list.add(5);
		list.add(2);
		list.add(1);
		
		
		System.out.println(list.size());
		
		
		
		
	}

}
