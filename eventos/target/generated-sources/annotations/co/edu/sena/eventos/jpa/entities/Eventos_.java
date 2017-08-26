package co.edu.sena.eventos.jpa.entities;

import co.edu.sena.eventos.jpa.entities.Equipos;
import co.edu.sena.eventos.jpa.entities.UsuariosHasEventos;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-08-26T10:08:38")
@StaticMetamodel(Eventos.class)
public class Eventos_ { 

    public static volatile SingularAttribute<Eventos, String> fecha;
    public static volatile ListAttribute<Eventos, UsuariosHasEventos> usuariosHasEventosList;
    public static volatile SingularAttribute<Eventos, String> hora;
    public static volatile ListAttribute<Eventos, Equipos> equiposList;
    public static volatile SingularAttribute<Eventos, String> lugar;
    public static volatile SingularAttribute<Eventos, Integer> id;
    public static volatile SingularAttribute<Eventos, String> nombre;

}