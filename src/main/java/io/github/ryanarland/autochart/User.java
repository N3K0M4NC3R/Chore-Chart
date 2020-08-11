package io.github.ryanarland.autochart;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
/**
 * Meeple is a cutesy little test object to ensure that your database is setup!
 * //TODO: Remember to add your own password to application.properties!
 * Update, 8/6/2020: changed to User class
 */
public class User {
   
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name, passwordHash, role;

    //name
    public User(String name, String passwordHash, String role) {
        this.name = name;
        this.passwordHash = passwordHash;
        this.role = role;

    }

    //name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //passwordHash
    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    //role
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    //id
    public Long getID() {
        return id;
    }

    public void setID(Long id) {
        this.id = id;
    }
    
}