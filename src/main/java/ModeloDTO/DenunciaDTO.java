
package ModeloDTO;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import modelo.Denuncia;
import modelo.Studio;


@XmlRootElement(name = "Denuncia")
@XmlAccessorType(XmlAccessType.FIELD)

public class DenunciaDTO {
    
    private int id;
    private boolean sospecha;
    private int tipoPersona;
    private String nombrePersona;
    private String relato;
    private boolean estado;
    private int idDenunciante;

    public DenunciaDTO() {
    }
    

    public DenunciaDTO(Denuncia den) {
        this.id = den.getId();
        this.sospecha = den.getSospecha();
        this.tipoPersona = den.getTipoPersona();
        this.nombrePersona = den.getNombrePersona();
        this.relato = den.getRelato();
        this.estado = den.getEstado();
        this.idDenunciante= den.getIdDenunciante();
    }

   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isSospecha() {
        return sospecha;
    }

    public void setSospecha(boolean sospecha) {
        this.sospecha = sospecha;
    }

    public int getTipoPersona() {
        return tipoPersona;
    }

    public void setTipoPersona(int tipoPersona) {
        this.tipoPersona = tipoPersona;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getRelato() {
        return relato;
    }

    public void setRelato(String relato) {
        this.relato = relato;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getIdDenunciante() {
        return idDenunciante;
    }

    public void setIdDenunciante(int idDenunciante) {
        this.idDenunciante = idDenunciante;
    }
    
}
