package co.edu.sena.eventos.jpa.entities;

import co.edu.sena.eventos.jpa.entities.Eventos;
import co.edu.sena.eventos.jpa.entities.Usuarios;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-08-26T12:58:51")
@StaticMetamodel(Equipos.class)
public class Equipos_ { 

    public static volatile SingularAttribute<Equipos, String> equipo;
    public static volatile ListAttribute<Equipos, Eventos> eventosList;
    public static volatile SingularAttribute<Equipos, Usuarios> usuariosId;
    public static volatile SingularAttribute<Equipos, Integer> id;

}