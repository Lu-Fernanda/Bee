/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author root
 */
@Entity
@Table(name = "denuncia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Denuncia.findAll", query = "SELECT d FROM Denuncia d"),
    @NamedQuery(name = "Denuncia.findById", query = "SELECT d FROM Denuncia d WHERE d.id = :id"),
    @NamedQuery(name = "Denuncia.findBySospecha", query = "SELECT d FROM Denuncia d WHERE d.sospecha = :sospecha"),
    @NamedQuery(name = "Denuncia.findByTipoPersona", query = "SELECT d FROM Denuncia d WHERE d.tipoPersona = :tipoPersona"),
    @NamedQuery(name = "Denuncia.findByNombrePersona", query = "SELECT d FROM Denuncia d WHERE d.nombrePersona = :nombrePersona"),
    @NamedQuery(name = "Denuncia.findByRelato", query = "SELECT d FROM Denuncia d WHERE d.relato = :relato"),
    @NamedQuery(name = "Denuncia.findByEstado", query = "SELECT d FROM Denuncia d WHERE d.estado = :estado"),
    @NamedQuery(name = "Denuncia.findByIdDenunciante", query = "SELECT d FROM Denuncia d WHERE d.idDenunciante = :idDenunciante")})
public class Denuncia implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Column(name = "sospecha")
    private Boolean sospecha;
    @Column(name = "tipoPersona")
    private Integer tipoPersona;
    @Size(max = 50)
    @Column(name = "nombrePersona")
    private String nombrePersona;
    @Size(max = 500)
    @Column(name = "relato")
    private String relato;
    @Column(name = "estado")
    private Boolean estado;
    @Column(name = "idDenunciante")
    private Integer idDenunciante;

    public Denuncia() {
    }

    public Denuncia(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getSospecha() {
        return sospecha;
    }

    public void setSospecha(Boolean sospecha) {
        this.sospecha = sospecha;
    }

    public Integer getTipoPersona() {
        return tipoPersona;
    }

    public void setTipoPersona(Integer tipoPersona) {
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

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Integer getIdDenunciante() {
        return idDenunciante;
    }

    public void setIdDenunciante(Integer idDenunciante) {
        this.idDenunciante = idDenunciante;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Denuncia)) {
            return false;
        }
        Denuncia other = (Denuncia) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Denuncia[ id=" + id + " ]";
    }
    
}
