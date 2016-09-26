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

import javax.swing.JOptionPane;

public class Logclass {
    
    public Logclass(String user, String pass)
    {
                  
    Xuser = user;
    Xpass = pass;
              
    }
    
    public boolean start()
    {
        
        boolean aptio = false;
        
        if ((Xuser.equals(Zuser) == true) && (Xpass.equals(Zpass) == true))
        {
            aptio = true;
        }
        
        return aptio;
    }
    
 
    
    private String Xuser, Xpass;
    
    private static final String Zuser = "admin";
    private static final String Zpass = "pass";
    
}
