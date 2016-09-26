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
public class inventarioclass {
    static String path = pio.path;
    Scanner entrada;
    File file;
    String [] isbnlist;
    
    public inventarioclass()
    {
        this.file = new File(path);
        
    }
    
    public Object[][] start()
    {
        Object[][] send = null;
        
        if (this.file.list().length > 0)
        {
            String [] ficheros = file.list();
            
            send = new Object[file.list().length][2];
            
            
            
                int x = 0;
                for(String temp:ficheros)
                {
                    
                    try
                    {
                    file = new File(path+temp);
                    
                    entrada = new Scanner(file);
                    
                    send[x][0] = entrada.next();
                    
                    for(int y=0; y<=3; y++)
                    {
                        entrada.next();
                    }
                    
                    send[x][1] = entrada.nextInt();
                    
                    entrada.close();
                    
                    x+=1;
                    }
                     catch(Exception ex)
                     {
                        JOptionPane.showMessageDialog(null, ex.toString(),"Error",0);
                     }
                }
                
                
            }
          
        else
        {
            JOptionPane.showMessageDialog(null,"No existen Libros","Java",2);
            
        }
        
        return send;   
    }
    
}
