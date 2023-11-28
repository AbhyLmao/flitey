package com.termproj.Flitey.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_table")

public class User {
    @Id
    private int userId;
    private char fname;
    private char sname;
    private long number;
    private char email;

    private boolean ismember;

    public User() {

    }
    public User(int userId, char fname, char sname, long number, char email, boolean ismember) {
        this.userId = userId;
        this.fname = fname;
        this.sname = sname;
        this.number = number;
        this.email = email;
        this.ismember = ismember;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userid) {
        this.userId = userid;
    }

    public char getFname() {
        return fname;
    }

    public void setFname(char fname) {
        this.fname = fname;
    }

    public char getSname() {
        return sname;
    }

    public void setSname(char sname) {
        this.sname = sname;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public char getEmail() {
        return email;
    }

    public void setEmail(char email) {
        this.email = email;
    }

    public boolean getIsmember() {
        return ismember;
    }

    public void setIsmember(boolean ismember) {
        this.ismember = ismember;
    }
}

