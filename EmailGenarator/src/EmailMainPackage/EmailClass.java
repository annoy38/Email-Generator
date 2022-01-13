package EmailMainPackage;

import java.util.Scanner;

public class EmailClass {

	private String FirstName;
	private String LastName;
	private String departmentName;
	private String password;
	private String email;
	private int MailCapacity = 300;
	private String AlterEmail;
	private int lenght = 8;
	private String CompanyBase = "gmail.com";
	
	public EmailClass(String firstName, String lastName) {
		this.FirstName = firstName;
		this.LastName = lastName;
		
		//select department
		this.departmentName = setDepartment();
		this.email = FirstName.toLowerCase()+"."+LastName.toLowerCase() + "@"+ departmentName + "." +CompanyBase;
		this.password = setPassword(lenght);
	}
	
	private String setDepartment(){
		System.out.println("Select your Department");
		System.out.print("1. for Sales\n2.for Development\n3. for Accounting\n4. for none\n");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		switch(n) {
		case 1: departmentName =  "Sales";
		break;
		case 2: departmentName =  "Development";
		break;
		case 3: departmentName =  "Accounting";
		break;
		case 4: departmentName =  "None";
		}
		return departmentName;
	}
	
	private String setPassword(int lenght) {
		String passwordset = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890@#$&";
		char[] password = new char[lenght];
		for(int i=0;i<lenght;i++) {
			int rand = (int) (Math.random()*passwordset.length());
			password[i] = passwordset.charAt(rand);
		}
		return new String (password);
	}
	
	public void changePassword(String changePassword) {
		this.password = changePassword;
	}
	
	public void AllInfo() {
		System.out.println("First Name :"+FirstName);
		System.out.println("Last Name :"+LastName);
		System.out.println("Email :"+email);
		System.out.println("Password :"+password);
		System.out.println("MailBox capacity :"+MailCapacity+ "mb");
	}
}

