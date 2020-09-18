
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

public final class ListarAlunosController {
    private TelaListarAlunosView listaralunos= new TelaListarAlunosView();
    PessoaDAO pessoaRepositorio = new PessoaDAO();
    List<PessoaModel> pessoas = pessoaRepositorio.buscarTodos();
    List<PessoaModel> encontradas = new ArrayList<>();
    
    public ListarAlunosController() {
        
        
        
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
                listaralunos.dispose();
                
            }
        }
        );
    }
    
    public void acaoAltHorario(){
        listaralunos.adicionarAcaoAlterarHorario(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try{
                    if(listaralunos.getIdAlterarTreino().equals("")){
                        throw new CampoVazioExceptionControler();
                    }
                    
                }catch(CampoVazioExceptionControler c){
                    
                }
                
            }
        }
        );
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
                                
                                
                                outroRepositorio.atualizar(p,p.getId(),String.valueOf(t.getID()));
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
