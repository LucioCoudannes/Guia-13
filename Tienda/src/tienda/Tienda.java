/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tienda;

import tienda.Persistencia.FabricanteDAO;
import tienda.Servicios.ProductoService;

/**
 *
 * @author A288808
 */
public class Tienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
       
        ProductoService PD = new ProductoService();
        FabricanteDAO fd = new FabricanteDAO();
        
       
        PD.ingresarProducto();
        PD.mostrarLista();
        PD.modificarProducto();
        PD.mostrarLista();
        
        
        
        
     
        
    }
    
}
