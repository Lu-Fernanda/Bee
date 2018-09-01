
package Facade;

import DaoGenerico.ConexionException;
import DaoGenerico.ServiceImpl;
import DaoGenerico.SingletonConnection;
import javax.persistence.EntityManager;
import modelo.Studio;
import modelo.Usuario;

public class FacadeStudio extends ServiceImpl<Studio> {
    
     public FacadeStudio() throws ConexionException {
        super(Studio.class);
        try{
            System.out.println("hola mundo");
             EntityManager em = SingletonConnection.getConnection();
            System.out.println("conexion!!");
            super.setEntityManager(em);
        }catch(Exception e){
            System.out.println(e.getMessage());
           throw new ConexionException("Problemas en la realizacion de conexion con la base de datos");
        }
    }
}
