/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poepart1;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class PoePart1 {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
        System.out.println("enter your firstname:");
         String firstname = scanner.nextLine();
         
     System.out.println("enter your lastname:");
         String lastname = scanner.nextLine();
       
        System.out.println("enter your username:");
         String username = scanner.nextLine();
        
        System.out.println("enter your SAcellnum:");
        String SAcellnum = scanner.nextLine();
        
        
        System.out.println("enter your password:");
          String password = scanner.nextLine();
          
          Login newUser = new Login(firstname, lastname, SAcellnum, username, password);
          System.out.println(newUser.registerUser());
          
          if (newUser.checkUserName() && newUser.checkCellPhoneNumber() && newUser.checkPasswordComplexity()){
              
              System.out.println("Enter your username to login:");
              String loginUsername = scanner.nextLine();
              
              System.out.println("Enter your password to login:");
              String loginPassword = scanner.nextLine();
             
              
                  System.out.println(newUser.returnLoginStatus(loginUsername, loginPassword));
              
          }else{
              System.out.println("Registration failed - please correct your details before logging in.");
          }
    
}
}
