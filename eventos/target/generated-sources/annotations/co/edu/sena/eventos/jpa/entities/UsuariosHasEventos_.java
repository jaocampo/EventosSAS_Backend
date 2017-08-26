package co.edu.sena.eventos.jpa.entities;

import co.edu.sena.eventos.jpa.entities.Eventos;
import co.edu.sena.eventos.jpa.entities.Usuarios;
import co.edu.sena.eventos.jpa.entities.UsuariosHasEventosPK;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-08-26T09:23:58")
@StaticMetamodel(UsuariosHasEventos.class)
public class UsuariosHasEventos_ { 

    public static volatile SingularAttribute<UsuariosHasEventos, Boolean> asistio;
    public static volatile SingularAttribute<UsuariosHasEventos, UsuariosHasEventosPK> usuariosHasEventosPK;
    public static volatile SingularAttribute<UsuariosHasEventos, Eventos> eventos;
    public static volatile SingularAttribute<UsuariosHasEventos, Usuarios> usuarios;

}