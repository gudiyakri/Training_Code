package com.code.model;

// Declares a public class named RegisterModel
public class RegisterModel {
	// Private field for ID
	private int id;
	// Private fields for name, password, email, and contact
	private String name, password, email, contact;
	// Default constructor
	// This constructor is empty and used to create an instance of RegisterModel
	// without initializing fields

	public RegisterModel() {
	}

	public RegisterModel(String name, String password, String email, String contact) { // Constructor with parameters
																						// except id
		// Calls the superclass constructor (Object class)
		super();
		this.name = name; // Initializes the name field with the provided value
		this.password = password; // Initializes the password field with the provided value
		this.email = email; // Initializes the email field with the provided value
		this.contact = contact; // Initializes the contact field with the provided value
	}

	public RegisterModel(int id, String name, String password, String email, String contact) { // Constructor with all
																								// parameters including
																								// id
		super(); // Calls the superclass constructor (Object class)
		this.id = id;
		this.name = name;
		this.password = password;
		this.email = email;
		this.contact = contact;
	}

	// Getter method for id
	public int getId() {
		return id; // Returns the value of id
	}

	// Setter method for id
	public void setId(int id) {
		this.id = id; // Sets the id field to the provided value
	}

	public String getName() {
		return name; // Returns the value of name
	}

	public void setName(String name) {
		this.name = name; // Sets the name field to the provided value
	}

	public String getPassword() {
		return password; // Returns the value of password
	}

	public void setPassword(String password) {
		this.password = password; // Sets the password field to the provided value
	}

	public String getEmail() { // Getter method for email
		return email; // Returns the value of email
	}

	public void setEmail(String email) {
		this.email = email; // Sets the email field to the provided value
	}

	public String getContact() {
		return contact; // Returns the value of contact
	}

	public void setContact(String contact) {
		this.contact = contact; // Sets the contact field to the provided value
	}
}
