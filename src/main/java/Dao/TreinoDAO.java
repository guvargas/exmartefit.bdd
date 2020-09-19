
package Dao;

import Model.TreinoModel;
import java.util.List;


public class TreinoDAO extends BaseDAO {

    public TreinoDAO() {
        super();
    }
    public void gravar(TreinoModel treino) {
        try {
            em.getTransaction().begin();
            em.persist(treino);
            em.getTransaction().commit();

        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            fecharConexao();
        }
    }
    
    public void remover(int id){
        TreinoModel treino = null;
        try{

           em.getTransaction().begin();
           treino = em.find(TreinoModel.class,id );
           em.remove(treino);
           em.getTransaction().commit();

        }catch(Exception e){
           em.getTransaction().rollback();
           e.printStackTrace();
        }finally {
            fecharConexao();
        }
       //return treino;
    }
    
    public TreinoModel buscarId(int id){

        TreinoModel treino = null;
         try{
            em.getTransaction().begin();
            treino = em.find(TreinoModel.class, id);
            em.getTransaction().commit();

         }catch (Exception e){
            em.getTransaction().rollback();
            e.printStackTrace();

         }finally {
             em.close();
             emf.close();
         }

        return treino;
    }
     public List<TreinoModel> buscarTodos(){

       List<TreinoModel> treino = null;

       try{
           treino = em.createQuery("from TreinoModel").getResultList();

       }catch (Exception e){
            em.getTransaction().rollback();
            e.printStackTrace();
       }finally {

            em.close();
            emf.close();
       }

        return treino;
    }

}