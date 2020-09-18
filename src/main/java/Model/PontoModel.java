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
 * @author asg75
 */
@Entity
@Table(name = "TabelaPonto")
public class PontoModel implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id; 
    private String nomeDoInstrutor;
    private String Horario;
    private int idDoInstrutor;
    

    public int getIdDoInstrutor() {
        return idDoInstrutor;
    }
    
    public int getId(){
        return id;
    }
    
    public PontoModel() {
    }

    public PontoModel(String nomeDoInstrutor, String Horario, int idDoInstrutor) {
        this.nomeDoInstrutor = nomeDoInstrutor;
        this.Horario = Horario;
        this.idDoInstrutor = idDoInstrutor;
    }

    public String getNomeDoInstrutor() {
        return nomeDoInstrutor;
    }

    public void setNomeDoInstrutor(String nomeDoInstrutor) {
        this.nomeDoInstrutor = nomeDoInstrutor;
    }

    public String getHorario() {
        return Horario;
    }

    public void setHorario(String Horario) {
        this.Horario = Horario;
    }

    @Override
    public String toString() {
        return "PontoModel{" + "id=" + id + ", nomeDoInstrutor=" + nomeDoInstrutor + ", Horario=" + Horario + '}';
    }
    
    
}
