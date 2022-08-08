package com.Question2;

import java.sql.Connection;
import java.util.Scanner;

import com.Question2.DBCON;
import com.Question2.Student;
import com.Question2.Validat;

public class Signup {
	public static void signup() {
		Scanner sc= new Scanner(System.in);
		Validat vali=new Validat();
		DBCON db=new DBCON();
		 try{
			  Connection con=db.getConnection();
			  System.out.println("Enter Roll No : ");
			  int rollno=sc.nextInt();
			  int k=rollno;

			  sc.nextLine();
			  System.out.println("Enter Student Name : ");
			  String studentname=sc.nextLine();
			  System.out.println("Enter Class Standard in Roman (I to X) :");
			  String standard=sc.nextLine();
			  System.out.println("Enter Date of Birth yyyy-mm-dd");
			  String dob=sc.nextLine();
			  System.out.println("Enter fees");
			  double fees=sc.nextDouble();
			  Student s=new Student(rollno,studentname.toUpperCase(),standard.toUpperCase(),dob,fees);
			  System.out.println(db.insert(s));
		  }catch(Exception e) {
				 
		  }
		  
		 
	}
}
