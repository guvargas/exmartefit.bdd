
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
        TreinoModel treino = treinoRepository.buscarId(Integer.parseInt(encontrada.getTreino()));
        alunoView.SetTreino(encontrada.getNome(),treino.getTitulo(), treino.getDescricao());
        adicionarAcoesBotoes();
        exibirTela();
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
