/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "tablemusica")
public class MusicasModel implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nome;
    String cantor;
    
    private static final long serialVersionUID = -299569408537971270L;

    public MusicasModel(String nome, String cantor) {
        this.nome = nome;
        this.cantor = cantor;
    }

    public void setId(int id) {
        this.id = id;
    }
      public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String Cantor) {
        this.cantor = cantor;
    }
    
    @Override
    public String toString() {
        return "PessoaModel{" + "id=" + id + ", nome=" + nome + ", cantor=" + cantor + '}';
    }
    
}
