package pl.edu.pjwstk.jaz.Authorization;

import org.springframework.stereotype.Component;


public class User {
    private String name;
    private String lastName;
    private String username;
    private String password;
    private String permission;


    public User(String username, String password,String permission) {
        this.username = username;
        this.password = password;
        this.permission = permission;
    }

    public String getName() {
        return name;
    }

    public String getPermission() { return permission; }

    public void setPermission(String permission) { this.permission = permission; }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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
