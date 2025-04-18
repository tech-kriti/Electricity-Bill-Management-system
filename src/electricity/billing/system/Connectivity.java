/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package electricity.billing.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Admin
 */
public class Connectivity {

   public Connection c;
   public Statement s;

    public Connectivity() {
        try {
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/Electry_bill_db", "root", "root");
            s = c.createStatement();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
