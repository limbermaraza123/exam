/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tremedumb;
import java.io.*;
import java.util.*;

/**
 *
 * @author Lenovo
 */
public class Tremedumb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Cliente objj = new Cliente();
        objj.listar(); 
        Producto objaA = new Producto();
        objaA.lista();
        Venta objB = new Venta();
        objB.listaPorCliente();
    }
    
}
