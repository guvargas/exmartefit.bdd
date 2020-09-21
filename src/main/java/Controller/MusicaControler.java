package Controller;
import Dao.MusicaDAO;
import Dao.PessoaMusicaDao;
import Model.MusicasModel;
import Model.PessoaModel;
import Model.PessoaMusicaModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import View.TelaMusicaView;

public class MusicaControler {
    
    private TelaMusicaView telaMusica= new TelaMusicaView();
    MusicaDAO musicaRepositorio = new MusicaDAO();
    List<MusicasModel> musicas = musicaRepositorio.buscarTodos();
    PessoaModel usuario;
    
    public MusicaControler(PessoaModel encontrada) {
        
        adicionarAcoesBotoes();
        telaMusica.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        telaMusica.setTitle("ExMarteFit");
        usuario = encontrada;
        exibirTela();
        
    }
    
     public void adicionarAcoesBotoes(){
        acaoAdicionarMusica();
    }
    
      public void acaoAdicionarMusica(){
        telaMusica.adicionarAcaoBotao(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try{
                if(telaMusica.getMusica().equals("") || telaMusica.getCantor().equals("")){
                    throw new CampoVazioExceptionControler();
                }
                
                MusicasModel nMusica = new MusicasModel(telaMusica.getMusica(), telaMusica.getCantor());
                MusicaDAO mdao=new MusicaDAO();
                mdao.gravar(nMusica);
                
                
                MusicaDAO musicaBdd = new MusicaDAO();
                List<MusicasModel> listaMusicas = musicaBdd.buscarTodos();
                
              
                
                for(MusicasModel lm : listaMusicas){
                    if(lm.getCantor().equals(telaMusica.getCantor())  &&   lm.getNome().equals(telaMusica.getMusica())){
                        PessoaMusicaModel pmm = new PessoaMusicaModel(usuario.getId(), lm.getId());
                        PessoaMusicaDao pmDao = new PessoaMusicaDao();
                        pmDao.gravar(pmm);
                    }
                }
                
                telaMusica.setVisible(false);
                telaMusica.dispose();
                
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
