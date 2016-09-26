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

import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

public class update {
    
    private String path;
    String[] datos;
    Scanner lector;
    File archivo;
    Formatter salida;
    
    public update(String path)
    {
     this.path = pio.path + path + ".txt";
     archivo = new File(this.path);
     datos = new String[6];
    }
    
    public String[] chargedata()
    {
        
        try
        {
            lector = new Scanner(archivo);
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex.toString(),"Java Error",0);
        }
       try
       {
           while(lector.hasNext())
           {
           datos[0] = lector.next();
           datos[1] = lector.next();
           datos[2] = lector.next();
           datos[3] = lector.next();
           datos[4] = lector.next();
           datos[5] = Integer.toUnsignedString(lector.nextInt());
           
           }
       }
       catch(Exception ex)
        {
                   JOptionPane.showMessageDialog(null,ex.toString(),"Java Error",0);
        }
       
       lector.close();
       
       
        return datos;
    }
    
    public void updatefile(String [] datos, int cantidad)
    {
        try
        {
            salida = new Formatter(path);
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.toString(),"Java Internal Error",0);
        }
        
        try
        {
           salida.format("%s %s %s %s %s %d",datos[0],datos[1],datos[2],datos[3],datos[4],cantidad);
           JOptionPane.showMessageDialog(null,"Se ha actualizado el Libro","Java",1);
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex.toString(),"Java error",0);
        }
        
        if(salida!= null)
        {
            salida.close();
        } 
        
    }
    
    public boolean updatequantity(int cantidad)
    {
        datos = chargedata();
        
        
        try
        {
           updatefile(datos,cantidad);
           return true;
        }
        catch(Exception ex)
                {
                    JOptionPane.showMessageDialog(null,ex.toString(),"Java error",0);
                    return false;
                }
        
    }
    
    
}
