package com.Question2;

import java.util.Scanner;

import com.Question2.DBCON;
import com.Question2.Student;

public class Modify {

	public static void modify() throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Roll no to update Fees");
		int roll=sc.nextInt();
		Student st=new Student();
		st.setRoll(roll);
		DBCON db=new DBCON();
		db.modi(st.getRoll());
		
		
	}
	
}
