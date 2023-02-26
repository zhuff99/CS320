import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/*
 * 
 * Test class for Contact Class
 * 
 * Contact
 * FirstName
 * LastName
 * Phone
 * Address
 * 
 */

class ContactTest {
	
	@Test
	void testContact() {
		Contact newContact = new Contact("1234567", "John", "Smith", "2089493225", "111 Peanut Dr");
		assertTrue(newContact.getContactID().equals("1234567"));
		assertTrue(newContact.getFirstName().equals("John"));
		assertTrue(newContact.getLastName().equals("Smith"));
		assertTrue(newContact.getPhone().equals("2089493225"));
		assertTrue(newContact.getAddress().equals("111 Peanut Dr"));
	}

	@Test

	void testContactIDNull() {

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "John", "Smith", "1031031236", "101 Custer Rd");
		});

	}

	@Test

	void testFirstNameNull() {

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12312", null, "Smith", "1031031236", "101 Custer Rd");
		});

	}

	@Test

	void testFirstNameLength() {

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12312", "JKLDJF:LSKFJDSL:KJ", "Smith", "1031031236", "101 Custer Rd");
		});

	}

	@Test

	void testLastNameLength() {

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12312", "Jon", "fasdfasdfasdfsad", "1031031236", "101 Custer Rd");
		});

	}

	@Test

	void testPhoneNumberLength() {

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12312", "Jon", "Smith", "103103134236", "101 Custer Rd");
		});

	}

	@Test

	void testAddressLength() {

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12312", "jon", "Smith", "1031031236", "101 Custer Rddsafsadfsdafsadfasdfasdfasdfasdfasdfasdf");
		});

	}

	@Test

	void testAddressNull() {

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12312", "jon", "Smith", "1031031236", null);
		});

	}

}
