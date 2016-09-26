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
import javax.swing.*;

public class deleteISBN {
    
    String isbn;
    File file;
    public deleteISBN(String isbn)
    {
       
       this.isbn = pio.path+isbn+".txt" ;
       
        file = new File(this.isbn);
    }
    
    public boolean existfile()
    {
        if(file.exists())
                {
                    return true;
                }
        else
        {
            return false;
        }
    }
    
    public void deleteFile()
    {
        try
        {
            file.delete();
            JOptionPane.showMessageDialog(null,"ISBN eliminado","Java",1);
            deleteisbnJF.inst.cleartxt();
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex.toString(),"Java Error",0);
        }
        
    }
    
    
    
    
}
