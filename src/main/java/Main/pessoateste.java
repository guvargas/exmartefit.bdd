
package Main;

import Dao.PessoaDAO;
import Model.PessoaModel;



public class pessoateste {
     public static void main(String[] args){
      //PessoaModel(String nome, String cpf, String dataNascimento, String tipo, String treino, String horario) {

        PessoaModel t = new PessoaModel("c", "c","18/10/2000", "Gerente", "Supino", "8 da manhã");
        PessoaDAO pDAO = new PessoaDAO();
        pDAO.gravar(t);
       System.out.println(t);
        PessoaModel f = new PessoaModel("b", "b","10/10/2000","Nenhum", "Instrutor", "6 p.m");
        PessoaDAO pDAOf = new PessoaDAO();
        pDAOf.gravar(f);
       System.out.println(f);

//        PessoaDAO produtoRepository = new PessoaDAO();
//
//        PessoaModel produto = produtoRepository.buscarId(9);
//
//        System.out.println(produto.toString());


    }
   
}