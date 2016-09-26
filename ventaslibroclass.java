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

public class ventaslibroclass {
    
    File central = null;
    Scanner entrada = null;
    Object [] data = null;
    private Formatter salida;
    protected String alfaisbn;
    protected int cantidad;
    
    public boolean verificaradicion(String isbn, int cantidad)
    {
        boolean sent = false;
     central = new File(pio.path+isbn+".txt");
     
     if (central.exists())
     {
         alfaisbn = isbn; 
         this.cantidad = cantidad;
         
        try
        {
            entrada = new Scanner(this.central);
            
            data = new Object[6];
            
            for(int o=0; o<6; o+=1)
            {
                if(o!=5)
                {
                    data[o] = this.entrada.next();
                }
                else
                {
                    data[o] = this.entrada.nextInt();
                }
                
            }
            
            entrada.close();
            
            if (Integer.parseInt(data[5].toString()) < cantidad)
                    {
                        JOptionPane.showMessageDialog(null,String.format("No existe la cantidad solicitada, solo hay %s ejemplares",data[5].toString()));
                        
                    }
            else
            {
                sent = true;
            }
            
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex.toString(),"Error",0);
        }
        
        
     }
     else
     {
         JOptionPane.showMessageDialog(null,"Verifique ISBN","Error",0);
         
     }
     
     return sent;
    }
    
    public int queryprice(String isbn)
    {
        int num = 0;
        this.central = new File(pio.path+isbn+".txt");
        
        try
        {
            this.entrada = new Scanner(this.central);
            for(int q=0; q<4; q++)
            {
                entrada.next();
            }
            num = entrada.nextInt();
            
            entrada.close();
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex.toString(),"Error",0);
        }
        
        return num;
                    
    }
    
    public void realizarventa(Object [][] data)
    {
        boolean relation = false;
        
        for(int x=0; x<data.length; x++)
        {
            
           central = new File(pio.path+((String)data[x][1])+".txt");
            try
            {
                entrada = new Scanner(central);
                
                if(central.canRead() && central.canWrite() && central.exists())
                {
                 
                Object[] temp = {entrada.next(),entrada.next(),entrada.next(),entrada.next(),entrada.next(),(entrada.nextInt()- ((Integer)data[x][2]))};
                
                if(entrada != null)
                {
                  entrada.close();
                }
                 
                salida = new Formatter(pio.path+((String)data[x][1])+".txt");
                
                salida.format("%s %s %s %s %s %d",temp[0].toString(),temp[1].toString(),temp[2].toString(),temp[3].toString(),temp[4].toString(),((Integer)temp[5]));
                
                if(salida != null)
                {
                    salida.close();
                }
                
                   relation = true;
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Error con archivo, contacte adminsitrador","Error",0);
                }
                
                
            }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(null, ex.toString(),"Java",1);
            }
            
        }
            if(relation == true)
            {
                 ventaslib.instancia.restartall(1);
                 JOptionPane.showMessageDialog(null, "Listo","Java",1);
            }
           
    }
    
     
    
}
