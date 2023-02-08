package tienda.Persistencia;

import java.sql.SQLException;
import java.util.Scanner;

public class ProductoDAO extends DAO {
    
    Scanner leer = new Scanner(System.in);

    public void mostrarLista() throws Exception {

        //select nombre from producto;
        String sql = "select * from producto;";
        consultarBase(sql);
        while (resultado.next()) {

            String nombres = resultado.getString("nombre");
            Integer precio = resultado.getInt("precio");
            String codigo = resultado.getString("codigo_fabricante");
            System.out.println("Nombre Producto " + nombres + " $" + precio + " COD " + codigo);
        }

    }
    
    public void mostrarNombreProducto() throws Exception {

        //select nombre from producto;
        String sql = "select nombre from producto;";
        consultarBase(sql);
        while (resultado.next()) {

            String nombres = resultado.getString("nombre");
            System.out.println("Nombre Producto " + nombres);
        }

    }

    public void nombreyprecioProducto() throws SQLException, Exception {

        String sql = "select nombre, precio from producto;";
        consultarBase(sql);
        while (resultado.next()) {

            String nombres = resultado.getString("nombre");
            Integer precio = resultado.getInt("precio");
            System.out.println("Nombre Producto " + nombres + " $ " + precio);
        }

    }

    public void precioentre120y202() throws Exception {

        String sql = "select * from producto where precio >120 and precio <202 order by precio ;";
        consultarBase(sql);
        while (resultado.next()) {

            String nombres = resultado.getString("nombre");
            Integer precio = resultado.getInt("precio");
            System.out.println("Producto " + nombres + " precio $" + precio);
        }

    }
    
  
    
    public void mostrarPortatiles() throws Exception {

        String sql = "select * from producto where nombre like \"%portatil%\";";
        consultarBase(sql);
        while (resultado.next()) {

            String nombres = resultado.getString("nombre");
            Integer precio = resultado.getInt("precio");
            System.out.println("Producto " + nombres + " precio $" + precio);
        }

    }
    
    
    
     public void productoMasBarato() throws Exception {

        String sql = "select * from producto order by precio limit 1;";
        consultarBase(sql);
        while (resultado.next()) {

            String nombres = resultado.getString("nombre");
            Integer precio = resultado.getInt("precio");
            Integer Cod_Fab = resultado.getInt("codigo_fabricante");
            System.out.println("Producto " + nombres + " precio $" + precio + " codigoFabricante " + Cod_Fab);
        }

    }
     
     public void ingresarProducto() throws Exception{
         
         System.out.println("Ingrese el nombre del producto");
         String Nproducto = leer.next();
         System.out.println("ingrese el precio del producto");
         Integer Precio = leer.nextInt();
         System.out.println("ingrese el codigo del fabricante");
         Integer Cod_Fab = leer.nextInt();
         
         String sql = "Insert into Producto"
                 + " (Nombre, Precio, Codigo_Fabricante) Values"
                 + " ('" + Nproducto + "', '" + Precio + "', '" + Cod_Fab + "')";
         IME(sql);
         
     }
     
     public void modificarProducto() throws Exception{
         
         System.out.println("Ingrese el nombre del producto a modificar");
         String nombreV = leer.next();
         System.out.println("Ingrese el nombre nuevo");
         String nombreN = leer.next();
         
         
         
         String sql = "update producto set Nombre = '" + nombreN + "' where Nombre like '%" + nombreV + "%';";
         IME(sql);
         
     }
     
     

}
