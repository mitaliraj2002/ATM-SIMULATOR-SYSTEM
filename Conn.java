package bank.management.system;

import java.sql.*;
// 5 steps to connect 
// Create Connection
public class Conn {
    
    Connection c;
    Statement s ;
    public Conn(){
        // To catch Runtime error we use Exception Handling
          try{
            
              c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","ravi");
              s = c.createStatement();
              
              
          }catch (Exception e){
              System.out.println(e);
          }
    
    }
    
    
    
    
}
