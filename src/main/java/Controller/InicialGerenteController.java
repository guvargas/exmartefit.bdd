
package Controller;

import Model.PessoaModel;
import View.TelaInicialGerenteView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;


public class InicialGerenteController {
    private final TelaInicialGerenteView gerenteView= new TelaInicialGerenteView();
    
    
    
    
    
    InicialGerenteController(PessoaModel encontrada) {
        gerenteView.setNomeGerente(encontrada.getNome());
        
        
        exibirTela();
        adicionarAcoesBotoes(encontrada);
        
    }
    
    
    public void exibirTela(){
        gerenteView.setVisible(true);
    }
    
    
    
    public void adicionarAcoesBotoes(PessoaModel pes){
        acaoVoltar();
        acaoRegistrar();
        acaoAlterarSenha(pes);
        acaoListarAlunos();
        acaoListarInstrutores();
    }
    
    
    
    public void acaoVoltar(){
        gerenteView.addAcaoBotaoVoltar(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                gerenteView.dispose();
                LoginController n= new LoginController();
                n.exibirTela();
            }
        }
        );
    }
    public void acaoAlterarSenha(PessoaModel pes){
        gerenteView.addAcaoBotaoAlterarSenha(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AlterarSenhaController asc = new AlterarSenhaController(pes);
                
            }
        }
        );
    }
    public void acaoListarAlunos(){
        gerenteView.addAcaoBotaoListarAlunos(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ListarAlunosController b=new ListarAlunosController();
            }
        }
        );
    }
    public void acaoListarInstrutores(){
        gerenteView.addAcaoBotaoListarFuncionarios(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ListarFuncionariosController a= new ListarFuncionariosController();
            }
        }
        );
    }
    public void acaoRegistrar(){
        gerenteView.addAcaoBotaoRegistrar(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                switch (gerenteView.getTipoPessoa()){
                    
                    case "Aluno":
                        RegistroAlunoController rac = new RegistroAlunoController();
                    break;
                    
                    case "Instrutor":
                        RegistroInstrutorController ric = new RegistroInstrutorController();
                    break;
                    
                    case "Gerente":
                        // colocar aqui o teu
                    break;
                }
                
            }
        }
        );
    }
    
}
