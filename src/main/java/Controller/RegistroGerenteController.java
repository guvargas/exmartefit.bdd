/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Dao.PessoaDAO;
import Dao.TreinoDAO;
import Model.PessoaModel;
import Model.TreinoModel;
import View.TelaRegistrarAlunoView;
import View.TelaRegistrarGerenteView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author asg75
 */
public class RegistroGerenteController {
private final TelaRegistrarGerenteView tra = new TelaRegistrarGerenteView();

    public RegistroGerenteController() {
        adicionarAcaoBotaoSalvar();
                adicionarAcaoBotaoVoltar();
                tra.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        exibirTela();
    }
    
    public void adicionarAcaoBotaoSalvar(){
    tra.adicionarAcaoBotao(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            PessoaModel pessoaModel = new PessoaModel(tra.getNome(), tra.getCPF(), tra.getDataDeNascimento(), "Gerente", "-", "-");
            PessoaDAO pdao = new PessoaDAO();
            pdao.gravar(pessoaModel);  
            voltar();
        }
    });
    }
     public void adicionarAcaoBotaoVoltar(){
    tra.addAcaoBotaoVoltar(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
         voltar();
            
        }
    });
    }
     
    public void voltar(){
   tra.setVisible(false);
   tra.dispose();
    }
 
    public void exibirTela(){
        tra.setVisible(true);
    }
}
