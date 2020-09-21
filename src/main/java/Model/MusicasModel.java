
package Model;

import javax.persistence.Entity;
import javax.persistence.Table;

import java.io.Serializable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name = "tablemusica")
public class MusicasModel implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    private String nome;
    private String cantor;
    
    private static final long serialVersionUID = 299569408537971270L;
    
    public MusicasModel(){
    }
    public MusicasModel(String nome, String cantor) {
        this.nome = nome;
        this.cantor = cantor;
    }

      public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCantor() {
        return cantor;
    }
    
    @Override
    public String toString() {
        return "MusicasModel{" + "id=" + id + ", nome=" + nome + ", cantor=" + cantor + '}';
    }
    
}
