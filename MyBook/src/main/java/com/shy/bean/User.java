package com.shy.bean;

/**
 * @author shystart
 * @create 2021-03-16 上午 8:32
 */
public class User {
    private Integer id;
    private String username;
    private String password;
    private String email;

    public User() {
    }

    public User(Integer id, String name, String password, String email) {
        this.id = id;
        this.username = name;
        this.password = password;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String name) {
        this.username = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
