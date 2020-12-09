/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package benz;
import java.sql.*; 

/**
 *
 * @author Admin
 */
public class Test2 {

    public static void main( 
        String args[]) throws SQLException, 
                              ClassNotFoundException 
    { 
        String driverClassName 
            = "sun.jdbc.odbc.JdbcOdbcDriver"; 
        String url = "jdbc:odbc:XE"; 
        String username = "MYSQL"; 
        String password = "mysql"; 
        String query 
            = "insert into stidents values(109, 'bhatt')"; 
  
        // Load driver class 
        Class.forName(driverClassName); 
  
        // Obtain a connection 
        Connection con = DriverManager.getConnection( 
            url, username, password); 
  
        // Obtain a statement 
        Statement st = con.createStatement(); 
  
        // Execute the query 
        int count = st.executeUpdate(query); 
        System.out.println( 
            "number of rows affected by this query= " + count); 
  
        // Closing the connection as per the 
        // requirement with connection is completed 
        con.close(); 
    } 
} // class 

