/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Dao.MusicaDAO;
import Dao.PessoaMusicaDao;
import Model.MusicasModel;
import Model.PessoaMusicaModel;
import java.util.List;

/**
 *
 * @author asg75
 */
public class assosPMTeste {
    public static void main(String[] args) {
        
        PessoaMusicaDao pmdao = new PessoaMusicaDao();
        
        List<PessoaMusicaModel> listaPessoa_Musica = pmdao.buscarTodos();
        
        for(PessoaMusicaModel pmm : listaPessoa_Musica){
            System.out.println("oi");
        }
    }
}
