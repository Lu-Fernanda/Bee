/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceRest;

import DaoGenerico.ConexionException;
import Facade.FacadeDenuncia;
import ModeloDTO.DenunciaDTO;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import modelo.Denuncia;

/**
 *
 * @author root
 */
@Path("/denuncia")
public class ServiceDenuncia {
    
      @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public DenunciaDTO registroDenuncia(DenunciaDTO den) throws ConexionException {
          
        FacadeDenuncia facade = null;
        DenunciaDTO dto = null;

        facade = new FacadeDenuncia();
        Denuncia sJPA = new Denuncia();
        sJPA.setId(den.getId());
        sJPA.setSospecha(den.isEstado());
        sJPA.setTipoPersona(den.getTipoPersona());
        sJPA.setNombrePersona(den.getNombrePersona());
        sJPA.setRelato(den.getRelato());
        sJPA.setEstado(den.isEstado());
        sJPA.setIdDenunciante(den.getIdDenunciante());
        
        facade.crearObj(sJPA);

        return dto;
    }

    //Traer todos los usuarios que estan inscritos en el sistema
    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public List<DenunciaDTO> getDenuncia_JSON() throws ConexionException {
        List<DenunciaDTO> denDTO = new ArrayList<DenunciaDTO>();
        FacadeDenuncia facade = null;

        facade = new FacadeDenuncia();
        List<Denuncia> denuncias = facade.buscarTodoObj();
        
        for (Denuncia denu : denuncias) {
            DenunciaDTO dto = new DenunciaDTO(denu);
            denDTO.add(dto);
        }

        return denDTO;
    }

    //Traer una persona especifica
    @GET
    @Path("/{id}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public DenunciaDTO getStudio(@PathParam("id") String id) throws ConexionException {
        FacadeDenuncia facade = null;
        DenunciaDTO dto = null;

        facade = new FacadeDenuncia();
        Denuncia st = facade.busacarObj(Integer.parseInt(id));
        dto = new DenunciaDTO(st);
        return dto;
    }
}
