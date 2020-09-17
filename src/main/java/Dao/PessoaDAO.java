
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
    
    public void remover(int id){
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
//       return pessoa;
    }
    
    
    
    public void atualizar(PessoaModel pessoa, int id,String novoTreino){

        try{
         pessoa = em.find(PessoaModel.class, id);
         em.getTransaction().begin();
//         pessoa.setNome("Agoragu");
//         pessoa.setTipo("agrTR");
//         pessoa.setDataNascimento("agrontem");
System.out.print("CHEGO AQUI TENTANDO ATUALIZAR");
System.out.print("CHEGO AQUI TENTANDO ATUALIZAR");

System.out.print("CHEGO AQUI TENTANDO ATUALIZAR");

System.out.print("CHEGO AQUI TENTANDO ATUALIZAR");

       pessoa.setTreino(novoTreino);
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
           pessoa = em.createQuery("from PessoaModel").getResultList();

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
    
    
    public PessoaModel buscarNome(String name){

        PessoaModel pessoa = null;
         try{
            em.getTransaction().begin();
            pessoa = em.find(PessoaModel.class, name);
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
