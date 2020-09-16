
package Dao;

import Model.PessoaModel;



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

}
