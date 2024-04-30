package com.example;
import java.sql.*;

import io.github.cdimascio.dotenv.Dotenv;

public class Main {

    public static void main(String args[]) throws SQLException
    {
        Dotenv dotenv = Dotenv.load();
        String user = dotenv.get("USER");
        String password = dotenv.get("PASS");
        String url = "jdbc:mysql://localhost:3306/pruebas";
        Connection con = null;
        try {
            con = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            System.out.println("Conexion fallida");
            System.out.println(e);
            System.exit(0);
        }

        System.out.println("Conexion establecida");

        String query = "SELECT sName from Student where GPA = 3.6";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        rs.next();
        String name = rs.getString("sName");
        System.out.println(name);
        con.close();
        System.out.println("Conexion cerrada");

    }
}