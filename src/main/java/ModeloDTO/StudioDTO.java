
package ModeloDTO;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import modelo.Studio;
import modelo.Usuario;


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

    public StudioDTO() {
    }

    
    public StudioDTO(Studio st) {
        this.id = st.getId();
        this.nombre = st.getNombre();
        this.pais = st.getPais();
        this.ciudad = st.getCiudad();
        this.correo = st.getCorreo();
        this.cel = st.getCel();
        this.calificacion = st.getCalificacion();
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
}
