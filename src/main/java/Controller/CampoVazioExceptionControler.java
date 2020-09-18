package Controller;

import javax.swing.JOptionPane;

public class CampoVazioExceptionControler extends Exception{
    public CampoVazioExceptionControler(){
        super("Erro: há um ou mais campos que não foram preenchidos");
        JOptionPane.showMessageDialog(null, "Erro: há um ou mais campos que não foram preenchidos");
    }
}
