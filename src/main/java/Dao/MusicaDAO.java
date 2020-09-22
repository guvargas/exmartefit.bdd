package Dao;

import Model.MusicasModel;
import java.util.List;

public class MusicaDAO extends BaseDAO{
    
    public MusicaDAO(){
    super();
    }
    
    public void gravar(MusicasModel musica) {
        try {
            em.getTransaction().begin();
            em.persist(musica);
            em.getTransaction().commit();

        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            fecharConexao();
        }
    }
    
    public void remover(int id){
     MusicasModel m = null;
        try{
            em.getTransaction().begin();
           m = em.find(MusicasModel.class,id );
           em.remove(m);
           em.getTransaction().commit();

        }catch(Exception e){
           em.getTransaction().rollback();
           e.printStackTrace();
        }finally {
            fecharConexao();
        }
        //return musica
    }
    
    public List<MusicasModel> buscarTodos(){

       List<MusicasModel> musica = null;

       try{
           musica = em.createQuery("from MusicasModel").getResultList();

       }catch (Exception e){
            em.getTransaction().rollback();
            e.printStackTrace();
       }finally {

            em.close();
            emf.close();
       }

        return musica;
    }
    
    public MusicasModel buscarId(int id){

        MusicasModel musica = null;
         try{
            em.getTransaction().begin();
            musica = em.find(MusicasModel.class, id);
            em.getTransaction().commit();

         }catch (Exception e){
            em.getTransaction().rollback();
            e.printStackTrace();

         }finally {
             em.close();
             emf.close();
         }

        return musica;
    }
}
