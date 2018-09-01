
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
   
    public PaginaDTO(Pagina pagina) {
        this.id = id;
        this.nombrePagina = nombrePagina;
    }

    public int getId() {
        return id;
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
