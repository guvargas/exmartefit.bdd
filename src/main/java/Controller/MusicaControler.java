package Controller;
import Dao.MusicaDAO;
import Model.MusicasModel;
import Model.PessoaModel;
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
                
                MusicasModel nMusica = new MusicasModel(telaMusica.getMusica(), telaMusica.getCantor(), usuario.getId(), usuario.getNome());
                MusicaDAO mdao=new MusicaDAO();
                mdao.gravar(nMusica);
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
