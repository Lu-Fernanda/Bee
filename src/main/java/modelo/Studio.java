
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
@Table(name = "studio")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Studio.findAll", query = "SELECT s FROM Studio s"),
    @NamedQuery(name = "Studio.findById", query = "SELECT s FROM Studio s WHERE s.id = :id"),
    @NamedQuery(name = "Studio.findByNombre", query = "SELECT s FROM Studio s WHERE s.nombre = :nombre"),
    @NamedQuery(name = "Studio.findByPais", query = "SELECT s FROM Studio s WHERE s.pais = :pais"),
    @NamedQuery(name = "Studio.findByCiudad", query = "SELECT s FROM Studio s WHERE s.ciudad = :ciudad"),
    @NamedQuery(name = "Studio.findByCorreo", query = "SELECT s FROM Studio s WHERE s.correo = :correo"),
    @NamedQuery(name = "Studio.findByCel", query = "SELECT s FROM Studio s WHERE s.cel = :cel"),
    @NamedQuery(name = "Studio.findByCalificacion", query = "SELECT s FROM Studio s WHERE s.calificacion = :calificacion")})
public class Studio implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Size(max = 50)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 50)
    @Column(name = "pais")
    private String pais;
    @Size(max = 50)
    @Column(name = "ciudad")
    private String ciudad;
    @Size(max = 50)
    @Column(name = "correo")
    private String correo;
    @Size(max = 20)
    @Column(name = "cel")
    private String cel;
    @Column(name = "calificacion")
    private Integer calificacion;

    public Studio() {
    }

    public Studio(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Integer getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Integer calificacion) {
        this.calificacion = calificacion;
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
        if (!(object instanceof Studio)) {
            return false;
        }
        Studio other = (Studio) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Studio[ id=" + id + " ]";
    }
    
}
