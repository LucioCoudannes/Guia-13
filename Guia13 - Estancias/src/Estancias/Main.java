
package Estancias;

import Estancias.dominio.usuario.Usuario;
import Estancias.persistencia.UsuarioDAO;


public class Main {

    public static void main(String[] args) {
             
        Usuario u1 = new Usuario("Carlos@gmail.com", "123456");

        UsuarioDAO guardar = new UsuarioDAO();

        guardar.guardarUsuario(u1);
    }
    
}
