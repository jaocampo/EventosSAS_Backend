/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.eventos.jpa.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
    , @NamedQuery(name = "UsuariosHasEventos.findByUsuariosId", query = "SELECT u FROM UsuariosHasEventos u WHERE u.usuariosHasEventosPK.usuariosId = :usuariosId")
    , @NamedQuery(name = "UsuariosHasEventos.findByEventosId", query = "SELECT u FROM UsuariosHasEventos u WHERE u.usuariosHasEventosPK.eventosId = :eventosId")
    , @NamedQuery(name = "UsuariosHasEventos.findByAsistio", query = "SELECT u FROM UsuariosHasEventos u WHERE u.asistio = :asistio")})
public class UsuariosHasEventos implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected UsuariosHasEventosPK usuariosHasEventosPK;
    @Column(name = "asistio")
    private Boolean asistio;
    @JoinColumn(name = "eventos_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Eventos eventos;
    @JoinColumn(name = "usuarios_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Usuarios usuarios;

    public UsuariosHasEventos() {
    }

    public UsuariosHasEventos(UsuariosHasEventosPK usuariosHasEventosPK) {
        this.usuariosHasEventosPK = usuariosHasEventosPK;
    }

    public UsuariosHasEventos(int usuariosId, int eventosId) {
        this.usuariosHasEventosPK = new UsuariosHasEventosPK(usuariosId, eventosId);
    }

    public UsuariosHasEventosPK getUsuariosHasEventosPK() {
        return usuariosHasEventosPK;
    }

    public void setUsuariosHasEventosPK(UsuariosHasEventosPK usuariosHasEventosPK) {
        this.usuariosHasEventosPK = usuariosHasEventosPK;
    }

    public Boolean getAsistio() {
        return asistio;
    }

    public void setAsistio(Boolean asistio) {
        this.asistio = asistio;
    }

    public Eventos getEventos() {
        return eventos;
    }

    public void setEventos(Eventos eventos) {
        this.eventos = eventos;
    }

    public Usuarios getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usuariosHasEventosPK != null ? usuariosHasEventosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsuariosHasEventos)) {
            return false;
        }
        UsuariosHasEventos other = (UsuariosHasEventos) object;
        if ((this.usuariosHasEventosPK == null && other.usuariosHasEventosPK != null) || (this.usuariosHasEventosPK != null && !this.usuariosHasEventosPK.equals(other.usuariosHasEventosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.sena.eventos.jpa.entities.UsuariosHasEventos[ usuariosHasEventosPK=" + usuariosHasEventosPK + " ]";
    }
    
}
