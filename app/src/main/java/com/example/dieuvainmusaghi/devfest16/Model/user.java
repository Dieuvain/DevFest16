package com.example.dieuvainmusaghi.devfest16.Model;

/**
 * Created by DieuvainMusaghi on 10/22/16.
 */

import java.io.Serializable;

public class user implements Serializable {


    public String getPassword() {
        return Password;
    }

    /*
    public void setPassword(String password) {
        this.Password = password;
    }
    */

    public String getUserName() {
        return UserName;
    }

    /*
    public void setUserName(String fullName) {
        this.UserName = fullName;
    }
    */

    public String getPhoneNumber() { return phoneNumber; }

   /*
   public void setPhoneNumber(String phonen) {
        this.phoneNumber = phonen;
    }
    */

    public String getSecretHint() {
        return SecretHint;
    }

    /*
    public void setSecretHint(String secretHint) {
        SecretHint = secretHint;
    }
    */

    public String getUserType() {
        return UserType;
    }

    /*
    public void setUserType(String userType) {
        UserType = userType;
    }
    */

    private String UserName;
    private String Password;
    private String phoneNumber;
    private String SecretHint;
    private String UserType;


    public user(){
        //Null constructor
    }

    public user(String userName,String password){

        this.UserName=userName;
        this.Password=password;
    }

    public user(String userName,String password,String phoneN, String SecretH, String userType){

        this.UserName=userName;
        this.Password=password;
        this.phoneNumber=phoneN;
        this.SecretHint=SecretH;
        this.UserType=userType;
    }

    public String getUserSecretHint(String secretHint){
        this.SecretHint=secretHint;

        return secretHint;
    }


}
