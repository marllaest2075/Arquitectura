/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Cielo estan mimidos :0no :0 no ccore
 */
public class Ar {

    /**
     * @param args the command line arguments esta vazioooooo
     */
    static Connection conect;

    public static void main(String[] args) {
        try {
            String connectionUrl = "jdbc:sqlserver://;database=DB_Name;integratedSecurity=true;";
            conect = DriverManager.getConnection(connectionUrl);
            System.out.println("Conectado.");
        } catch (SQLException ex) {
            System.out.println("Error.");
        }

    }
}