
package Model;

import java.util.ArrayList;
import java.util.Calendar;
import javax.persistence.Entity;

@Entity
public class InstrutorModel extends PessoaModel {
    private Calendar[] horariosDeTrabalho = new Calendar[7];
    private ArrayList<Calendar> pontosBatidos = new ArrayList<>();
    
    public InstrutorModel(String nome, String cpf, String dataNascimento, Calendar[] horariosDeTrabalho) {
        super(nome, cpf, dataNascimento);
        this.horariosDeTrabalho = horariosDeTrabalho;
    }

    public Calendar[] getHorariosDeTrabalho() {
        return horariosDeTrabalho;
    }

    public void setHorariosDeTrabalho(Calendar[] horariosDeTrabalho) {
        this.horariosDeTrabalho = horariosDeTrabalho;
    }

    public ArrayList<Calendar> getPontosBatidos() {
        return pontosBatidos;
    }

    public void setPontosBatidos(ArrayList<Calendar> pontosBatidos) {
        this.pontosBatidos = pontosBatidos;
    }
}
