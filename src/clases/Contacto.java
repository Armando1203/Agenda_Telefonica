
package clases;

public class Contacto {
    
    public String telefono;
    public String nombre;
    public String grupo;
    public String correo;
    
    public Contacto(){}
    
    public Contacto (String telefono, String nombre, String grupo, String correo){
        this.telefono = telefono;
        this.nombre = nombre;
        this.grupo = grupo;
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getGrupo() {
        return grupo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
}
