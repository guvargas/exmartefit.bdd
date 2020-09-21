package Controller;
import Dao.MusicaDAO;
import Dao.PessoaMusicaDao;
import Model.MusicasModel;
import Model.PessoaMusicaModel;
import View.MusicaGerencialView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class MusicaGerencialControler {
    private MusicaGerencialView telaMusica= new MusicaGerencialView();
    MusicaDAO musicaRepositorio = new MusicaDAO();
    List<MusicasModel> musicas = musicaRepositorio.buscarTodos();
    PessoaMusicaDao pmdao = new PessoaMusicaDao();
    List<PessoaMusicaModel> listaAssos =pmdao.buscarTodos();
   
        public MusicaGerencialControler(){
        adicionarAcoesBotoes();
        System.out.println(listaAssos);
                System.out.println(musicas);

        
        
        
        telaMusica.setDadosTable(musicas, listaAssos);
        telaMusica.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        telaMusica.setTitle("ExMarteFit");
        exibirTela();
    }
    
     public void adicionarAcoesBotoes(){
        acaoRemoverMusica();
    }
     
     public void acaoRemoverMusica(){
         telaMusica.adicionarAcaoBotao(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try{
                if(telaMusica.getID().equals("")){
                    throw new CampoVazioExceptionControler();
                }
                
                MusicaDAO mdao=new MusicaDAO();
                
                mdao.remover(Integer.parseInt(telaMusica.getID()));
               
                
                }catch(CampoVazioExceptionControler c){
                }
            
            }
        }
        );
     }
     
     public void exibirTela(){
        telaMusica.setVisible(true);
    }
}
