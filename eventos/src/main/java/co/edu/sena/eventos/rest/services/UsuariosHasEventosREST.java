/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.eventos.rest.services;

import co.edu.sena.eventos.jpa.entities.Eventos;
import co.edu.sena.eventos.jpa.entities.UsuariosHasEventos;
import co.edu.sena.eventos.jpa.sessions.EventosFacade;
import co.edu.sena.eventos.jpa.sessions.UsuariosHasEventosFacade;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author adsi1261718
 */
@Path("usuarios-has-eventos")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class UsuariosHasEventosREST {
    @EJB
    private UsuariosHasEventosFacade usuariosHasEventosEJB;
    
    
    @GET
    public List<UsuariosHasEventos> findAll(){
        return usuariosHasEventosEJB.findAll();
    }
    
    @GET
    @Path("{id}")
    public UsuariosHasEventos findById(@PathParam("id") Integer id){
        return usuariosHasEventosEJB.find(id);
    }
    
    @POST
    public void create(UsuariosHasEventos usuariosHasEventos){
        usuariosHasEventosEJB.create(usuariosHasEventos);
    }
    
    @PUT
    @Path("{id}")
    public void edit(@PathParam("id") Integer id, UsuariosHasEventos usuariosHasEventos){
        usuariosHasEventosEJB.edit(usuariosHasEventos);
    }
}
