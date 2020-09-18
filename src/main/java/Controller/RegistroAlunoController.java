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
/**
 *
 * @author asg75
 */
public class RegistroAlunoController {
private final TelaRegistrarAlunoView tra = new TelaRegistrarAlunoView();

    public RegistroAlunoController() {
        adicionarAcaoBotao();
        adicionarItensComboBox();
        tra.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        exibirTela();
    }
    
    public void adicionarAcaoBotao(){
    tra.adicionarAcaoBotao(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            try{
            if(tra.getNome().equals("")|| tra.getCPF().equals("") || tra.getDataDeNascimento().equals("") || tra.getHorarioTreini().equals("")){
                throw new CampoVazioExceptionControler();
            }
            if(tra.getTreinoSelecionado() != null){
            PessoaModel pessoaModel = new PessoaModel(tra.getNome(), tra.getCPF(), tra.getDataDeNascimento(), "Aluno", tra.getTreinoSelecionado(), tra.getHorarioTreini());
            PessoaDAO pdao = new PessoaDAO();
            pdao.gravar(pessoaModel);  
            tra.setVisible(false);
            tra.dispose();
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
    
    public void exibirTela(){
        tra.setVisible(true);
    }
}
