package emailapp;

import java.util.Scanner;

public class Email {
		
		private String firstName;
		private String lastName;
		private String password;
		private String department;
		private String email;
		private int mailboxCapacity = 500;
		private int defaultpasswordlength = 10;
		private String alternateEmail;
		private String companySuffix = "xyzcompany.com";
		
		// constructor to recieve the firstname and last name
		public Email(String firstName,  String lastName) {
			this.firstName=firstName;
			this.lastName=lastName;
			
			// call a method asking for the department 
			this.department = setDepartment();
			System.out.println("Department:" + this.department);
		    
			this.password = randomPassword (defaultpasswordlength);
			System.out.println("Your password is :"+this.password);
			
			// combine elements to generate email
			email = firstName.toLowerCase() + "." + lastName.toLowerCase() +"@"+ department +"."+ companySuffix	;
	
		}		
	
		// ask for the department 
		private String setDepartment() {
			System.out.print("New worker: "+firstName+".Department Codes\n1 for sales\n2 for Development\n3 for Accounting\n0 for none\n Enter department code: ");
			Scanner in = new Scanner (System.in);
			int depChoice = in.nextInt();
			if (depChoice==1) { return "sales"; }  
			else if (depChoice==2 ) {return "development";}
			else if (depChoice==3 ) {return "accountinng";}
			else  {return "";}
			
			}	
		
		// generate a random password 
		private String randomPassword(int length) {
			String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
			char[] password = new char[length];
			for (int i=0; i<length; i++) {
				int rand = (int)(Math.random()* passwordSet.length());
				password[i] = passwordSet.charAt(rand);	
				 
			}
			return new String(password); 
		}		
		// set the mailbox capacity
		public void setMailboxCapacity (int capacity) {
			this.mailboxCapacity = capacity;
		}
		
		//set the alternate email
		public void setAlternateEmail(String altemail) {
			this.alternateEmail= altemail ;
		}
		// change the password 
		public void changePassword (String password) {
		this.password= password;
		}
		public int getMailboxCapacity () {
			return mailboxCapacity ;
		}
		public String getAlternateEmail() {
			return alternateEmail;
			
		}
		public String getPassword() {
			return password;
		}
		public String ShowInfo() {
			return "DISPLAY NAME : " +firstName+" "+lastName +"	 "+
					"\nCOMPANY EMAIL : " + email +"	"+
					"\nMAILBOX CAPACITY : "+ mailboxCapacity + "mb";
			
			}
		
}
