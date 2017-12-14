package tremedumb;

import java.io.*;
import java.util.*;

/**
 *
 * @author Lenovo
 */
public class Venta 
{
    public int nroVenta;
    //public String fecha;
    public int cantidad;
    public double precioVentaU;
    public double total;
   // public int codigoProducto;
    public int ci;
    public int codigoProducto;
    public String nombre;
    
    private File arch;
    
    public Venta()
    {
       arch = new File("F:\\ventas.txt"); 
    }
       
    public void listaPorCliente()
    {
        try {
            Producto objA =new Producto();
            
            Cliente obj = new Cliente();
            Scanner in = new Scanner(arch);                    
            while(in.hasNextLine())
            {              
                nroVenta = in.nextInt();
                //fecha = in.nextLine();
                //nombreProducto = in.nextLine();
                //cantidad = in.nextInt();
                //precioVentaU = in.nextInt();
                //total = in.nextDouble();
                //codigoProducto = in.nextInt();
                //ci = in.nextInt();
                nombre = in.nextLine();
                //String nombreProducto = objA.lista(codigoProducto);
               // String codigoProducto = obj.listar(nombre);
                
             
                System.out.println(nroVenta+" "+nombreProducto+" "+cantidad+" "+precioVentaU+" "+total+" "+nombre);
               
            }
             
        } 
        catch (Exception ex) 
        {
            System.out.println("ERROrrrrrrrrrrrrrrrr");
        }
                     
    }
   /*
    
    public void listaPorFecha()
    {
        
    }
    public void listaPorproducto()
    {
        
    }
    public void totalVentas()
    {
        
    }*/
}

