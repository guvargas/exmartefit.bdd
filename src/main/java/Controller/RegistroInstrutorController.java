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

/**
 *
 * @author asg75
 */
public class RegistroInstrutorController {
    TelaRegistrarInstrutorView tri = new TelaRegistrarInstrutorView();

    public RegistroInstrutorController() {
        adicionarAcaoBotao();
        exibirTela();
    }
    
   public void adicionarAcaoBotao(){
       tri.adicionarAcaoBotao(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
          
            PessoaModel pessoaModel = new PessoaModel(tri.getNome(), tri.getCPF(), tri.getDataDeNascimento(), "Instrutor", null,tri.getHorarioTrabalho());
            PessoaDAO pdao = new PessoaDAO();
            pdao.gravar(pessoaModel);  
            
           }
       } );
   } 
    
   
   
   public void exibirTela(){
       tri.setVisible(true);
   }
}
