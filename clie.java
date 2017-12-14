package tremedumb;
import java.io.*;
import java.util.*;
/**
 *
 * @author Lenovo
 */
public class Cliente {
    public int ci;
    public String nombre;
       
    public void listar()
    {
        try {
            File arch = new File("F:\\clientes.txt");
            Scanner in = new Scanner(arch);
            int s=0;
            while(in.hasNextLine())
            {
                s++;
                ci = in.nextInt();
                nombre = in.nextLine();
                
                //System.out.print("------------LISTA DE CLIENTES-----------\n");
                System.out.println(s+"    "+ci+" "+nombre);
                
            }
            System.out.println("\n");
        } 
        catch (Exception ex) 
        {
            System.out.println("error");
        }
                     
    }
}
