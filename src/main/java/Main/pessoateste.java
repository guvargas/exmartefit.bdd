
package Main;

import Dao.PessoaDAO;
import Model.PessoaModel;



public class PessoaTeste {
     public static void main(String[] args){
      //PessoaModel(String nome, String cpf, String dataNascimento, String tipo, String treino, String horario) {

        PessoaModel t = new PessoaModel("Admin", "Admin","0", "Gerente", "-", "-");
        PessoaDAO pDAO = new PessoaDAO();
        pDAO.gravar(t);
       System.out.println(t);
      

//        PessoaDAO produtoRepository = new PessoaDAO();
//
//        PessoaModel produto = produtoRepository.buscarId(9);
//
//        System.out.println(produto.toString());


    }
   
}