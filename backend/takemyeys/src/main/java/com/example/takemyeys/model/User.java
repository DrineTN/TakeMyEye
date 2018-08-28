/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.takemyeys.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User implements Serializable{
    private static final long serialVersionUID = -3009157738442241606L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int user_id;
    @Column(name="username")
    private String username;
    @Column(name="email")
    private String email;
    @Column(name="salted_password")
    private String salted_password;
    @Column(name="first_name")
    private String first_name;
    @Column(name="last_name")
    private String last_name;
    @Column(name="date_created")
    private Date date_created;
    @Column(name="date_updated")
    private Date date_updated;

    public User() {
    }

    public User(String username, String email, String salted_password, String first_name, String last_name, Date date_created, Date date_updated) {
        this.username = username;
        this.email = email;
        this.salted_password = salted_password;
        this.first_name = first_name;
        this.last_name = last_name;
        this.date_created = date_created;
        this.date_updated = date_updated;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSalted_password() {
        return salted_password;
    }

    public void setSalted_password(String salted_password) {
        this.salted_password = salted_password;
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

    public Date getDate_created() {
        return date_created;
    }

    public void setDate_created(Date date_created) {
        this.date_created = date_created;
    }

    public Date getDate_updated() {
        return date_updated;
    }

    public void setDate_updated(Date date_updated) {
        this.date_updated = date_updated;
    }

    @Override
    public String toString() {
        return "User{" + "user_id=" + user_id + ", username=" + username + ", email=" + email + ", salted_password=" + salted_password + ", first_name=" + first_name + ", last_name=" + last_name + ", date_created=" + date_created + ", date_updated=" + date_updated + '}';
    }
    
}
