
package ModeloDTO;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import modelo.Studio;
import modelo.Usuario;

/**
 *
 * @author root
 */
@XmlRootElement(name = "Studio")
@XmlAccessorType(XmlAccessType.FIELD)

public class StudioDTO {
    
    private int id;
    private String nombre;
    private String pais;
    private String ciudad;
    private String correo;
    private String cel;
    private int calificacion;
    List<UsuarioDTO> usuarioList;

    public StudioDTO() {
    }
    public StudioDTO(Studio studio) {
        this.id = studio.getId();
        this.nombre = studio.getNombre();
        this.pais = studio.getPais();
        this.ciudad = studio.getCiudad();
        this.correo = studio.getCorreo();
        this.cel = studio.getCel();
        this.calificacion = studio.getCalificacion();
        //this.usuarioList= new ArrayList<UsuarioDTO>();
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCel() {
        return cel;
    }

    public void setCel(String cel) {
        this.cel = cel;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
 
       public List<UsuarioDTO> list_Paginas(List<Usuario> list_usu) {
        for (Usuario inf: list_usu) {
            UsuarioDTO dTO = new UsuarioDTO(inf);
            this.usuarioList.add(dTO);
        }
        return this.usuarioList;
    }    
}
