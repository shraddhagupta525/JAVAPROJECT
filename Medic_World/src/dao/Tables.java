/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author kulde
 */
public class Tables {
    public static void main(String args[]){
        try{
            Connection con=ConnectionProvider.getCon();
            Statement st=con.createStatement();
            //st.execute("create table appuser (appuser_pk int AUTO_INCREMENT primary key,userRole varchar(100),name varchar(200),dob varchar(50),mobilenumber varchar(50),email varchar(200),username varchar(200),password varchar(50),address varchar(200))");
            //st.execute("insert into appuser(userRole,name,dob,mobileNumber,email,username,password,address) values('Admin','Admin','01-01-2001','1234567890','admin@gmail.com','admin','1234','admin');");
            //st.executeUpdate("create table medicine(medicine_pk int AUTO_INCREMENT primary key, uniqueId varchar(200),name varchar(200),companyName varchar(200),quantity bigint,price bigint)");
            st.executeUpdate("create table bill(bill_pk int AUTO_INCREMENT primary key, billId varchar(200),billDate varchar(50),totalPaid bigint,generatedBy varchar(50))");
            JOptionPane.showMessageDialog(null,"Table created sucessfully.");
        }
        catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
