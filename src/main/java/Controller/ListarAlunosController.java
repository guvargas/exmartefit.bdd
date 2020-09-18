
package Controller;

import Dao.PessoaDAO;
import Dao.TreinoDAO;
import Model.PessoaModel;
import Model.TreinoModel;
import View.TelaListarAlunosView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public final class ListarAlunosController {
    private TelaListarAlunosView listaralunos= new TelaListarAlunosView();
    PessoaDAO pessoaRepositorio = new PessoaDAO();
    List<PessoaModel> pessoas = pessoaRepositorio.buscarTodos();
    List<PessoaModel> encontradas = new ArrayList<>();
    
    public ListarAlunosController() {
        
        adicionarTreinos();
        
        for (PessoaModel p: pessoas ) {
            if("Aluno".equals(p.getTipo())){
                
                encontradas.add(p);
            }
        }
        if(encontradas!=null){
            listaralunos.setDadosTable(encontradas);
        }else{
            JOptionPane.showMessageDialog(null, "Nao há alunos cadastrados");
        }
        listaralunos.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        exibirTela();
        adicionarAcoesBotoes();
        
    }
    
    public void adicionarAcoesBotoes(){
        acaoVoltar();
        acaoAltTreino();
        acaoAltHorario();
    }
    
    public void acaoVoltar(){
        listaralunos.addAcaoBotaoVoltar(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                voltar();
            }
        }
        );
    }
    public void voltar(){
        listaralunos.setVisible(false);
        listaralunos.dispose();
    }
    
    
    public void acaoAltHorario(){
        listaralunos.adicionarAcaoAlterarHorario(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try{
                    if(listaralunos.IdAlterarHorario().equals("")){
                        throw new CampoVazioExceptionControler();
                    }
                    PessoaDAO pdao = new PessoaDAO();
                    for (PessoaModel p: encontradas ) {
                        String a= String.valueOf(p.getId());
                        if(listaralunos.IdAlterarHorario().equals(a)){
                            
                            String novoTudo= String.valueOf(listaralunos.getHora())
                                    +":"+String.valueOf(listaralunos.getMinutos());
                            pdao.atualizarHorario(p,novoTudo, listaralunos.IdAlterarHorario());
                            listaralunos.ExibirMensagem("Horário alterado com sucesso");
                            
                            voltar();
                        }
                    }
                    
                    
                    
                }catch(CampoVazioExceptionControler c){
                    
                }
                
            }
        }
        );
    }
    
    public void adicionarTreinos(){
        TreinoDAO tdao = new TreinoDAO();
        List<TreinoModel> listaTreino = tdao.buscarTodos();
        for(TreinoModel tm : listaTreino){
            listaralunos.adicionarTreinoComboBox(tm.getTitulo());
        }
    }
    
    public void acaoAltTreino(){
        listaralunos.adicionarAcaoBotaoAlterarTreino(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try{
                    if(listaralunos.getIdAlterarTreino().equals("") || listaralunos.getTituloDoTreino().equals("")){
                        throw new CampoVazioExceptionControler();
                    }
                    
                    System.out.println("lendo pessoas");
                    System.out.println(encontradas);
                    System.out.println(",,,,");
                    
                    System.out.println(pessoas);
                    PessoaDAO outroRepositorio = new PessoaDAO();
                    TreinoDAO treinosRepositorio = new TreinoDAO();
                    List<TreinoModel> treinos = treinosRepositorio.buscarTodos();
                    
                    for (PessoaModel p: pessoas ) {
                        
                        String a= String.valueOf(p.getId());
                        
                        if(listaralunos.getIdAlterarTreino().equals(a)){
                            
                            for (TreinoModel t: treinos ){
                                System.out.println("lendo treinos");
                                if(listaralunos.getTituloDoTreino().equals(t.getTitulo())){
                                    
                                    //String.valueOf(t.getID())
                                    outroRepositorio.atualizar(p,p.getId(),t.getTitulo());
                                    listaralunos.ExibirMensagem("Treino alterado com sucesso");
                                    
                                    voltar();
                                }
                            }
                        }
                    }
                }catch(CampoVazioExceptionControler c){
                    
                }
            }
        }
        );
    }
    
    public void exibirTela(){
        listaralunos.setVisible(true);
    }
    
}
