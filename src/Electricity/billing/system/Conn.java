package Electricity.billing.system;

import java.sql.*;

public class Conn {

    Connection c;
    Statement s;

    Conn() {
        try {
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebs", "root", "Hitesh@2003");
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
