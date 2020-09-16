
package Main;

import Dao.PessoaDAO;
import Model.PessoaModel;


public class pessoateste {
     public static void main(String[] args){
    //   public AlunoModel(String nome, String cpf, String dataNascimento) {
        PessoaModel t = new PessoaModel("Gustavo", "1223","18/10/2000");
        PessoaDAO pDAO = new PessoaDAO();
        pDAO.gravar(t);
       System.out.println(t);
    }
}