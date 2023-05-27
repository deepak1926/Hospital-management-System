/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

import java.sql.*;
import javax.swing.*;

public class ConnectionProvider {

    public static Connection getCon() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hms?useSSL=false", "root", "Deepak@123");
            return con;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Conncetion Error", e.getMessage(), JOptionPane.YES_OPTION);
            return null;
        }
    }
}