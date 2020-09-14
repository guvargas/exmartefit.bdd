/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Calendar;

/**
 *
 * @author asg75
 */
public class AlunoModel extends PessoaModel {
    private Calendar horarioDeTreino= Calendar.getInstance();
    private TreinoModel treino;
    
    public AlunoModel(String nome, String cpf, String dataNascimento) {
        super(nome, cpf, dataNascimento);
    }

    public Calendar getHorarioDeTreino() {
        return horarioDeTreino;
    }

    public void setHorarioDeTreino(Calendar horarioDeTreino) {
        this.horarioDeTreino = horarioDeTreino;
    }

    public TreinoModel getTreino() {
        return treino;
    }

    public void setTreino(TreinoModel treino) {
        this.treino = treino;
    }
    
}
