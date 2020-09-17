
package Controller;

import Dao.PessoaDAO;
import Model.PessoaModel;
import View.TelaListarFuncionariosView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;


public final class ListarFuncionariosController {
    
    
    private TelaListarFuncionariosView listarFuncionarios= new TelaListarFuncionariosView();
    PessoaDAO pessoaRepositorio = new PessoaDAO();
    List<PessoaModel> pessoas = pessoaRepositorio.buscarTodos();
    List<PessoaModel> encontradas = new ArrayList<>();
    
    
    public ListarFuncionariosController() {
        
        
        for (PessoaModel p: pessoas ) {
            if("Instrutor".equals(p.getTipo())){
                
                encontradas.add(p);
            }
        }
        if(encontradas!=null){
            listarFuncionarios.setDadosTable(encontradas);
        }else{
            JOptionPane.showMessageDialog(null, "Nao há instrutores cadastrados");
        }
        exibirTela();
        
        
    }
    
     public void adicionarAcoesBotoes(){
        acaoVoltar();
      
    }
    
     public void acaoVoltar(){
        listarFuncionarios.addAcaoBotaoVoltar(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listarFuncionarios.dispose();
            
            }
        }
        );
    }
      public void acaoVisualizarPontos(){
        listarFuncionarios.addAcaoBotaoVizualisarPontos(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
            
            }
        }
        );
    }
    public void exibirTela(){
        listarFuncionarios.setVisible(true);
    }
    
}
