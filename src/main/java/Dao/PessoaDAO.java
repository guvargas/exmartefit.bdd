
package Dao;

import Model.PessoaModel;
import java.util.List;


public class PessoaDAO extends BaseDAO {

    public PessoaDAO() {
        super();
    }

    public void gravar(PessoaModel pessoa) {
        try {
            em.getTransaction().begin();
            em.persist(pessoa);
            em.getTransaction().commit();

        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            fecharConexao();
        }
    }
    
    public PessoaModel remover(int id){
        PessoaModel pessoa = null;
        try{

           em.getTransaction().begin();
           pessoa = em.find(PessoaModel.class,id );
           em.remove(pessoa);
           em.getTransaction().commit();

        }catch(Exception e){
           em.getTransaction().rollback();
           e.printStackTrace();
        }finally {
            fecharConexao();
        }
       return pessoa;
    }
    
    
    
    public void atualizar(PessoaModel pessoa){

        try{
         pessoa = em.find(PessoaModel.class, 2L);
         em.getTransaction().begin();
         pessoa.setNome("Agoragu");
         pessoa.setTipo("agrTR");
         pessoa.setTreino("0");
         pessoa.setDataNascimento("agrontem");
         em.merge(pessoa);
         em.getTransaction().commit();

        }catch (Exception e){
         em.getTransaction().rollback();
         e.printStackTrace();

        }finally {
            em.close();
            emf.close();
        }

    }

    public List<PessoaModel> buscarTodos(){

       List<PessoaModel> pessoa = null;

       try{
           pessoa = em.createQuery("from Pessoas").getResultList();

       }catch (Exception e){
            em.getTransaction().rollback();
            e.printStackTrace();
       }finally {

            em.close();
            emf.close();
       }

        return pessoa;
    }

    public PessoaModel buscarId(int id){

        PessoaModel pessoa = null;
         try{
            em.getTransaction().begin();
            pessoa = em.find(PessoaModel.class, id);
            em.getTransaction().commit();

         }catch (Exception e){
            em.getTransaction().rollback();
            e.printStackTrace();

         }finally {
             em.close();
             emf.close();
         }

        return pessoa;
    }

}
