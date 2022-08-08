package com.Question2;

import java.util.Scanner;

import com.Question2.DBCON;
import com.Question2.Student;

public class Display {
		public static void display() throws Exception {
			Scanner sc=new Scanner(System.in);
			Student st=new Student();
			System.out.println("Enter Your Roll Number");
			int roll=sc.nextInt();
			st.setRoll(roll);
			DBCON db=new DBCON();
			try {
				db.disp(st.getRoll());
			} catch (Exception e) {
			
			}
		}
}
