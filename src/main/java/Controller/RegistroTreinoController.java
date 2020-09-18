
package Controller;

import Dao.TreinoDAO;
import Model.TreinoModel;
import View.TelaAdicionarTreinoView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class RegistroTreinoController {
    private  TelaAdicionarTreinoView telaAdcTreino;
    
    public RegistroTreinoController() {
        telaAdcTreino= new TelaAdicionarTreinoView();
        
        adicionarAcoesBotoes();
        exibirTela();
    }
    
    public void adicionarAcoesBotoes(){
        acaoSalvar();
        acaoVoltar();
    }
    
    
    public void exibirTela(){
        telaAdcTreino.setVisible(true);
    }
    
    
    
    
    public void acaoSalvar(){
        telaAdcTreino.addAcaoBotaoSalvar(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                 TreinoModel t = new TreinoModel(telaAdcTreino.getTituloTreino(),telaAdcTreino.getDescricaoTreino());
                TreinoDAO treinoDAO = new TreinoDAO();
                treinoDAO.gravar(t);
                
            }
            
        }
        );
    }
    public void acaoVoltar(){
        telaAdcTreino.addAcaoBotaoSalvar(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                telaAdcTreino.setVisible(false);
                                telaAdcTreino.dispose();
                
            }
            
        }
        );
    }
   
        
        
        
        
    
    
}
