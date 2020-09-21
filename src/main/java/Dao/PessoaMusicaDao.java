package Dao;

import Model.PessoaMusicaModel;
import java.util.List;


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
           pmd = em.createQuery("from PessoaMusicaModel").getResultList();

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
