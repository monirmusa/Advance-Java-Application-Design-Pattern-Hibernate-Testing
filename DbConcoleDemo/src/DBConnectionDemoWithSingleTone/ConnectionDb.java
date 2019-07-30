/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBConnectionDemoWithSingleTone;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author monirujjaman
 */
///////////SingleTone Design pattern(one copy canbe access multiple user)//////////////////
public class ConnectionDb {
    
  private static Connection connection=null;
  private static ConnectionDb instance=new ConnectionDb();//in same class you have to intantiate since private constractor
      private ConnectionDb(){   //It is constractor 1:8:00 of 5a 2019 aj
                            // private constractor, so you cannot inatantieate again and again
                           //outer site cannot instantiate.so in same class you have to intantiate;
                        //At first(one time) it can be cll.not again,again
     try {
            connection=DriverManager.getConnection("jdbc:mysql://localhost/registrationdb","root","12345");
               System.out.println("connected");
           //in heare no need check like if else    
     } catch (SQLException ex) {
           Logger.getLogger(ConnectionDb.class.getName()).log(Level.SEVERE, null, ex);
       }
       
    }
    
      public  static  Connection getConnection(){
      return connection;
}
    
    
    
           ///////////First implement then go Up as singletone/////////////
   /* public  static  Connection getConnection(){
      
       try {
           if(connection==null){//if connection is one time created then action;
               //No need again and again connecting to db;(it is like ==Singletone==)
            connection=DriverManager.getConnection("jdbc:mysql://localhost/registrationdb","root","12345");
               System.out.println("connected");
               }
       
       
       } catch (SQLException ex) {
           Logger.getLogger(ConnectionDb.class.getName()).log(Level.SEVERE, null, ex);
       }
       
       return connection;
}

*/    
  
    
}
