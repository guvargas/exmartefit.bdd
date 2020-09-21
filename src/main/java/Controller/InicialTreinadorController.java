/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.PessoaModel;
import View.TelaInicialInstrutorView;
import View.TelaListarAlunosView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author asg75
 */
public class InicialTreinadorController {
    private final TelaInicialInstrutorView treinadorView= new TelaInicialInstrutorView();
    private String nomeTreinador;
    private Integer idTreinador;
    
    public InicialTreinadorController(PessoaModel encontrada) {
        
        treinadorView.setNome(encontrada.getNome());
        nomeTreinador = encontrada.getNome();
        idTreinador = encontrada.getId();
        adicionarAcaoBotoes();
        treinadorView.setTitle("ExMarteFit");
        exibirTela();
    }
    
    public void adicionarAcaoBotoes(){
        acaoVisualizarAlunos();
        acaoBaterPonto();
        acaoRegistrarTreinos();
        acaoRegistrarAlunos();
        acaoVoltar();
        acaoPlaylist();
    }
           
    public void acaoRegistrarAlunos(){
        treinadorView.adicionarAcaoBotaoRegistrarAluno(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RegistroAlunoController rgaluno = new RegistroAlunoController();
            }
        });
    } 
     public void acaoVoltar(){
        treinadorView.addAcaoBotaoVoltar(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                treinadorView.dispose();
                LoginController n= new LoginController();
                n.exibirTela();
            }
        }
        );
    }
    public void acaoRegistrarTreinos(){
        treinadorView.adicionarAcaoBotaoRegistrarTreino(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RegistroTreinoController rgtreino = new RegistroTreinoController();
            }
        });
    }
    public void acaoVisualizarAlunos(){
        treinadorView.adicionarAcaoBotaoAlunos(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ListarAlunosController tla = new ListarAlunosController();
            }
        });
    }
 
    public void acaoBaterPonto(){
        treinadorView.adicionarAcaoBotaoPonto(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PontoTreinadorController ptc = new PontoTreinadorController(nomeTreinador, idTreinador);
                
            }
        });
    }
    
    public void acaoPlaylist(){
        treinadorView.addAcaoBotaoGerenciarPlaylist(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MusicaGerencialControler a= new MusicaGerencialControler();
            }
        }
        );
    }
    
    
    public void exibirTela(){
        treinadorView.setVisible(true);
    }
}
