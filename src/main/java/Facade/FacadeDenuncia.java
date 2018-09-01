/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import DaoGenerico.ConexionException;
import DaoGenerico.ServiceImpl;
import DaoGenerico.SingletonConnection;
import javax.persistence.EntityManager;
import modelo.Denuncia;
import modelo.Pagina;

/**
 *
 * @author root
 */
public class FacadeDenuncia extends ServiceImpl<Denuncia> {
    
     public FacadeDenuncia() throws ConexionException {
        super(Denuncia.class);
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

