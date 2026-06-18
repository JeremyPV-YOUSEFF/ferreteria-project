/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ironmongery.project;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author estudianteUC
 */
public class Conexion {
    
    Connection conectar = null;

    
    public Connection  establecerConexion()
    {
        try
        {
            String cadena =
            "jdbc:sqlserver://localhost:1433;" +
            "databaseName=DbFerreteria;" +
            "encrypt=true;" +
            "trustServerCertificate=true;" +
            "user=ferreteria;" +
            "password=Ferreteria123*;";
            
            
            conectar = DriverManager.getConnection(cadena);
            /*JOptionPane.showMessageDialog(null,"Exito");*/
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"ERROR "+ e.toString());
        }
        return conectar;
    }
}
