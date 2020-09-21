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
public class RegistroAlunoController {
private final TelaRegistrarAlunoView tra = new TelaRegistrarAlunoView();

    public RegistroAlunoController() {
        acoesBotoes();
        adicionarItensComboBox();
        tra.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        tra.setTitle("ExMarteFit");
        exibirTela();
    }
    public void acoesBotoes(){
     adicionarAcaoBotao();
     
    adicionarAcaoBotaoVoltar();
    }
    public void adicionarAcaoBotao(){
    tra.adicionarAcaoBotao(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
           
            try{
            if(tra.getNome().equals("")|| tra.getCPF().equals("") || tra.getDataDeNascimento().equals("") || tra.getHorarioTreini().equals("")){
                throw new CampoVazioExceptionControler();
            }
             if(verificarCPF(tra.getCPF())==true){
                 JOptionPane.showMessageDialog(null, "CPF já registrado");
            }else{
            if(tra.getTreinoSelecionado() != null){
            PessoaModel pessoaModel = new PessoaModel(tra.getNome(), tra.getCPF(), tra.getDataDeNascimento(), "Aluno", tra.getTreinoSelecionado(), tra.getHorarioTreini());
            PessoaDAO pdao = new PessoaDAO();
            pdao.gravar(pessoaModel);  
            tra.setVisible(false);
            tra.dispose();
            }
            }
            }catch(CampoVazioExceptionControler c){
                
            }
        }
    });
    }
    
    public void adicionarItensComboBox(){
        TreinoDAO tdao = new TreinoDAO();
        List<TreinoModel> listaTreinos = tdao.buscarTodos();
        
        for(TreinoModel tModel : listaTreinos){
            tra.adiconarOpcaoTreino(tModel.getTitulo());
        }
    }
     public void adicionarAcaoBotaoVoltar(){
    tra.addAcaoBotaoVoltar(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
         voltar();
            
        }
    });
    } public void voltar(){
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
