/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceRest;

import DaoGenerico.ConexionException;
import Facade.FacadeStudio;
import ModeloDTO.StudioDTO;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import modelo.Studio;

/**
 *
 * @author root
 */
@Path("/studio")
public class ServiceStudio {
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public StudioDTO registroStudio(StudioDTO st) throws ConexionException {
        
        FacadeStudio facade = null;
        StudioDTO dto = null;

        facade = new FacadeStudio();
        Studio sJPA = new Studio();
        sJPA.setId(st.getId());
        sJPA.setNombre(st.getNombre());
        sJPA.setPais(st.getPais());
        sJPA.setCiudad(st.getCiudad());
        sJPA.setCalificacion(st.getCalificacion());
        sJPA.setCel(st.getCel());
        sJPA.setCorreo(st.getCorreo());

        facade.crearObj(sJPA);

        return dto;
    }

    //Traer todos los usuarios que estan inscritos en el sistema
    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public List<StudioDTO> getStudio_JSON() throws ConexionException {
        List<StudioDTO> sDTO = new ArrayList<StudioDTO>();
        FacadeStudio facade = null;

        facade = new FacadeStudio();
        List<Studio> studios = facade.buscarTodoObj();
        
        for (Studio studio : studios) {
            StudioDTO dto = new StudioDTO(studio);
            sDTO.add(dto);
        }

        return sDTO;
    }

    //Traer una persona especifica
    @GET
    @Path("/{id}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public StudioDTO getStudio(@PathParam("id") String id) throws ConexionException {
        FacadeStudio facade = null;
        StudioDTO dto = null;

        facade = new FacadeStudio();
        Studio st = facade.busacarObj(Integer.parseInt(id));
        dto = new StudioDTO(st);
        return dto;
    }
}
