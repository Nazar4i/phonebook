package com.home.task.controllers.form;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class LoginForm {
    @NotNull(message = "Please enter your login.")
    @Size(min = 3, max = 15, message = "Your login must between 3 and 20 characters")
    private String login;


    @NotNull(message = "Please enter your password.")
    @Size(min = 5, max = 20, message = "Your password must between 5 and 20 characters")
    private String password;

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

    @Override
    public String toString() {
        return "LoginForm{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
