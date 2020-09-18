
package Controller;

import Dao.TreinoDAO;
import Model.TreinoModel;
import View.TelaAdicionarTreinoView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Controller.CampoVazioExceptionControler;
import Dao.PessoaDAO;
import Model.PessoaModel;
import java.util.List;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;


public class RegistroTreinoController {
    private  TelaAdicionarTreinoView telaAdcTreino;
    
    public RegistroTreinoController() {
        telaAdcTreino= new TelaAdicionarTreinoView();
        
       
        telaAdcTreino.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        telaAdcTreino.setTitle("ExMarteFit");
         adicionarAcoesBotoes();
      adicionarTreinos();
         exibirTela();
      
    }
    
     public void adicionarTreinos(){
        TreinoDAO tdao = new TreinoDAO();
        List<TreinoModel> listaTreino = tdao.buscarTodos();
        for(TreinoModel tm : listaTreino){
            telaAdcTreino.adicionarTreinoComboBox(tm.getTitulo());
        }
    }
    
    public void adicionarAcoesBotoes(){
        acaoSalvar();
        acaoVoltar();
        acaoExcluir();
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
    
     public void acaoExcluir(){
        telaAdcTreino.addAcaoBotaoExcluir(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
             
                    
                    TreinoDAO treinoDAO = new TreinoDAO();
                    
                    List<TreinoModel> listaModelo = treinoDAO.buscarTodos();
                    TreinoModel tm = null;
                    
                    for(TreinoModel treino : listaModelo){
                        if(treino.getTitulo().equals(telaAdcTreino.getTituloDoTreino())){
                            tm = treino;
                        }
                    }
                    
                    treinoDAO.remover(tm.getID());
                    voltar();
                    
              
                
            }
            
        }
        );
    }
       public void voltar(){
        telaAdcTreino.setVisible(false);
        telaAdcTreino.dispose();
    }
    
    public void acaoVoltar(){
        telaAdcTreino.addAcaoBotaoVoltar(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
           voltar();
                
            }
            
        }
        );
    }
   
        
        
        
        
    
    
}
