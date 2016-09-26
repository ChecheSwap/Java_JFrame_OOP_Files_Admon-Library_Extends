
package Libreria;

//SE REGISTRAN LOS CAMPOS A DAR DE ALTA EN EL ARCHIVO
/**
 *
 * @author MASTER_NAVARRETE
 */


import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.*;
    public class RegistroLibro {
    
   
    private String claveLib, autor, existencia, fecha, generos, ubicacion, costo, dentrada, dsalida, nombre;
    private int cantidad;
   
    
    public void establecerisbn(String clav)
    {
        claveLib = clav;
        
    }
   
    public void establecerautor(String autor)
    {
        this.autor = autor;
    }
    
    public void establecergenero(String genero)
    {
        this.generos = genero;
    }
    
    public void establecerlocacion(String locacion)
    {
        this.ubicacion = locacion;
    }
    
    public void establecercosto(String costo)
    {
        this.costo = costo;
    }
    
    public void establecercantidad(int cantidad)
    {
        this.cantidad = cantidad;
    }
    
    public String obtenerClave()
    {
        
        return claveLib;
    }
    
    public String obtenerAutor()
    {
        return autor;
    }
    
    public int obtenerExistencia()
    {
        return cantidad;
    }
    
    public String obtenerFecha()
    {
        return fecha;
    }
    public String obtenerGeneros()
    {
        return generos;
    }
    public String obtenerUbicacion()
    {
        return ubicacion;
    }
    public String obtenerCosto()
    {
        return costo;
    }
    public String obtenerDentrada()
    {
        return dentrada;
    }
    public String obtenerDsalida()
    {
        return dsalida;
    }
    public String definedFecha()
    {
        String Fecha;
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        Date now = Calendar.getInstance().getTime(); 
        Fecha = df.format(now);
        return Fecha;
    }
    public int obtenercantidad()
    {
        return cantidad;
    }

}
    

