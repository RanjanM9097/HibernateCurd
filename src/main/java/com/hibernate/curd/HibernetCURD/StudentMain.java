package com.hibernate.curd.HibernetCURD;

import java.util.Scanner;

public class StudentMain 
{
    public static void main( String[] args )
    {
    	Scanner scn = new Scanner(System.in);
    	System.out.println("Choose to perform Curd Operation in Hibernate ");
    	while(true) {
    	System.out.println("Enter 1 to Insert \n Enter 2 to update \n Enter 3 to read \n Enter 4 to Delete ");
    	System.out.println("Do you want exit then enter 5 ");
    	int x=scn.nextInt();
    	switch(x){
    	case 1:
    	CreateStudent creatstudent = new CreateStudent();
    	creatstudent.insertData();
    	System.out.println("Insert Successfull");
    	break;
    	case 2:
    	UpdateStudent update = new UpdateStudent();
    	
    	update.updatebyid();
    	System.out.println("update Successfull");
    	break;
    	case 3:
    	ReadStudent read = new ReadStudent();
    	
    	read.retriveList();
    	System.out.println("Retrive  Successfull");
    	break;
    	case 4:
    	DeleteStudent delete = new DeleteStudent();
    	
    	delete.deletebyid();
    	System.out.println("delete Successfull");
    	break;
    	case 5:
    		
    	break;
    	
    	default:
    		System.out.println("Thanks ");
    		}
    	
    	System.out.println("Thanku user " );
    	System.exit(0);
    	}
    	
    	
        
    }
}
