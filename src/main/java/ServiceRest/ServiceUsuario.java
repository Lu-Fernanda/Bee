//
//package ServiceRest;
//
//import DaoGenerico.ConexionException;
//import ModeloDTO.UsuarioDTO;
//import Facade.FacadeStudio;
//import Facade.FacadeUsuario;
//import java.util.ArrayList;
//import java.util.List;
//import javax.ws.rs.Consumes;
//import javax.ws.rs.DELETE;
//import javax.ws.rs.GET;
//import javax.ws.rs.POST;
//import javax.ws.rs.Path;
//import javax.ws.rs.PathParam;
//import javax.ws.rs.Produces;
//import javax.ws.rs.core.MediaType;
//import modelo.Studio;
//import modelo.Usuario;
//
//@Path("/modelo")
//public class ServiceUsuario {
//    
//    //Agregar usuario al sistema
//    @POST
//    @Consumes(MediaType.APPLICATION_JSON)
//    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
//    public UsuarioDTO registroUsuario(UsuarioDTO usu) throws ConexionException {
//        
//        FacadeUsuario facade = null;
//        UsuarioDTO dto = null;
//
//        facade = new FacadeUsuario();
//        Usuario usuJPA = new Usuario();
//        
//     
//        usuJPA.setNombre(usu.getNombre());
//        usuJPA.setApellido(usu.getApellido());
//        usuJPA.setCc(usu.getCc());
//        usuJPA.setEdad(usu.getEdad());
//        usuJPA.setCelular(usu.getCelular());
//        usuJPA.setCorreo(usu.getCorreo());
//        usuJPA.setGenero(usu.getGenero());
//        usuJPA.setNombreModelo(usu.getNombreModelo());
//        
//        FacadeStudio fs= new FacadeStudio();
//        Studio studio=fs.busacarObj(usu.getStudio().getId());
//        usuJPA.setIdStudio(studio);
//        
//        facade.crearObj(usuJPA);
//
//        return dto;
//    }
//
//    //Traer todos los usuarios que estan inscritos en el sistema
//    @GET
//    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
//    public List<UsuarioDTO> getUsuario_JSON() throws ConexionException {
//        List<UsuarioDTO> usuDTO = new ArrayList<UsuarioDTO>();
//        FacadeUsuario facade = null;
//
//        facade = new FacadeUsuario();
//        List<Usuario> usuarios = facade.buscarTodoObj();
//        
//        for (Usuario usu : usuarios) {
//            UsuarioDTO dto = new UsuarioDTO(usu);
//            //dto.list_Paginas(usu.getPaginaList());
//            usuDTO.add(dto);
//        }
//
//        return usuDTO;
//    }
//
//    //Traer una persona especifica
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
//        return dto;
//    }
//}
