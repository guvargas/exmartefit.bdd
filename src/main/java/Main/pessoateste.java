
package Main;

import Dao.PessoaDAO;
import Model.PessoaModel;



public class pessoateste {
     public static void main(String[] args){
        PessoaModel t = new PessoaModel("b", "b","ontem", "Instrutor", "Supino", "8 da manhã");
        PessoaDAO pDAO = new PessoaDAO();
        pDAO.gravar(t);
       System.out.println(t);
//        PessoaModel f = new PessoaModel("Jose", "00","hoje", "nada", "32");
//        PessoaDAO pDAOf = new PessoaDAO();
//        pDAOf.gravar(f);
//       System.out.println(f);

//        PessoaDAO produtoRepository = new PessoaDAO();
//
//        PessoaModel produto = produtoRepository.buscarId(9);
//
//        System.out.println(produto.toString());
//

    }
   
}