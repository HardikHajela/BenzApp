/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package benz;

import java.sql.*;
import java.util.*;
/**
 *
 * @author Admin
 */
public class Test {
    public static void main(String[] args) {
        
    
 String id = null , pw = null;   
 Scanner sc = new Scanner(System.in);
 
  try{
       Class.forName("com.mysql.jdbc.Driver");
       Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","mysql","mysql");
       Statement stmt = con.createStatement();
       String s="select * from infoo where id='"+id+"' and pw ='"+pw+"'";
       ResultSet rs= stmt.executeQuery(s);
       if(rs.next()){
            System.out.println("Done");
       }
       else
           System.out.println("Not Done");

      }catch(ClassNotFoundException | SQLException e){
            System.out.println("Err " + e);
      }
 
}
    
}
