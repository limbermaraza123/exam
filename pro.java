package tremedumb;
import java.io.*;
import java.util.*;
/**
 *
 * @author Lenovo
 */
public class Producto {
    
    public int codigoProducto;
    public String nombreProducto;
    public double precio;
    public double saldo;
    
    private File arch;
    
    public Producto()
    {
        arch = new File("F:\\productos.txt");
    }      
    public void lista()
    {
        try {
            
            Scanner in = new Scanner(arch);  
            int s=0;
            while(in.hasNextLine())
            {
                s++;
                codigoProducto = in.nextInt();
                nombreProducto = in.nextLine();
                //precio = in.nextDouble();
                //saldo = in.nextDouble();
                
                System.out.println(s+"         "+codigoProducto+" "+nombreProducto);
            } 
            System.out.println("\n");
        } 
        catch (Exception ex) 
        {
            System.out.println("ERRORrrrrrrrrrrrrrrrr");
        }
                     
    }
}
