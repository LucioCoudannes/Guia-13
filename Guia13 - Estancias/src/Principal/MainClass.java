package Principal;

import Estancias.dominio.usuario.Usuario;
import Estancias.persistencia.UsuarioDAO;

public class MainClass {

    public static void main(String[] args) {

        // "insert into Usuarios (CorreoElectronico, Clave) Values ('luis@gmail.com', 'zxc456');"
        Usuario u1 = new Usuario("Carlos@gmail.com", "123456");

        UsuarioDAO guardar = new UsuarioDAO();

        guardar.guardarUsuario(u1);

    }

}
