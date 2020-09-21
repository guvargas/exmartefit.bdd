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
import Controller.CampoVazioExceptionControler;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author asg75
 */
public class RegistroInstrutorController {
    TelaRegistrarInstrutorView tri = new TelaRegistrarInstrutorView();

    public RegistroInstrutorController() {
       
        acoesBotoes();
        tri.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        tri.setTitle("ExMarteFit");
        exibirTela();
    }
    
    public void acoesBotoes(){
     adicionarAcaoBotao();
     
    adicionarAcaoBotaoVoltar();
    }
   public void adicionarAcaoBotao(){
       tri.adicionarAcaoBotao(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               try{
                if(tri.getNome().equals("")  || tri.getCPF().equals("") || tri.getDataDeNascimento().equals("") || tri.getHorarioTrabalho().equals("")){
                    throw new CampoVazioExceptionControler();
                }if(verificarCPF(tri.getCPF())==true){
                 JOptionPane.showMessageDialog(null, "CPF já registrado");
            }else{
            PessoaModel pessoaModel = new PessoaModel(tri.getNome(), tri.getCPF(), tri.getDataDeNascimento(), "Instrutor", null,tri.getHorarioTrabalho());
            PessoaDAO pdao = new PessoaDAO();
            pdao.gravar(pessoaModel);  
           voltar();
                }
            }catch(CampoVazioExceptionControler c){
            }
           }
       } );
   } 
     public void adicionarAcaoBotaoVoltar(){
    tri.addAcaoBotaoVoltar(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
         voltar();
            
        }
    });
    }
     
    public void voltar(){
   tri.setVisible(false);
   tri.dispose();
    }
   
   
   public void exibirTela(){
       tri.setVisible(true);
   }
   
   public boolean verificarCPF(String cpf){
        PessoaDAO pdao = new PessoaDAO();
        List<PessoaModel> listaPessoa = pdao.buscarTodos();
        
        for(PessoaModel pessoa : listaPessoa){
            if(pessoa.getCpf().equals(cpf)){
                return true;
            }
        }
        return false;
    }
}
