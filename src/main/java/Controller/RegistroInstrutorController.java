/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Dao.PessoaDAO;
import Model.PessoaModel;
import View.TelaRegistrarInstrutorView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author asg75
 */
public class RegistroInstrutorController {
    TelaRegistrarInstrutorView tri = new TelaRegistrarInstrutorView();

    public RegistroInstrutorController() {
        adicionarAcaoBotao();
        tri.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        exibirTela();
    }
    
    
   public void adicionarAcaoBotao(){
       tri.adicionarAcaoBotao(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
          
            PessoaModel pessoaModel = new PessoaModel(tri.getNome(), tri.getCPF(), tri.getDataDeNascimento(), "Instrutor", null,tri.getHorarioTrabalho());
            PessoaDAO pdao = new PessoaDAO();
            pdao.gravar(pessoaModel);  
            tri.setVisible(false);
            tri.dispose();
           }
       } );
   } 
    
   
   
   public void exibirTela(){
       tri.setVisible(true);
   }
}
