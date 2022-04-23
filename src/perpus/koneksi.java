/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpus;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class koneksi {
public Connection getConnection(){
 Connection con;
 try{
 Class.forName("com.mysql.jdbc.Driver");
 con = DriverManager.getConnection("jdbc:mysql://localhost/perpustakaan","root", "");
     JOptionPane.showMessageDialog(null, "berhasil koneksi");
 return con;
 }
 catch(SQLException se){
 System.out.println("No Connection open");
 return null;
 }
catch(Exception ex){
 System.out.println("Cound not open connection");
 return null;
}
}
public static void main(String[] args) {
        Connection con = new koneksi().getConnection();
    }
}
