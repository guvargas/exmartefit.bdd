
package Controller;

import Dao.PessoaDAO;
import Model.PessoaModel;
import View.TelaInicialAlunoView;
import View.TelaInicialGerenteView;
import View.TelaInicialInstrutorView;
import View.TelaListarFuncionariosView;
import View.TelaLoginView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import Controller.CampoVazioExceptionControler;


public class LoginController {
    
    private TelaLoginView loginView;
    
    PessoaDAO pessoaRepositorio = new PessoaDAO();
    List<PessoaModel> pessoas = pessoaRepositorio.buscarTodos();
    PessoaModel encontrada = null;
    
    public LoginController() {
        loginView= new TelaLoginView();
        adicionarAcoesBotoes();
    }
    
    public void exibirTela(){
        loginView.setVisible(true);
    }
    
    public void adicionarAcoesBotoes(){
        acaoEntrar();
    }
    
    
    public void acaoEntrar(){
        try{
            if(loginView.getLogin().equals("") || loginView.getSenha().equals("")){
                throw new CampoVazioExceptionControler();
            }
        loginView.addAcaoBotaoEntrar(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                logar(loginView.getLogin(),loginView.getSenha());
            }
            
        }
        );
        }catch (CampoVazioExceptionControler c){
        }
    }
    public void logar(String Login, String Senha){
        for (PessoaModel p: pessoas ) {
            System.out.println(p.toString());
            if(p.getCpf().equals(Senha) && p.getNome().equals(Login)){
                System.out.println("achoouu");
                
                encontrada= p;
            }
        }
        if(encontrada!=null){
            loginView.ExibirMensagem("Olá "+Login + ", seja bem vindo!");
            loginView.limparTxtFields();
            
            switch(encontrada.getTipo()) {
                case "Instrutor":
                    InicialTreinadorController t = new InicialTreinadorController(encontrada);
                    break;
                case "Gerente":
                      InicialGerenteController d= new InicialGerenteController(encontrada);
                    
                    break;
                case "Aluno":
                    InicialAlunoController n= new InicialAlunoController(encontrada);
                    
                    break;
                    
            }
            loginView.dispose();
        }else{
            
            loginView.ExibirMensagem("Confira o login e senha");
        }
        
        
        
        
    }
}
