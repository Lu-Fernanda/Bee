
package ModeloDTO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import modelo.*;

@XmlRootElement(name = "Usuario")
@XmlAccessorType(XmlAccessType.FIELD)

public class UsuarioDTO {
    
    private int id;
    private String cc;
    private String nombre;
    private String apellido;
    private String genero;
    private int edad;
    private String celular;
    private String correo;
    private String nombreModelo;
    private String idStudio;
    private String idPagina;

    public UsuarioDTO() {
    }
    
    

    public UsuarioDTO(Usuario usu) {
        this.id = usu.getId();
        this.cc = usu.getCc();
        this.nombre = usu.getNombre();
        this.apellido = usu.getApellido();
        this.genero = usu.getGenero();
        this.edad = usu.getEdad();
        this.celular = usu.getCelular();
        this.correo = usu.getCorreo();
        this.nombreModelo = usu.getNombreModelo();
        this.idStudio =usu.getNombre();
        this.idPagina=usu.getIdPagina();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombreModelo() {
        return nombreModelo;
    }

    public void setNombreModelo(String nombreModelo) {
        this.nombreModelo = nombreModelo;
    }

    public String getIdStudio() {
        return idStudio;
    }

    public void setIdStudio(String idStudio) {
        this.idStudio = idStudio;
    }

    public String getIdPagina() {
        return idPagina;
    }

    public void setIdPagina(String idPagina) {
        this.idPagina = idPagina;
    }
    
}
