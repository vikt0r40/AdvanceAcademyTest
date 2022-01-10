package com.company;

public class User {
    private String fullName;
    private String email;
    private String password;

<<<<<<< HEAD
    public User(String firstName, String lastName, String email, String password) {
=======
    public User(String fullName, String email, String password) {
>>>>>>> main
        this.fullName = fullName;
        this.email = email;
        this.password = password;
    }

<<<<<<< HEAD


    public String getFullName() {
        return fullName;
    }

=======
    public String getFullName() {
        return fullName;
    }

>>>>>>> main
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
