/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.Pessoa_MusicaModel;

/**
 *
 * @author asg75
 */
public class Pessoa_MusicaDao extends BaseDAO {

    public Pessoa_MusicaDao() {
        super();
    }
    
    public void gravar(Pessoa_MusicaModel pm){
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
    
    public void remover(int id){
        Pessoa_MusicaModel pmm = null;
        try{
            em.getTransaction().begin();
           pmm = em.find(Pessoa_MusicaModel.class,id );
           
           em.remove(pmm);
           em.getTransaction().commit();

        }catch(Exception e){
           em.getTransaction().rollback();
           e.printStackTrace();
        }finally {
            fecharConexao();
        }
    }
}
