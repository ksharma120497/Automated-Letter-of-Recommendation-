/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import javax.swing.*;
//import java.awt.event.*;
/**
 *
 * @author chinmaytompe
 */
public class DerbyConnect1 {
    public static String strength_from_db="",achievement_from_db="",rsstr=null,rsac=null;;
  
    DerbyConnect1(){
    try {
             String studentname=NewJFrame.framename;
          String studentsurname=NewJFrame.framesurname;
          String studentbranch=NewJFrame.framebranch1;
          
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con= DriverManager.getConnection("jdbc:derby://localhost:1527/PORTFOLIO","kapilsharma","hackathon");
            // pointers="SELECT POINTERS FROM kapilsharma.portfolio2 WHERE POINTER=studentname ";
            String sql="SELECT STRENGTH,ACHIEVEMENTS FROM kapilsharma.portfolio2 WHERE NAME=? AND SURNAME=? AND BRANCH=?";
             //weakness="SELECT WEAKNESS FROM kapilsharma.portfolio2 WHERE NAME='studentname' AND SURNAME='studentsurname' AND BRANCH='studentbranch'";
             //achievements="SELECT ACHIEVEMENTS FROM kapilsharma.portfolio2 WHERE NAME='"+studentname+"' AND SURNAME='"+studentsurname+"' AND BRANCH= '"+studentbranch+"'";
          
         /* strengths=strengths.replaceAll("studentname",studentname);
          strengths=strengths.replaceAll("studentsurname",studentsurname);
          strengths=strengths.replaceAll("studentbranch",studentbranch);
          //weakness=weakness.replaceAll("studentname",studentname);
          //weakness=weakness.replaceAll("studentname",studentname);
          //weakness=weakness.replaceAll("studentname",studentname);
          achievements=achievements.replaceAll("studentname",studentname);
          achievements=achievements.replaceAll("studentsurname",studentsurname);
          achievements=achievements.replaceAll("studentbranch",studentbranch);*/
          PreparedStatement stmt1=con.prepareStatement(sql);
          stmt1.setString(1,studentname);
          stmt1.setString(2,studentsurname);
          stmt1.setString(3,studentbranch);
          ResultSet rs = stmt1.executeQuery();
          while(rs.next())
          {
          rsstr=rs.getString("STRENGTH");
          rsac = rs.getString("ACHIEVEMENTS");
          System.out.println("Succes "+rsstr + rsac);
          }
          strength_from_db=rsstr;
          achievement_from_db=rsac;
          rs.close();
           stmt1.close();
            
              con.close();
            
}
catch(Exception e){
    System.out.println("Driver not Connected"+e);
}}
}