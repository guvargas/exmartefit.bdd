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

    public InicialTreinadorController(PessoaModel encontrada) {
        treinadorView.setNome(encontrada.getNome());
        exibirTela();
    }
    
    public void adicionarAcaoBotoes(){
        acaoVisualizarAlunos();
        acaoBaterPonto();
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
                PontoTreinadorController ptc = new PontoTreinadorController();
            }
        });
    }
    
    
    
    
    public void exibirTela(){
        treinadorView.setVisible(true);
    }
}
