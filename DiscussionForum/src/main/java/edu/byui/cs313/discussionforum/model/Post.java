package edu.byui.cs313.discussionforum.model;

import java.util.Date;

/**
 *
 * @author Ele Thompson
 */
public class Post {
    private String content;
    private String username;
    private Date date;

    public Post(String content) {
        this.content = content;
    }
    
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    public String toFileString() {
        return content + "," + username + "," + date;
    }
}
