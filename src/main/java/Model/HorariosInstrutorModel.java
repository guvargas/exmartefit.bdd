
package Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "InstrutorHorarios")
public class HorariosInstrutorModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
private int id;
private String seg;
private String ter;
private String qua;
private String qui;
private String sex;
private String sab;
private String dom;
private String PontoBatido;
private String funcionario;
    public HorariosInstrutorModel(String func,String seg, String ter, String qua, String qui, String sex, String sab, String dom, String PontoBatido) {
        this.seg = seg;
        this.ter = ter;
        this.qua = qua;
        this.qui = qui;
        this.sex = sex;
        this.sab = sab;
        this.dom = dom;
        this.PontoBatido = PontoBatido;
        this.funcionario= func;
    }

    public String getSeg() {
        return seg;
    }

    public void setSeg(String seg) {
        this.seg = seg;
    }


    
    
    
}
