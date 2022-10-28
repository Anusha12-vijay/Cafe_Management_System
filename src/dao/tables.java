/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;

/**
 *
 * @author Anusha
 */
public class tables {
  public static void main(String[] args){
      try{
         String userTable = "create table user(id int AUTO_INCREMENT primary key,name varchar(200),email varchar(200),mobile varchar(200),address varchar(200),password varchar(200),securityQuestion varchar(200),answer varchar(200),status varchar(20),UNIQUE(email))";
         String adminDetails = "Insert into user(name,email,mobile,address,password,securityQuestion,answer,status) values('Admin','admin@gmail.com','1234567890','India','admin','What is your favorite colour?','Black','true')";
         String CategoryTable ="create table category(id int AUTO_INCREMENT primary key, name varchar(200))";
         String productTable ="create table product(id int AUTO_INCREMENT primary key,name varchar(200),category varchar(200),price varchar(200))";
         DbOperations.setDataOrDelete(userTable, "userTable Created Successfully");
         DbOperations.setDataOrDelete(adminDetails, "Admin details added Successfully");
         DbOperations.setDataOrDelete(CategoryTable, "Category Table created Successfully");
         DbOperations.setDataOrDelete(productTable, "Product Table created Successfully");
      }catch(Exception e){
          JOptionPane.showMessageDialog(null, e);
      }
  }  
}
