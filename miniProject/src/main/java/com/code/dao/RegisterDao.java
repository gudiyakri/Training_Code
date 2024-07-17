package com.code.dao;

//Imports the List interface from the java.util package
import java.util.List;

import com.code.model.RegisterModel; // Imports the RegisterModel class from the com.code.model package

// Interface for database operations 
public interface RegisterDao {
	// Method to add a RegisterModel instance to the database, returns true if
	// successful
	boolean addRegister(RegisterModel register);

	// Method to fetch all RegisterModel instances from the database, returns a list
	// of RegisterModel objects
	List<RegisterModel> fetchAll();
	// Method to update an existing RegisterModel instance in the database, returns
	// true if successful

	boolean updateRegister(RegisterModel register);
	// Method to delete a RegisterModel instance from the database by its ID,
	// returns true if successful

	boolean deleteRegister(int id);

	// Method to fetch a RegisterModel instance from the database by its ID, returns
	// the RegisterModel object
	RegisterModel getDataById(int id);
}
