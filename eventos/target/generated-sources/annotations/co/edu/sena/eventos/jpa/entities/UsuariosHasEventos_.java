package co.edu.sena.eventos.jpa.entities;

import co.edu.sena.eventos.jpa.entities.Eventos;
import co.edu.sena.eventos.jpa.entities.Usuarios;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-08-26T12:58:51")
@StaticMetamodel(UsuariosHasEventos.class)
public class UsuariosHasEventos_ { 

    public static volatile SingularAttribute<UsuariosHasEventos, Eventos> eventosId;
    public static volatile SingularAttribute<UsuariosHasEventos, Usuarios> usuariosId;
    public static volatile SingularAttribute<UsuariosHasEventos, Boolean> asistio;
    public static volatile SingularAttribute<UsuariosHasEventos, Integer> id;

}