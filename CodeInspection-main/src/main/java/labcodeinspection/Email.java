package labcodeinspection;
/**
 * @author Katherine Tumbaco
 */

import java.util.Locale; 

public class Email {
	private final String firstName; 
	private final String lastName;
	private String password; 
	private String department;
	private final int defaultpasswordLength = 8;
	private String email;
	
	/** Constructor for the Email class.	*/
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	/** Method to show email information.	*/
	public void showInfo() {		System.out.println("\nFIRST NAME= " + firstName + "\nLAST NAME= " + lastName);
		System.out.println("DEPARMENT= " + department + "\nEMAIL= " + email + "\nPASSWORD= " + password);
	}	
	/** Method to set the department	*/
	public void setDeparment(int depChoice) {
		switch (depChoice) {
		case 1:
			this.department = "sales";
			break;
		case 2:
			this.department = "dev";
			break;
		case 3:
			this.department = "acct";
			break;
		default:
			this.department = "deptp";
			break;
		}
	}

	private String randomPassword(int length) {
		String set = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890#$&@*";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * set.length());
			password[i] = set.charAt(rand);
		}
		return new String(password);
	}
	/** Method to generate the email */
	public void generateEmail() {
		this.password = this.randomPassword(this.defaultpasswordLength);
		this.email = this.firstName.toLowerCase(Locale.ROOT) + "." + this.lastName.toLowerCase(Locale.ROOT) + "@" + this.department.toLowerCase(Locale.ROOT) + ".espol.edu.ec";
	}
}
