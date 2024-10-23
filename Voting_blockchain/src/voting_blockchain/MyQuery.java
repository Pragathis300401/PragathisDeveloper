/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package voting_blockchain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.management.Query;

/**
 *
 * @author ELCOT
 */

public class MyQuery {
      public Connection getConnection(){
            Connection con = null;
            try
            {
                con = DriverManager.getConnection("jdbc:mysql://localhost/voting_blockchain","root","");
            }
            catch (SQLException ex){
                Logger.getLogger(Query.class.getName()).log(Level.SEVERE,null,ex);
            }
            return con;
        }
        public ArrayList <product2> BindTable(){
            ArrayList <product2> list=new 
            ArrayList <product2>();
            Connection con = getConnection();
            Statement st;
            ResultSet rs;
            
            try{
                
                
                st= con.createStatement();
                rs=st.executeQuery("SELECT `PARTY_NAME`,`PARTY_IMAGE`,`CONDITATE_NAME` FROM `add_partys`");
                product2 p;
                while(rs.next()){
                    p=new product2(
                            
                    rs.getString("PARTY_NAME"),         
                    rs.getBytes("PARTY_IMAGE"),
                    rs.getString("CONDITATE_NAME")
                    );
                    list.add(p);
                            
                }
                
            } catch (SQLException ex){
                Logger.getLogger(MyQuery.class.getName()).log(Level.SEVERE,null,ex);
            }
            return list;
        }
    
    
    
}
