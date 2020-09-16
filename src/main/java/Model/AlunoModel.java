
package Model;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name = "Aluno")
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
