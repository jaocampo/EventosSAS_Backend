/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.eventos.jpa.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author adsi1261718
 */
@Entity
@Table(name = "usuarios_has_eventos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UsuariosHasEventos.findAll", query = "SELECT u FROM UsuariosHasEventos u")
    , @NamedQuery(name = "UsuariosHasEventos.findByAsistio", query = "SELECT u FROM UsuariosHasEventos u WHERE u.asistio = :asistio")
    , @NamedQuery(name = "UsuariosHasEventos.findById", query = "SELECT u FROM UsuariosHasEventos u WHERE u.id = :id")})
public class UsuariosHasEventos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "asistio")
    private Boolean asistio;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @JoinColumn(name = "eventos_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Eventos eventosId;
    @JoinColumn(name = "usuarios_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Usuarios usuariosId;

    public UsuariosHasEventos() {
    }

    public UsuariosHasEventos(Integer id) {
        this.id = id;
    }

    public Boolean getAsistio() {
        return asistio;
    }

    public void setAsistio(Boolean asistio) {
        this.asistio = asistio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Eventos getEventosId() {
        return eventosId;
    }

    public void setEventosId(Eventos eventosId) {
        this.eventosId = eventosId;
    }

    public Usuarios getUsuariosId() {
        return usuariosId;
    }

    public void setUsuariosId(Usuarios usuariosId) {
        this.usuariosId = usuariosId;
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
        if (!(object instanceof UsuariosHasEventos)) {
            return false;
        }
        UsuariosHasEventos other = (UsuariosHasEventos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.sena.eventos.jpa.entities.UsuariosHasEventos[ id=" + id + " ]";
    }
    
}
