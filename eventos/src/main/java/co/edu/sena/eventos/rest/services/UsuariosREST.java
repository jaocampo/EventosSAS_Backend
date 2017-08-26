/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.eventos.rest.services;
import co.edu.sena.adsi.rest.auth.DigestUtil;
import co.edu.sena.eventos.jpa.entities.Usuarios;
import co.edu.sena.eventos.jpa.sessions.UsuariosFacade;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author adsi1261718
 */
@Path("usuarios")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class UsuariosREST {
    @EJB
    private UsuariosFacade usuariosEJB;
    
    
    @GET
    public List<Usuarios> findAll(){
        return usuariosEJB.findAll();
    }
    
    @GET
    @Path("find")
    public Usuarios findByNumDocumento(@QueryParam("numDocumento") String numDocumento){
        return usuariosEJB.findByNumDocumento(numDocumento);
    }
    
    @GET
    @Path("{id}")
    public Usuarios findById(@PathParam("id") Integer id){
        return usuariosEJB.find(id);
    }
    
    @POST
    public void create(Usuarios usuarios){
        usuarios.setPassword(
                            DigestUtil
                            .cifrarPassword(usuarios.getPassword()));
        usuariosEJB.create(usuarios);
    }
    
    @PUT
    @Path("{id}")
    public void edit(@PathParam("id") Integer id, Usuarios usuarios){
        usuariosEJB.edit(usuarios);
    }
}
