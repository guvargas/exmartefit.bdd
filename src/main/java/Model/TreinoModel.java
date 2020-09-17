
package Model;

import javax.persistence.Entity;
import javax.persistence.Table;

import java.io.Serializable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


    
 @Entity
 @Table(name = "Treinos")
public class TreinoModel implements Serializable {
      private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
   
    protected String descricao;
    protected String titulo;
    public TreinoModel(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }
}
