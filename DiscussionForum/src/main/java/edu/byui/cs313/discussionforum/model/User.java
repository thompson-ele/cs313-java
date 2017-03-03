package edu.byui.cs313.discussionforum.model;

/**
 *
 * @author Ele Thompson
 */
public class User {
    private String username;
    private String password;

    public User() {
        this.username = "";
        this.password = "";
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
    
    public boolean comparePasswords(String testUsername, String testPassword) {
        if(testUsername == getUsername() && testPassword == getPassword()) {
            return true;
        }
        return false;
    }
    
    public void loadFromFileString(String str) {
        String[] parts = str.split(",");
        setUsername(parts[0]);
        setPassword(parts[1]);
    }
}
