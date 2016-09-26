/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libreria;

/**
 *
 * @author MASTER_NAVARRETE
 */

import java.util.*;
import java.io.*;
import javax.swing.*;

public class creatingFile {
    private Formatter exit;
    private String orcaLot;
    private File file;
    private RegistroLibro altadatoslocal;
    private Scanner read;
    
    private String autor, genero, locacion, costo,ISBN;
    private int librocantidad;
   
    public creatingFile(String ISBN, String autor, String genero, String locacion, String costo, int cantidad)
    {
       this.ISBN = ISBN;
       this.orcaLot = pio.path + ISBN + ".txt";
       this.autor = autor;
       this.genero = genero;
       this.locacion = locacion;
       this.costo = costo;
       librocantidad = cantidad;
      
        file = new File(orcaLot);
    }
    
    public boolean existfile()
    {
        if(file.exists() == true)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean adddata()
    {
        boolean nofa = false;
        try
        {
             exit = new Formatter(file);
             nofa = true;
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex.toString(),"Error",0);
        }
        
        if( nofa == true)
        {
            try
            {
                exit.format("%s %s %s %s %s %d",this.ISBN,this.autor,this.genero,this.locacion,this.costo,this.librocantidad);
                JOptionPane.showMessageDialog(null,"Se ha dado de alta el isbn","Error",1);
            }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(null,ex.toString(),"Error",0);
            }
        }
        
       return nofa;
    }
    
    
    public void closefile()
    {
        if (exit != null)
        {
            exit.close();
        }
    }
    
}