import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/*
 * @author Zachary Huff
 * 
 * 
 *  Souther New Hampshire University 1/22/2023 CS320 Software Test Automation
 *  
 *  Module 3 Milestone and project_1 part 1
 *  
 *  This class makes a new Contact and gives user ability to add/remove it from list
 *  It also allows user to modify the contact information
 * 
 */

public class ContactService {
	
	
	/*
	 * TODO
	 * Add ability for user to create their own contact
	 * Add scanners for each method so user can input their own changes
	 * 
	 * 
	 * Add menu option for user to choose which method(option) they want to use
	 * Add ability for user to enter the contactID they specifically are looking for
	 * 
	 * 
	 * This was not done yet for testing purposes
	 * 
	 */

	Contact newContact = new Contact("1234567", "John", "Smith", "2089493225", "111 Penut Dr");
	List<Contact> list = new ArrayList<Contact>();

	Scanner scan = new Scanner(System.in);
	
	// System.out.println("Enter contactID");
	// contactID = scan.nextLine();

	public void addContact(String contactID) {

		if (!newContact.getContactID().equals(contactID)) {
			throw new IllegalArgumentException("ID not found");
		}

		list.add(newContact);
		System.out.println("Contact Added to Database");
	}

	public void deleteContact(String contactID) {


		if (!newContact.getContactID().equals(contactID)) {
			throw new IllegalArgumentException("ID not found");
		}

		if (newContact.getContactID().equals(contactID)) {

			list.remove(newContact);
			System.out.println("Removed Contact with ID: " + contactID);
		}

	}

	public void updateFirstName(String contactID) {
		
		if (!newContact.getContactID().equals(contactID)) {
			throw new IllegalArgumentException("ID not found");
		}

		if (newContact.getContactID().equals(contactID)) {
			//add scanner here
			System.out.println("Contact first name updated from " + newContact.getFirstName());
			newContact.setFirstName("Jeff");
			System.out.println(" to " + newContact.getFirstName());
		}
	}
	
	public void updateLastName(String contactID) {

		if (!newContact.getContactID().equals(contactID)) {
			throw new IllegalArgumentException("ID not found");
		}

		if (newContact.getContactID().equals(contactID)) {
			//add scanner here
			System.out.println("Contact last name updated from " + newContact.getLastName());
			newContact.setFirstName("Anderson");
			System.out.println(" to " + newContact.getFirstName());
		}
	}
	
	public void updatePhoneNumber(String contactID) {

		if (!newContact.getContactID().equals(contactID)) {
			throw new IllegalArgumentException("ID not found");
		}

		if (newContact.getContactID().equals(contactID)) {
			//add scanner here
			System.out.println("Phone number updated from " + newContact.getPhone());
			newContact.setPhone("1234567890");
			System.out.println(" to " + newContact.getPhone());
		}
	}
	
	public void updateAdress(String contactID) {

		if (!newContact.getContactID().equals(contactID)) {
			throw new IllegalArgumentException("ID not found");
		}

		if (newContact.getContactID().equals(contactID)) {
			//add scanner here
			System.out.println("Address updated from " + newContact.getAddress());
			newContact.setAddress("101 Fireberry Lane");
			System.out.println(" to " + newContact.getAddress());
		}
	}

}
