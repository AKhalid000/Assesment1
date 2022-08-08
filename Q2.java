package com.Question2;

import java.util.Scanner;

import com.Question2.Deleting;
import com.Question2.Display;
import com.Question2.Modify;
import com.Question2.Signup;


public class App 
{
    public static void main( String[] args ) throws Exception
    {
        System.out.println("------Welcome to ABC International School -----------");
        System.out.println();
        Scanner sc=new Scanner(System.in);
        System.out.println("1.)Registration\t2.)Deletion\t3.)Modify\t4.)Display");
        System.out.println("Please Enter to operate it");
        int n=sc.nextInt();
        switch(n) {
        case 1: Signup.signup();
        break;
        case 2:try {
				Deleting.delete();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        break;
        case 3: Modify.modify();
        break;
        case 4:Display.display();
        break;
        }
        
    }
}
