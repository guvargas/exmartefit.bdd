/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.PessoaMusicaModel;
import java.util.List;

/**
 *
 * @author asg75
 */
public class PessoaMusicaDao extends BaseDAO {

    public PessoaMusicaDao() {
        super();
    }
    
    public void gravar(PessoaMusicaModel pm){
         try {
            em.getTransaction().begin();
            em.persist(pm);
            em.getTransaction().commit();

        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            fecharConexao();
        }
         
    }
    public List<PessoaMusicaModel> buscarTodos(){

       List<PessoaMusicaModel> pmd = null;

       try{
           pmd = em.createQuery("from PessoaModel").getResultList();

       }catch (Exception e){
            em.getTransaction().rollback();
            e.printStackTrace();
       }finally {

            em.close();
            emf.close();
       }

        return pmd;
    }
  
}
