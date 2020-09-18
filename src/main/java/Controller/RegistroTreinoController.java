
package Controller;

import Dao.TreinoDAO;
import Model.TreinoModel;
import View.TelaAdicionarTreinoView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Controller.CampoVazioExceptionControler;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;


public class RegistroTreinoController {
    private  TelaAdicionarTreinoView telaAdcTreino;
    
    public RegistroTreinoController() {
        telaAdcTreino= new TelaAdicionarTreinoView();
        
        adicionarAcoesBotoes();
        telaAdcTreino.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        telaAdcTreino.setTitle("ExMarteFit");
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
                try{
                    if(telaAdcTreino.getTituloTreino().equals("") || telaAdcTreino.getDescricaoTreino().equals("")){
                        throw new CampoVazioExceptionControler();
                    }
                    TreinoModel t = new TreinoModel(telaAdcTreino.getTituloTreino(),telaAdcTreino.getDescricaoTreino());
                    TreinoDAO treinoDAO = new TreinoDAO();
                    treinoDAO.gravar(t);
                }catch(CampoVazioExceptionControler c){
                }
                
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
