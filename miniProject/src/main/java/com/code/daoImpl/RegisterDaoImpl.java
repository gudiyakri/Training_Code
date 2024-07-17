package com.code.daoImpl;  
//Imports the Connection class for database connections
import java.sql.Connection;
//Imports the PreparedStatement class for SQL queries
import java.sql.PreparedStatement;  
//Imports the ResultSet class for handling query results
import java.sql.ResultSet; 
// Imports the SQLException class for handling SQL exceptions
import java.sql.SQLException;
// Imports the ArrayList class for list operations
import java.util.ArrayList; 
//Imports the List interface
import java.util.List;  

import com.code.dao.RegisterDao;  
import com.code.db.DatabaseConnection;  
import com.code.model.RegisterModel;  
public class RegisterDaoImpl implements RegisterDao {  

    @Override
    // Implementation of addRegister method from RegisterDao
    public boolean addRegister(RegisterModel register) { 
        try {
        	// Gets a database connection
            Connection con = DatabaseConnection.getConnection();  
         // SQL query for inserting a new user
            String insertQuery = "insert into user(name,password,email,mobile_no) values(?,?,?,?)";  
            // Prepares the SQL query
            PreparedStatement st = con.prepareStatement(insertQuery); 
            st.setString(1, register.getName());  // Sets the name parameter
            st.setString(2, register.getPassword());  // Sets the password parameter
            st.setString(3, register.getEmail());  // Sets the email parameter
            st.setString(4, register.getContact());  // Sets the contact parameter
         // Executes the query and gets the number of affected rows
            int rowCount = st.executeUpdate();  
            con.close();  // Closes the database connection
            return rowCount > 0;  // Returns true if at least one row was affected
        } catch (Exception e) {  // Catches any exceptions
            e.printStackTrace();  // Prints the stack trace
        }
        return false;  // Returns false if an exception occurred
    }

    @Override
    public List<RegisterModel> fetchAll() { 
    	// Creates a new list to hold the fetched users
        List<RegisterModel> list = new ArrayList<RegisterModel>();  
        try {
            Connection con = DatabaseConnection.getConnection();  // Gets a database connection
            String selectQuery = "select * from user";  // SQL query for selecting all users
            PreparedStatement st = con.prepareStatement(selectQuery);  // Prepares the SQL query
            ResultSet rs = st.executeQuery();  // Executes the query and gets the result set
            while (rs.next()) {  // Iterates over the result set
                int id = rs.getInt("id");  // Gets the id from the result set
                String name = rs.getString("name");  // Gets the name from the result set
                String password = rs.getString("password");  // Gets the password from the result set
                String email = rs.getString("email");  // Gets the email from the result set
                String contact = rs.getString("mobile_no");  // Gets the contact from the result set
                list.add(new RegisterModel(id, name, password, email, contact));  // Adds a new RegisterModel instance to the list
            }
        } catch (SQLException e) {  // Catches any SQL exceptions
            e.printStackTrace();  // Prints the stack trace
        }
        return list;  // Returns the list of users
    }

    @Override
    public boolean updateRegister(RegisterModel register) {  
        boolean rowUpdated = false;  
        try {
            Connection con = DatabaseConnection.getConnection();  // Gets a database connection
            String updateQuery = "UPDATE user SET name=?,password=?,email=?,mobile_no=? where id=?";  // SQL query for updating a user
            PreparedStatement st = con.prepareStatement(updateQuery);  // Prepares the SQL query
            st.setString(1, register.getName());  // Sets the name parameter
            st.setString(2, register.getPassword());  // Sets the password parameter
            st.setString(3, register.getEmail());  // Sets the email parameter
            st.setString(4, register.getContact());  // Sets the contact parameter
            st.setInt(5, register.getId());  // Sets the id parameter
            rowUpdated = st.executeUpdate() > 0;  // Executes the query and updates the flag if any row was updated
        } catch (SQLException e) {  // Catches any SQL exceptions
            e.printStackTrace();  // Prints the stack trace
        }
        return rowUpdated;  // Returns the flag indicating if any row was updated
    }

    @Override
    public boolean deleteRegister(int id) {  // Implementation of deleteRegister method from RegisterDao
        boolean rowDeleted = false;  // Flag to indicate if any row was deleted
        try {
            Connection con = DatabaseConnection.getConnection();  // Gets a database connection
            String deleteQuery = "delete from user where id=?";  // SQL query for deleting a user by id
            PreparedStatement st = con.prepareStatement(deleteQuery);  // Prepares the SQL query
            st.setInt(1, id);  // Sets the id parameter
            rowDeleted = st.executeUpdate() > 0;  // Executes the query and updates the flag if any row was deleted
        } catch (SQLException e) {  // Catches any SQL exceptions
            e.printStackTrace();  // Prints the stack trace
        }
        return rowDeleted;  // Returns the flag indicating if any row was deleted
    }

    @Override
    public RegisterModel getDataById(int id) {  // Implementation of getDataById method from RegisterDao
        RegisterModel data = null;  // Variable to hold the fetched user
        try {
            Connection con = DatabaseConnection.getConnection();  // Gets a database connection
            String selectQ = "SELECT * FROM user WHERE id = ?";  // SQL query for selecting a user by id
            PreparedStatement st = con.prepareStatement(selectQ);  // Prepares the SQL query
            st.setInt(1, id);  // Sets the id parameter
            ResultSet rs = st.executeQuery();  // Executes the query and gets the result set
            if (rs.next()) {  // Checks if a user was found
                data = new RegisterModel();  // Creates a new RegisterModel instance
                data.setId(rs.getInt("id"));  // Sets the id in the RegisterModel instance
                data.setName(rs.getString("name"));  // Sets the name in the RegisterModel instance
                data.setPassword(rs.getString("password"));  // Sets the password in the RegisterModel instance
                data.setEmail(rs.getString("email"));  // Sets the email in the RegisterModel instance
                data.setContact(rs.getString("mobile_no"));  // Sets the contact in the RegisterModel instance
            }
            con.close();  // Closes the database connection
        } catch (SQLException e) {  // Catches any SQL exceptions
            e.printStackTrace();  // Prints the stack trace
        }
        return data;  // Returns the fetched user
    }
}

