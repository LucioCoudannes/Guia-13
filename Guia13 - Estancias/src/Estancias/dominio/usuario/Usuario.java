
package Estancias.dominio.usuario;


public class Usuario {
    
    private String correoElectronico;
    private String clave;

    public Usuario() {
    }

    public Usuario(String correoElectronico, String clave) {
        this.correoElectronico = correoElectronico;
        this.clave = clave;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Usuario{");
        sb.append("correoElectronico=").append(correoElectronico);
        sb.append(", clave=").append(clave);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
