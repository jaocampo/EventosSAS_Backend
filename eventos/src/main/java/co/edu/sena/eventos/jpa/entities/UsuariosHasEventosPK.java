/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.eventos.jpa.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author adsi1261718
 */
@Embeddable
public class UsuariosHasEventosPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "usuarios_id")
    private int usuariosId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "eventos_id")
    private int eventosId;

    public UsuariosHasEventosPK() {
    }

    public UsuariosHasEventosPK(int usuariosId, int eventosId) {
        this.usuariosId = usuariosId;
        this.eventosId = eventosId;
    }

    public int getUsuariosId() {
        return usuariosId;
    }

    public void setUsuariosId(int usuariosId) {
        this.usuariosId = usuariosId;
    }

    public int getEventosId() {
        return eventosId;
    }

    public void setEventosId(int eventosId) {
        this.eventosId = eventosId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) usuariosId;
        hash += (int) eventosId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsuariosHasEventosPK)) {
            return false;
        }
        UsuariosHasEventosPK other = (UsuariosHasEventosPK) object;
        if (this.usuariosId != other.usuariosId) {
            return false;
        }
        if (this.eventosId != other.eventosId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.sena.eventos.jpa.entities.UsuariosHasEventosPK[ usuariosId=" + usuariosId + ", eventosId=" + eventosId + " ]";
    }
    
}
