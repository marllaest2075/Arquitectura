/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar;

import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author Cielo
 */
public class Consultas {

    Connection Conec;
    CallableStatement llamada;

    public Consultas() {
        Conec = Ar.Conexion();
    }
    
    public int RegresarID (){
       int jala=-1;
        try {
            if (Conec == null) {
                Conec = Ar.Conexion();
            }
            String QueryGuardarCliente = "{call sp_RegresarID(?)}";
            llamada = Conec.prepareCall(QueryGuardarCliente);
            llamada.registerOutParameter(1, java.sql.Types.INTEGER);
            llamada.execute();
            jala=llamada.getInt(1);
        } catch (Exception e) {
            System.out.println("ERROR " + e);
        }
        return jala;
        
        
    }
    
     public int GuardarEmpleadoConPro(String nomina,String telefono,String nombre,String correo,Boolean jefe, int Idjefe ){
        int jala = -1;
        try {
            if (Conec == null) {
                Conec = Ar.Conexion();
            }
            String QueryGuardar = "{call sp_RegistrarEmpleado(?,?,?,?,?,?,?)}"; //Cambiar
            llamada = Conec.prepareCall(QueryGuardar);
            llamada.setString(1, nomina);
            llamada.setString(2, telefono);
            llamada.setString(3, nombre);
            llamada.setString(4, correo);
            llamada.setBoolean(5, jefe);
            llamada.setInt(6, Idjefe);
            llamada.registerOutParameter(7, java.sql.Types.INTEGER);
            llamada.execute();
            jala = llamada.getInt(7);
        } catch (Exception e) {
            System.out.println("ERROR " + e);
        }
        return jala;
    }
    
    
    
    //////////////////////////////////falta
    public int GuardarEmpleadoSinPro(String nomina,String telefono,String nombre,String correo,Boolean jefe ){
        int jala = -1;
        try {
            if (Conec == null) {
                Conec = Ar.Conexion();
            }
            String QueryGuardar = "{call sp_RegistrarEmpleado(?,?,?,?,?,?)}"; //Cambiar
            llamada = Conec.prepareCall(QueryGuardar);
            llamada.setString(1, nomina);
            llamada.setString(2, telefono);
            llamada.setString(3, nombre);
            llamada.setString(4, correo);
            llamada.setBoolean(5, jefe);
            llamada.registerOutParameter(6, java.sql.Types.INTEGER);
            llamada.execute();
            jala = llamada.getInt(6);
        } catch (Exception e) {
            System.out.println("ERROR " + e);
        }
        return jala;
    }

    public int [] GuardarCliente(String nombre, String telefono, String correo, Boolean aporte, Double aportefin, String tipo) {
        int jala[] = new int[2];
        try {
            if (Conec == null) {
                Conec = Ar.Conexion();
            }
            String QueryGuardarCliente = "{call sp_RegistroCliente(?,?,?,?,?,?,?,?)}";
            llamada = Conec.prepareCall(QueryGuardarCliente);
            llamada.setString(1, nombre);
            llamada.setString(2, telefono);
            llamada.setString(3, tipo);
            llamada.setString(4, correo);
            llamada.setBoolean(5, aporte);
            llamada.setDouble(6, aportefin);
            llamada.registerOutParameter(7, java.sql.Types.INTEGER);
            llamada.registerOutParameter(8, java.sql.Types.INTEGER);
            llamada.execute();
            jala[0]=llamada.getInt(7);// regisstrp
           jala [1] = llamada.getInt(8); //id
        } catch (Exception e) {
            System.out.println("ERROR " + e);
        }
        return jala;

    }

    public int GuardarRegistro(String nombre, String password) {
        int jala = -1;
        try {
            if (Conec == null) {
                Conec = Ar.Conexion();
            }
            String QueryGuardar = "{call sp_RegistroUsuario(?,?,?)}";
            llamada = Conec.prepareCall(QueryGuardar);
            llamada.setString(1, nombre);
            llamada.setString(2, password);
            llamada.registerOutParameter(3, java.sql.Types.INTEGER);
            llamada.execute();
            jala = llamada.getInt(3);
        } catch (Exception e) {
            System.out.println("ERROR " + e);
        }
        return jala;
    }

    public int IniciarSesion(String nombre, String password) {
        int jala = -1;
        try {
            if (Conec == null) {
                Conec = Ar.Conexion();
            }
            String QueryIniciar = "{call sp_IniciarSesion2(?,?,?)}";
            llamada = Conec.prepareCall(QueryIniciar);
            llamada.setString(1, nombre);
            llamada.setString(2, password);
            llamada.registerOutParameter(3, java.sql.Types.INTEGER);
            llamada.execute();
            jala = llamada.getInt(3);
        } catch (Exception e) {
            System.out.println("ERROR " + e);
        }
        return jala;
    }
}
