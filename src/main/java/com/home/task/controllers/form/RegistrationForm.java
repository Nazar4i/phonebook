package com.home.task.controllers.form;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class RegistrationForm {



    @NotNull(message = "Please enter your login.")
    @Size(min = 3, max = 20, message = "Your login must between 3 and 20 characters")
    private String login;


    @NotNull(message = "Please enter your password.")
    @Size(min = 5, max = 20, message = "Your password must between 5 and 20 characters")
    private String password;

    @NotNull(message = "Please enter your first name.")
    @Size(min = 4, max = 20, message = "Your first name must between 4 and 20 characters")
    private String first_name;

    @NotNull(message = "Please enter your last name.")
    @Size(min = 4, max = 20, message = "Your last name must between 4 and 20 characters")
    private String last_name;

    @NotNull(message = "Please enter your middle name.")
    @Size(min = 4, max = 20, message = "Your middle name must between 4 and 20 characters")
    private String middle_name;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getMiddle_name() {
        return middle_name;
    }

    public void setMiddle_name(String middle_name) {
        this.middle_name = middle_name;
    }

    @Override
    public String toString() {
        return "RegistrationForm{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", middle_name='" + middle_name + '\'' +
                '}';
    }
}
