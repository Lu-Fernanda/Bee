
package ModeloDTO;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import modelo.Pagina;
import modelo.Usuario;

/**
 *
 * @author root
 */
@XmlRootElement(name = "Pagina")
@XmlAccessorType(XmlAccessType.FIELD)


public class PaginaDTO {
    
    private int id;
    private String nombrePagina;
    private UsuarioDTO modelo;
   
    public PaginaDTO(Pagina pagina) {
        this.id = id;
        this.nombrePagina = nombrePagina;
        this.modelo= new UsuarioDTO(pagina.getModelo()); 
    }

    public int getId() {
        return id;
    }

    public UsuarioDTO getModelo() {
        return modelo;
    }

    public void setModelo(UsuarioDTO modelo) {
        this.modelo = modelo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombrePagina() {
        return nombrePagina;
    }

    public void setNombrePagina(String nombrePagina) {
        this.nombrePagina = nombrePagina;
    }
}
