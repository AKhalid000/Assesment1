package com.Question;

import java.util.HashMap;

public class Q1 {

	public static void main(String[] args) {
		CMap cm = new CMap();
		
		cm.saveCC("India", "Delhi");
		cm.saveCC("Japan", "Tokyo");
		
		System.out.println(cm.getCapital("Japan"));
		System.out.println(cm.getCountry("Delhi"));
		
		System.out.println(cm.toArrayList());
		
		HashMap<String, String> M2 = cm.sKV();
		System.out.println(M2);
		
		

	}

}
