package co.edu.sena.eventos.jpa.entities;

import co.edu.sena.eventos.jpa.entities.Equipos;
import co.edu.sena.eventos.jpa.entities.Roles;
import co.edu.sena.eventos.jpa.entities.UsuariosHasEventos;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-08-26T09:23:58")
@StaticMetamodel(Usuarios.class)
public class Usuarios_ { 

    public static volatile SingularAttribute<Usuarios, String> apellidos;
    public static volatile SingularAttribute<Usuarios, String> numDocumento;
    public static volatile SingularAttribute<Usuarios, String> password;
    public static volatile ListAttribute<Usuarios, UsuariosHasEventos> usuariosHasEventosList;
    public static volatile ListAttribute<Usuarios, Roles> rolesList;
    public static volatile ListAttribute<Usuarios, Equipos> equiposList;
    public static volatile SingularAttribute<Usuarios, Integer> id;
    public static volatile SingularAttribute<Usuarios, String> nombres;

}