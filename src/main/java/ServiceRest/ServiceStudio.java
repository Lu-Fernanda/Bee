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
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import modelo.Studio;

/**
 *
 * @author root
 */

@Path("/studio")
public class ServiceStudio {
    
     //Agregar usuario al sistema
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public StudioDTO registroUsuario(StudioDTO st) throws ConexionException {
        
        FacadeStudio facade = null;
        StudioDTO dto = null;

        facade = new FacadeStudio();
        Studio stJPA = new Studio();
        System.out.println("--------------------"+st.getCel()+"------");
        stJPA.setNombre(st.getNombre());
        stJPA.setPais(st.getPais());
        stJPA.setCiudad(st.getCiudad());
        stJPA.setCorreo(st.getCorreo());
        stJPA.setCel(st.getCel());
        stJPA.setCalificacion(st.getCalificacion());

        facade.crearObj(stJPA);

        return dto;
    }

    //Traer todos los usuarios que estan inscritos en el sistema
    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public List<StudioDTO> getStudio_JSON() throws ConexionException {
        List<StudioDTO> stuDTO = new ArrayList<StudioDTO>();
        FacadeStudio facade = null;

        facade = new FacadeStudio();
        List<Studio> stu = facade.buscarTodoObj();
        
//        for (Studio stt : stu) {
//            StudioDTO dto = new StudioDTO(stt);
//            //dto.list_Paginas(usu.getPaginaList());
//            stuDTO.add(dto);
//        }

        return stuDTO;
    }

    //Traer una persona especifica
//    @GET
//    @Path("/{id}")
//    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
//    public UsuarioDTO getEmployee(@PathParam("cc") String cc) throws ConexionException {
//        FacadeUsuario facade = null;
//        UsuarioDTO dto = null;
//
//        facade = new FacadeUsuario();
//        Usuario usu = facade.busacarObj(Integer.parseInt(cc));
//        dto = new UsuarioDTO(usu);
//        dto.list_Paginas(usu.getPaginaList());
//        return dto;
//    }

}
