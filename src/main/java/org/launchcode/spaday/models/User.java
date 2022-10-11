package org.launchcode.spaday.models;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class User {
    @NotBlank(message = "User name required.")
    @Size(min = 5, max = 15, message = "Username must be between 5 and 15 characters.")
    private String userName;

    @Email(message = "Invalid email. Try again.")
    private String email;

    @NotBlank(message = "password required.")
    @Size(min = 6, message = "password must be at least 6 characters.")
    private String password;

    @NotNull(message = "Passwords do not match.")
    private String verifyPassword;
    private int id;
    private static int nextId;

    // TODO: Add Date field. Initialize it to the time the user joined. Display value in user detail view.

    public User() {
        this.id = nextId;
        nextId++;
    }

    public User(String userName, String email, String password, String verifyPassword) {
        this();
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.verifyPassword = verifyPassword;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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
        checkPassword();
    }

    public String getVerifyPassword() {
        return verifyPassword;
    }

    public void setVerifyPassword(String verifyPassword) {
        this.verifyPassword = verifyPassword;
        checkPassword();
    }

    public int getId() {
        return id;
    }

    private void checkPassword() {
        if (this.password != null && this.verifyPassword != null && !this.password.equals(getVerifyPassword())) {
            this.verifyPassword = null;
        }
//            if (password != null || verifyPassword != null || !password.equals(verifyPassword)) {
//                setVerifyPassword(null);
//            }
    }

}
