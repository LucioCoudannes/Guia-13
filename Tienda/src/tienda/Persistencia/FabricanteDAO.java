
package tienda.Persistencia;

import java.util.Scanner;


public class FabricanteDAO extends DAO{
    
    Scanner leer = new Scanner(System.in);
    
    public void ingresarDatoFab() throws Exception{
         
         System.out.println("Ingrese el fabricante");
         String fab = leer.next();
         String sql = "Insert into Fabricante (Nombre) Values (' " + fab + "')";
         IME(sql);
         
     }
    
}
