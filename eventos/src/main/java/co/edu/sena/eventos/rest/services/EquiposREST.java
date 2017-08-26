/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.eventos.rest.services;

import co.edu.sena.eventos.jpa.entities.Equipos;
import co.edu.sena.eventos.jpa.entities.Eventos;
import co.edu.sena.eventos.jpa.sessions.EquiposFacade;
import co.edu.sena.eventos.jpa.sessions.EventosFacade;
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
@Path("equipos")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class EquiposREST {
    @EJB
    private EquiposFacade equiposEJB;
    
    
    @GET
    public List<Equipos> findAll(){
        return equiposEJB.findAll();
    }
    
    @GET
    @Path("{id}")
    public Equipos findById(@PathParam("id") Integer id){
        return equiposEJB.find(id);
    }
    
    @POST
    public void create(Equipos equipos){
        equiposEJB.create(equipos);
    }
    
    @PUT
    @Path("{id}")
    public void edit(@PathParam("id") Integer id, Equipos equipos){
        equiposEJB.edit(equipos);
    }
}
