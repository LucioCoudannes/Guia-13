package Estancias.persistencia;

import Estancias.dominio.usuario.Usuario;

public class UsuarioDAO extends DAO {
    
    

    public void guardarUsuario(Usuario usuario) throws Exception {

        try {
            if (usuario == null) {
                throw new Exception("Debe indicar un usuario");

            }
            String sql = "INSERT INTO Usuario(correoElectronico, clave)" + "VALUES ( '" + usuario.getCorreoElectronico() + "', '" + usuario.getClave() + "' );";
            IME(sql);

        } catch (Exception e) {

            throw e;

        }

    }
    
    public void modificarUsuario(Usuario usuario) throws Exception {

        try {
            if (usuario == null) {
                throw new Exception("Debe indicar un usuario");

            }
            String sql = "UPDATE Usuario SET " + "clave = '" + usuario.getClave() + "' WHERE correoElectronico = '" + usuario.getCorreoElectronico()+ "' );";
            IME(sql);

        } catch (Exception e) {

            throw e;

        }

    }
    
    public void eliminarUsuario(String correoElectronico) throws Exception {

        try {
            
            String sql = "DELETE FROM Usuario WHERE correoElectronico = '" + correoElectronico + "'";
            IME(sql);

        } catch (Exception e) {

            throw e;

        }

    }
    
    

}

