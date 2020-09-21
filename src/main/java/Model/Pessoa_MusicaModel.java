/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author asg75
 */
@Entity
@Table(name = "Pessoa_Musica")
public class Pessoa_MusicaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    private int idPessoa;
    private int idMusica;
    
    public Pessoa_MusicaModel(int idPessoa, int idMusica) {
        this.idPessoa = idPessoa;
        this.idMusica = idMusica;
    }

    public int getId() {
        return id;
    }

    public int getIdPessoa() {
        return idPessoa;
    }

    public int getIdMusica() {
        return idMusica;
    }
    
    
    
    
}
