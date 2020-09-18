
package Controller;

import Dao.TreinoDAO;
import Model.PessoaModel;
import Model.TreinoModel;
import View.TelaInicialAlunoView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;


public final class InicialAlunoController {
    
    
    private final TelaInicialAlunoView alunoView= new TelaInicialAlunoView();
    
    
    
    InicialAlunoController(PessoaModel encontrada) {
        TreinoDAO treinoRepository = new TreinoDAO();
        TreinoModel treino = buscarTreino(treinoRepository, encontrada.getTreino());//treinoRepository.buscarId(Integer.parseInt(encontrada.getTreino()));
        alunoView.SetTreino(encontrada.getNome(),treino.getTitulo(), treino.getDescricao());
        adicionarAcoesBotoes();
        alunoView.setTitle("ExMarteFit");
        exibirTela();
    }
    
    public TreinoModel buscarTreino(TreinoDAO treinoRepository, String treino){
        List<TreinoModel> listaTreinos = treinoRepository.buscarTodos();
        for(TreinoModel t: listaTreinos){
            if(t.getTitulo().equals(treino)){
            return t;
            }
        }
        alunoView.ExibirMensagem("O treino Registrado nesse aluno não existe, como assim? pane no sistema");
        return null;
    }
    
    public void exibirTela(){
        alunoView.setVisible(true);
    }
    
    public void adicionarAcoesBotoes(){
        acaoVoltar();
    }
    
    public void acaoVoltar(){
        alunoView.addAcaoBotaoVoltar(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                alunoView.dispose();
                LoginController n= new LoginController();
                n.exibirTela();
            }
        }
        );
    }
    
    
    
    
    
    
    
    
}
