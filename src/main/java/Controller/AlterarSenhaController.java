/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Dao.PessoaDAO;
import Model.PessoaModel;
import View.TelaAlterarSenha;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

/**
 *
 * @author asg75
 */
public class AlterarSenhaController {
    private final TelaAlterarSenha tas = new TelaAlterarSenha();

    public AlterarSenhaController(PessoaModel pes) {
        adicionarAcaoBotao(pes);
        exibirTela();
    }
    
    public void exibirTela(){
        tas.setVisible(true);
    }
    
    public void adicionarAcaoBotao(PessoaModel pes){
        tas.adicionarAcaoBotao(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PessoaDAO pdao = new PessoaDAO();
       

                pdao.atualizarSenha(pes, pes.getId(), tas.getSenha());
            }
        });
    }
}
