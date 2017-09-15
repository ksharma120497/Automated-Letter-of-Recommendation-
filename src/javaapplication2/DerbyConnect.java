/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.sql.*;
//import static javaapplication2.NewJFrame2.strengths;


public class DerbyConnect {
    String name=NewJFrame.framename;
          String surname=NewJFrame.framesurname;
          String branch=NewJFrame.framebranch1;
          float pointer=NewJFrame2.avg_pointer;
          String strength= NewJFrame2.strengths;
          String weakness=NewJFrame2.weakness;
          String achievements=NewJFrame2.achievements;

    DerbyConnect() {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con= DriverManager.getConnection("jdbc:derby://localhost:1527/PORTFOLIO","kapilsharma","hackathon");
          String sql="INSERT INTO kapilsharma.portfolio2 (NAME,SURNAME,BRANCH,POINTER,STRENGTH,WEAKNESS,ACHIEVEMENTS) VALUES(?,?,?,?,?,?,?)";
          PreparedStatement st=con.prepareStatement(sql);
           st.setString(1,name);
           st.setString(2,surname);
           st.setString(3,branch);
           st.setDouble(4,pointer);
           st.setString(5,strength);
           st.setString(6,weakness);
           st.setString(7,achievements);
           st.executeUpdate();
           
//Sql statement
          System.out.println("Success");
        con.close();
       
        }
       
        catch (Exception cnfe) {
            System.err.println("Derby driver not found."+cnfe);
        }
    }
}

/**
 *
 * @author Admin
 */

   
