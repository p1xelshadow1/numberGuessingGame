/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poepart1;

/**
 *
 * @author Student
 */
public class Login {
    
    
    public String firstname;
    public String lastname;
     public String SAcellnum;
      public String username;
      public String password;
    
      
     ///constructor
    public Login ( String firstname, String lastname, String SAcellnum ,String username,String password){
       
        this.firstname = firstname;
         this.lastname = lastname;
        this.SAcellnum = SAcellnum;
        this.username = username;
        this.password = password;
                
    }
    
    public boolean checkUserName(){
    return username.contains("_") && username.length()<=5;
    
    }
  public boolean checkCellPhoneNumber(){
      return SAcellnum.matches ("^\\+27[0-9]{1,10}$");
}
  public boolean checkPasswordComplexity(){
      return password.length()>=8
      && password.matches(".*[A-Z].*")
      && password.matches(".*[0-9].*")
      && password.matches(".*[!@#$%^&*(),.\":{}|<>].*");
                     
  }
  public String registerUser(){
      StringBuilder result = new StringBuilder();
       
      if (checkCellPhoneNumber()){
          result.append("Cell phone number successfully captured. ");
         
      }else{
          result.append("Cell phone number incorrectly formatted or does not " +
                  "contain international code; please correct the number and try again. ");
      }
      
      if (checkUserName()){
          result.append("Username successfully captured. ");
      }else{
          result.append("Username is not correctly formatted; please ensure that "
          + "your username contains an underscore and is no more than five "
          + "characters in length. ");
      }
      
      if (checkPasswordComplexity()){
          result.append("Password successfully captured. ");
      }else{
          result.append("Password is not correctly formatted; please ensure "
          + "the password contains at least eight characters, a capital letter, "
          + "a number, and a special character. ");
      }
      return result.toString();
  }
  public boolean loginUser(String enteredUsername, String enteredpassword){
      return this.username.equals(enteredUsername)
              && this.password.equals(enteredpassword);
  }
  public String returnLoginStatus(String enteredUsername, String enteredpassword){
      if (loginUser(enteredUsername, enteredpassword)){
          return "Welcome " + firstname +  lastname + " it is great to see you again.";
      }else{
          return "Username or password incorrect, please try again.";
      }
  }
}
