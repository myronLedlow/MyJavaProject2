package aList;
import java.util.*;


import java.io.*;
import java.util.ArrayList;



import java.util.Scanner;





public class EmployeeTester {
	// main method
	public static void main(String [] args) throws IOException {
	// open file
	// open Scanner
	//open FileWriter
	File file = new File("uabEmployee.txt");	
	Scanner in = new Scanner(file);
	
	Scanner uinput = new Scanner(new InputStreamReader(System.in));
	
	
	
	
	// try catch clause to catch an input mismatch exception, i.e., if someone enters a string instead of an int and vice versa
	
	try {
	// Create my array list of type Employee(the super class)
	ArrayList<Employee> elist = new ArrayList<Employee>(50);
	ArrayList<Doctor> dlist = new ArrayList<Doctor>(10);
	ArrayList<Nurse> nlist = new ArrayList<Nurse>(10);
	ArrayList<Administrator> alist = new ArrayList<Administrator>(10);
	ArrayList<Receptionist> rlist = new ArrayList<Receptionist>(10);
	ArrayList<Janitor> jlist = new ArrayList<Janitor>(10);
	ArrayList<Surgeon> slist = new ArrayList<Surgeon>(10);
	ArrayList<Employee> hlist = new ArrayList<Employee>(10);
	
	
	// Contents of Employee Menu
	
	System.out.println("************************** Main Menu **************************\n");
	
	System.out.println( "\n");
		
		// Count variables
		// choice variables used to store user input
		// menu options are chosen based on the values of these choice variables
	    // variables to store the object fields
	   // String arrays used to collect the split lines from the text file into object fields
	// then I add them all to one array list of type Employee
	// I use polymorphism in order to store all objects in the array list of type Employee
		
		int count = 0;
		int ecount = 0;
		int dcount = 0;
		int ncount = 0;
		int acount = 0;
		int rcount = 0;
		int jcount = 0;
		int scount = 0;
		int choice;
		int addchoice;
		int removechoice;
		
		String line = "";
		String role;
		String name;
		String blazer;
		String special;
		String dept;
		String talking;
		int numpatients;
		String operate;
		String sweeping;
		String[] hosemp;
		String[] doctor;
		String [] nurse;
		String [] admin;
		String[] receptionist;
		String[] janitor;
		String[] surgeon;
				
		// While loop to go through each line of the text file
		while(in.hasNextLine()) {
			count++;
			
		
			
				line = in.nextLine();
			
			
			 
				// Conditions for which words from a line go into which object fields
		
				if(line.startsWith("E ")) {
					hosemp = line.split(" ");
					role = hosemp[0];
					name = hosemp[1];
					blazer = hosemp[2];
				ecount++;
				
				Employee e = new Employee(role,name,blazer);
				hlist.add(e);
				elist.add(e);
				
				
				
				}
				
			
			
				
				
			
			
			if(line.startsWith("D ")) {
				doctor = line.split(" ");
				role = doctor[0];
				name = doctor[1];
				blazer = doctor[2];
				special = doctor[3];
				dcount++;
				Employee d = new Doctor(role,name,blazer,special);
				Doctor d2 = new Doctor(role,name,blazer,special);
				elist.add(d);
				dlist.add(d2);
				
				
			   
				
			
			}	
			  
			  if(line.startsWith("N ")) {
				  nurse = line.split(" ");
				  role = nurse[0];
				  name = nurse[1];
				  blazer = nurse[2];
				  numpatients = Integer.parseInt(nurse[3]);
				  ncount++;
				  Employee n = new Nurse(role,name,blazer,numpatients);
				  Nurse n2 = new Nurse(role,name,blazer,numpatients);
				  elist.add(n);
				  nlist.add(n2);
			  }
			  
			  
			  if(line.startsWith("A ")) {
				  admin = line.split(" ");
				  role = admin[0];
				  name = admin[1];
				  blazer = admin[2];
				  dept = admin[3];
				  acount++;
				  Employee a = new Administrator(role,name,blazer,dept);
				  Administrator a2 = new Administrator(role,name,blazer,dept);
				  elist.add(a);
				  alist.add(a2);
				  
			  }
			  
			  
			  if(line.startsWith("R ")) {
				  receptionist = line.split(" ");
				  role = receptionist[0];
				  name = receptionist[1];
				  blazer = receptionist[2];
				  dept = receptionist[3];
				  talking = receptionist[4];
				  rcount++;
				  Employee r = new Receptionist(role,name,blazer,dept,talking);
				  Receptionist r2 = new Receptionist(role,name,blazer,dept,talking);
				  elist.add(r);
				  rlist.add(r2);
				 
			  }
			  
			  
			  if(line.startsWith("J ")){
				  janitor = line.split(" ");
				  role = janitor[0];
				  name = janitor[1];
				  blazer = janitor[2];
				  dept = janitor[3];
				  sweeping = janitor[4];
						  
				  jcount++;
				  Employee j = new Janitor(role,name,blazer,dept,sweeping);
				  Janitor j2 = new Janitor(role,name,blazer,dept,sweeping);
				  elist.add(j);
				  jlist.add(j2);
				  
			  }
			  
			  
			  if(line.startsWith("S ")) {
				  surgeon = line.split(" ");
				  role = surgeon[0];
				  name = surgeon[1];
				  blazer = surgeon[2];
				  special = surgeon[3];
				  operate = surgeon[4];
				  scount++;
				  Employee s = new Surgeon(role,name ,blazer,special,operate);
				  Surgeon s2 = new Surgeon(role,name,blazer,special,operate);
				  elist.add(s);
				  slist.add(s2);
				  
			  }
			  
			  
			  
		}
			  
		
		
			
		// Menu Display
		 // Displays the total number of Employees (or total number of lines) found in text file		
		 System.out.println("***********************" + "\n" + "Total number of Employees on record: " +count);
		 System.out.println("\n"  + "***********************" + "\n");
		
		
		 System.out.println("Do you want to display the Employees? : 1 for Yes or 2 for No");
	     int displayoption = uinput.nextInt();
	     
	     if(displayoption == 1) {
	    	 System.out.println("Which employees do you want to display?" + "\n" +  "Enter 1 for Hospital Employee, 2 for Doctor, 3 for Nurse, 4 for Adminstator, 5 for Receptionist, 6 for Janitor, 7 for Surgeon and 8 to display them all : ");
	    	 int displaychoice = uinput.nextInt();
	    	 
	    	 if(displaychoice == 1) {
	    		 System.out.println("Hospital employees : " + ecount);
	    		 for(Employee item:hlist) {
	    			System.out.println("\n" + item.Display());
	    		}
	    		
	    	 }
	    	 
	    	 if(displaychoice == 2) {
	    		 System.out.println("The number of Doctors : " + dcount);
	    		 for(Doctor item: dlist) {
	    			 System.out.println("\n" + item.Display());
	    		 }
	    	 }
	    	 
	    	 if(displaychoice == 3) {
	    		 System.out.println("The number of Nurses : " + ncount);
	    		 for(Nurse item:nlist) {
	    			 System.out.println("\n" + item.Display());
	    		 }
	    	 }
	    	 
	    	 if(displaychoice == 4) {
	    		 System.out.println("The number of Administrators : " + acount);
	    		 for(Administrator item: alist) {
	    			 System.out.println("\n" + item.Display());
	    		 }
	    	 }
	    	 
	    	 if(displaychoice == 5) {
	    		 System.out.println("The number of Receptionists : " + rcount);
	    		 for(Receptionist item: rlist) {
	    			 System.out.println("\n" + item.Display());
	    		 }
	    	 }
	    	 
	    	 if(displaychoice == 6) {
	    		 System.out.println("The number of Janitors : " + jcount);
	    		 for (Janitor item: jlist) {
	    			 System.out.println("\n" + item.Display());
	    		 }
	    	 }
	    	 
	    	 if(displaychoice == 7) {
	    		 System.out.println("The number of Surgeons : " + scount);
	    		 for(Surgeon item: slist) {
	    			 System.out.println("\n" + item.Display());
	    		 }
	    	 }
	    	 
	    	 if(displaychoice == 8) {
	    		 System.out.println("***********************" + "\n" + "Total number of Employees on record: " +count);
	    		 for(Employee item: elist) {
	    			 System.out.println("\n" + item.Display());
	    		 }
	    	 }
	    	 
	    	 if((displaychoice > 8) || (displaychoice < 1)){
	    		 System.out.println("Sorry, your input does not match the available options...try again later...");
	    	 }
	    	 
	    	 
	    /** 
		 System.out.println("************* Employee List *************");
		 for(Employee eitem:elist) {
				System.out.println(eitem.Display());
			}
		 
		 // Print out the the values of all the count variables
		 // Displays the number of the individual kinds of employees found in the text file
		 
		 System.out.println("\n" + "\n");
		 System.out.println("Hospital employees : " + ecount);
		 System.out.println("The number of Doctors : " + dcount);
		 System.out.println("The number of Nurses : " + ncount);
		 System.out.println("The number of Administrators : " + acount);
		 System.out.println("The number of Receptionists : " + rcount);
		 System.out.println("The number of Janitors : " + jcount);
		 System.out.println("The number of Surgeons : " + scount);
		 */
		
	     }
	     
	     
	    
			
		    
			 
		 // Displays the menu options
		 
		 System.out.println("\n" + " Enter 1 to add  Employee:   ");
		 System.out.println("\n" + " Enter 2 to remove  Employee :  ");
		
		 System.out.println("\n" + "Enter 3 to exit : ");
		 
		 choice = uinput.nextInt();
		 
			 
		 
		 System.out.println("\n" + "\n");
		
		 // If the user wants to add an employee
		 
		 if (choice == 1) {
			 System.out.println("Enter the type of Employee: ");
			 System.out.println("1 for Hospital Employee, 2 for Doctor, 3 for Nurse, 4 for Administrator, 5 for Receptionist, 6 for Janitor, 7 for Surgeon");
			  addchoice = uinput.nextInt();
			 if (addchoice == 1) {
				 
				 System.out.println("Enter the name of the employee: ");
				 String newname = uinput.next();
				 System.out.println("Enter the blazer id" );
				 String newblazer = uinput.next();
				 Employee newemp = new Employee("E ",newname,newblazer);
				 elist.add(newemp);
				 hlist.add(newemp);		
					
			 }
			 
			 if (addchoice == 2) {
				 
				 System.out.println("Enter the name of the employee: ");
				 String newname = uinput.next();
				 System.out.println("Enter the blazer id" );
				 String newblazer = uinput.next();
				 System.out.println("Enter the speciality: ");
				 String newspecial = uinput.next();
				 Employee newemp = new Doctor("D ",newname,newblazer,newspecial);
				 Doctor newemp2 = new Doctor("D ",newname,newblazer,newspecial);
				 elist.add(newemp);
				 dlist.add(newemp2);		
				 
				 
				 
				 
			 }
			 
			 if (addchoice == 3) {
				 System.out.println("Enter the name of the employee: ");
				 String newname = uinput.next();
				 System.out.println("Enter the blazer id" );
				 String newblazer = uinput.next();
				 System.out.println("Enter the number of patients: ");
				 int newnumpatients = uinput.nextInt();
				 Employee newemp = new Nurse("N ", newname,newblazer,newnumpatients);
				 Nurse newemp2 = new Nurse("N ", newname,newblazer,newnumpatients);
				 elist.add(newemp);
				 nlist.add(newemp2);
				 		
				 
				 
				 
				 
				 
				 
			 }
			 
			 if (addchoice == 4) {
				 System.out.println("Enter the name of the employee: ");
				 String newname = uinput.next();
				 System.out.println("Enter the blazer id" );
				 String newblazer = uinput.next();
				 System.out.println("Enter the Department: ");
				 String newdept = uinput.next();
				 Employee newemp = new Administrator("A ",newname,newblazer,newdept);
				 Administrator newemp2 = new Administrator("A ",newname,newblazer,newdept);
				 elist.add(newemp);
				 alist.add(newemp2);
				 		
				 
				 
				 
			 }
			 
			 if (addchoice == 5) {
				 System.out.println("Enter the name of the employee: ");
				 String newname = uinput.next();
				 System.out.println("Enter the blazer id" );
				 String newblazer = uinput.next();
				 System.out.println("Enter the dept: ");
				 String newdept = uinput.next();
				 System.out.println("Enter whether they are talking or not... Y or N : ");
				 String newtalk = uinput.next();
				 Employee newemp = new Receptionist("R ",newname,newblazer,newdept,newtalk);
				 Receptionist newemp2 = new Receptionist("R ",newname,newblazer,newdept,newtalk);
				 elist.add(newemp);
				 rlist.add(newemp2);
				 		
				 
				 
				 
			 }
			 
			 if (addchoice == 6) {
				 
				 System.out.println("Enter the name of the employee: ");
				 String newname = uinput.next();
				 System.out.println("Enter the blazer id" );
				 String newblazer = uinput.next();
				 System.out.println("Enter the dept: ");
				 String newdept = uinput.next();
				 System.out.println("Enter whether they are sweeping or not... Y or N : ");
				 String newsweep = uinput.next();
				 Employee newemp = new Janitor("J ",newname,newblazer,newdept,newsweep);
				 Janitor newemp2 = new Janitor("J ",newname,newblazer,newdept,newsweep);
				 
				 elist.add(newemp);
				 jlist.add(newemp2);
				 						 
				 
				 
			 }
			 
			 if (addchoice == 7) {
				 System.out.println("Enter the name of the employee: ");
				 String newname = uinput.next();
				 System.out.println("Enter the blazer id" );
				 String newblazer = uinput.next();
				 System.out.println("Enter the speciality: ");
				 String newspecial = uinput.next();
				 System.out.println("Enter whether they are operating or not... Y or N : ");
				 String newoperate = uinput.next();
				 Employee newemp = new Surgeon("S ",newname,newblazer,newspecial,newoperate);
				 Surgeon newemp2 = new Surgeon("S ",newname,newblazer,newspecial,newoperate);
				 elist.add(newemp);
				 slist.add(newemp2);
				 
				 		
				 
			 } 
				 
			 
			 for (Employee item:elist) {
					
				 	 System.out.println(item.Display() + "\n");
				 	 
					
					
					
				
						
					}
			 /**
			 System.out.println("\n" +"Hospital employees : " + ecount);
			 System.out.println("The number of Doctors : " + dcount);
			 System.out.println("The number of Nurses : " + ncount);
			 System.out.println("The number of Administrators : " + acount);
			 System.out.println("The number of Receptionists : " + rcount);
			 System.out.println("The number of Janitors : " + jcount);
			 System.out.println("The number of Surgeons : " + scount);
			*/
			 
			 
			 
			 
			 
			
			 
			 
			 
			 
				 
				
			 
			}
		 // User wants to remove an employee
		 if (choice == 2) {
			 String blazerfind;
			 System.out.println( "\n" + " Enter the Employee's role: ");
			 System.out.println("\n" + " Enter  1 for Hospital Employee, 2 for Doctor, 3 for Nurse, 4 for Administrator, 5 for Receptionist, 6 for Janitor, 7 for Surgeon");
			 removechoice = uinput.nextInt();
			 
			 System.out.println("Enter the blazer id: ");
			 blazerfind = uinput.next();
			 if (removechoice == 1) {
				
				 
				 for (int i = 0; i < hlist.size();i++) {
					 
						if (hlist.get(i).getBlazer().contains(blazerfind)) {
							elist.remove(i);
							hlist.remove(i);
							
						}
						
				 }
						
				 
				 
				
				 
				
				}
				
					 
			 	 
					 
				 
			 
			 
			 if (removechoice == 2) {
				 
				 for (int i = 0; i < dlist.size();i++) {
						if (dlist.get(i).getBlazer().contains(blazerfind)) {
							elist.remove(i);
							dlist.remove(i);
							
						}
						
				 
				 
				
				 }
			 }
			 
			 if (removechoice == 3) {
				 
				 for (int i = 0; i < nlist.size();i++) {
						if (nlist.get(i).getBlazer().contains(blazerfind)) {
							elist.remove(i);
							nlist.remove(i);
						}
						
				 
				
				 }
			 }
			 
			 if (removechoice == 4) {
				 
				 for (int i = 0; i < alist.size();i++) {
						if (alist.get(i).getBlazer().contains(blazerfind)) {
							elist.remove(i);
							alist.remove(i);
						}
						
				 
				 
				
				 }
			 }
			 
			 if (removechoice == 5) {
				 
				 for (int i = 0; i < rlist.size();i++) {
						if (rlist.get(i).getBlazer().contains(blazerfind)) {
							elist.remove(i);
							rlist.remove(i);
						}
						
				 
				 
				
				 }
			 }
			 
			 if (removechoice == 6) {
				
				 for (int i = 0; i < jlist.size();i++) {
						if (jlist.get(i).getBlazer().contains(blazerfind)) {
							elist.remove(i);
							jlist.remove(i);
						}
						
				 
				 
				 
				
				 }
			 }
			 
			 if (removechoice == 7){
				 
				 for (int i = 0; i < slist.size();i++) {
						if (slist.get(i).getBlazer().contains(blazerfind)) {
							elist.remove(i);
							slist.remove(i);
							
						}
						
						
				 
						
				 
				 
				 }
				 
				
				 
			 }
			 
			 
			 
			 
			 /**
			 System.out.println("\n" + "Hospital employees : " + ecount);
			 System.out.println("The number of Doctors : " + dcount);
			 System.out.println("The number of Nurses : " + ncount);
			 System.out.println("The number of Administrators : " + acount);
			 System.out.println("The number of Receptionists : " + rcount);
			 System.out.println("The number of Janitors : " + jcount);
			 System.out.println("The number of Surgeons : " + scount);
			 */
		 
		 }
		 
		    if (choice == 1 || choice == 2) {
			System.out.println("Enter 1 to update the menu or 2  to exit: ");
			
			int updatechoice = uinput.nextInt();
			if (updatechoice == 1) {
				 FileWriter out = new FileWriter("uabEmployee.txt");
				 for(Employee item:hlist) {
					 if(!hlist.isEmpty()) {
				 out.write(item.getRole() + " " + item.getName() + " " + item.getBlazer() + "\n");
					 }
					 }
				 for(Doctor item: dlist) {
					 if(!dlist.isEmpty()) {
					 out.write(item.getRole()  + " " + item.getName() + " " + item.getBlazer() + " " + item.getSpecial() + "\n");
					 }
					 }
				 for(Nurse item: nlist) {
					 if(!nlist.isEmpty()) {
					 out.write(item.getRole() + " " + item.getName() + " " + item.getBlazer() + " " + item.getNumpatients() + "\n");
					 }
					 }
				 for(Administrator item: alist) {
					 if (!alist.isEmpty()){
					 out.write(item.getRole() + " " + item.getName() + " " + item.getBlazer() + " " + item.getDept() + "\n");
					 }
					 }
				 for(Receptionist item: rlist) {
					 if(!rlist.isEmpty()) {
					 out.write(item.getRole() + " " + item.getName() + " " + item.getBlazer() + " " + item.getDept() + " " + item.getTalking() + "\n");
					 }
					 }
				 for(Janitor item: jlist) {
					 if(!jlist.isEmpty()) {
					 out.write(item.getRole() + " " + item.getName() + " " + item.getBlazer() + " " + item.getDept() + " " + item.getSweep() + "\n");
					 }
					 }
				 for(Surgeon item: slist) {
					 if(!slist.isEmpty()) {
					 out.write(item.getRole() + " " + item.getName() + " " + item.getBlazer() + " " + item.getSpecial() + " " + item.getOperate() + "\n");
				 }
			     }
				 out.close(); 
			}
		
			 // If user does not want to update the text file
			 // Exit the program without doing anything to the text file
			 
				 
		 
			
		    } 
		 
		 
	
		 
		
		
		 
	
		 
		 // If the user picks option 3( to exit the menu)
		 // exit the program
		 // prints "Exiting the menu"
		 
		 else {
			
			 System.out.println("\n" + "Exiting the Main Menu...");
			
		 }
		 
		 
		 System.out.println("\n" + "Exiting the Main Menu...");
		 	
		 	// close the input file scanner
		 	//close the filewriter
		    //close the user input scanner
		 
		 	in.close();
			//out.close();
			uinput.close();
			//System.exit(0);
			
			// If exception occurs, catch it
		} catch (InputMismatchException e) {
			System.out.println("Sorry, your input is not recognized for this question. Try again later..." + "\n");
			e.printStackTrace();
			
		}
	}
}
	
	
	


