package com.springboot.crudJPARepository.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
@AllArgsConstructor // Generates a constructor with all fields as parameters.
@NoArgsConstructor // Generates a no-argument constructor.
@Entity // Marks this class as a JPA entity.
@Table(name="student") // Specifies the table name in the database as "student".
public class UserEntity { 
    
    @Id // Specifies that the field is the primary key.
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Configures the primary key generation strategy to be identity (auto-increment).
    private Integer id; 
    
    private String username; 
    
    private String password; 
    
    public Integer getId() { 
        return id;
    }
    
    public void setId(Integer id) { 
        this.id = id; 
    }
    
    public String getUsername() { 
        return username; 
    }
    
    public void setUsername(String username) { 
        this.username = username; 
    }
    
    public String getPassword() { 
        return password;
    }
    
    public void setPassword(String password) { 
        this.password = password; 
    }
}
