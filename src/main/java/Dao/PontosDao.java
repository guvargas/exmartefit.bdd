/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.PontoModel;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author asg75
 */
public class PontosDao extends BaseDAO {

    public PontosDao() {
    super();
    }
    
    public void gravar(PontoModel pontoBatido){
         try {
            em.getTransaction().begin();
            em.persist(pontoBatido);
            em.getTransaction().commit();

        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            fecharConexao();
        }
    }
    
    public void remover(int id){
     PontoModel ponto = null;
        try{
            em.getTransaction().begin();
           ponto = em.find(PontoModel.class,id );
           
           em.remove(ponto);
           em.getTransaction().commit();

        }catch(Exception e){
           em.getTransaction().rollback();
           e.printStackTrace();
        }finally {
            fecharConexao();
        }
    }

    public List<PontoModel> buscarTodos(){

       List<PontoModel> ponto = null;

       try{
           ponto = em.createQuery("from PontoModel").getResultList();

       }catch (Exception e){
            em.getTransaction().rollback();
            e.printStackTrace();
       }finally {

            em.close();
            emf.close();
       }

        return ponto;
    }
    
    
}
