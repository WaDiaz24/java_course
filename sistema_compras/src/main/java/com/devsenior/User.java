package com.devsenior;

public class User {
    private String name;
    private String email;
    private String password;
    private boolean authenticated;
    private boolean blocked;

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.authenticated = false;
        this.blocked = false;
    }

    public boolean authenticate(String password) {
        if (this.blocked) {
            System.out.println("User is blocked.");
            return false;
        }

        if (this.password.equals(password)) {
            this.authenticated = true;
            System.out.println("User authenticated successfully.");
            return true;
        } else {
            System.out.println("Authentication failed. Incorrect password.");
            return false;
        }
    }

    public boolean isAuthenticated() {
        return authenticated;
    }

    public boolean isBlocked() {
        return blocked;
    }
}
