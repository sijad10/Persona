package com.mycompany.persona;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Coneccion {

    public Connection getConeccion() {
        Connection cn = null;
        try {
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/persona?serverTimezone=UTC", "root", "");
        } catch (SQLException e) {
            System.out.println(e);
        }
        return cn;
    }
}
