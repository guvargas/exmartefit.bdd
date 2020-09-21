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
import Controller.CampoVazioExceptionControler;
import javax.swing.JOptionPane;
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
                tra.setTitle("ExMarteFit");
        exibirTela();
    }
    
    public void adicionarAcaoBotaoSalvar(){
    tra.adicionarAcaoBotao(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            try{
                if(tra.getNome().equals("") || tra.getCPF().equals("") || tra.getDataDeNascimento().equals("")){
                    throw new CampoVazioExceptionControler();
                }if(verificarCPF(tra.getCPF())==true){
                 JOptionPane.showMessageDialog(null, "CPF já registrado");
            }else{
                PessoaModel pessoaModel = new PessoaModel(tra.getNome(), tra.getCPF(), tra.getDataDeNascimento(), "Gerente", "-", "-");
                PessoaDAO pdao = new PessoaDAO();
                pdao.gravar(pessoaModel);  
                voltar();
                }
            }catch(CampoVazioExceptionControler c){
                
            }
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
