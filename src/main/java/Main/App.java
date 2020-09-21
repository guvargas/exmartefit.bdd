
package Main;

import Controller.LoginController;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;


public class App {
    public static void main(String[] args){
    
        LoginController n= new LoginController();        
        n.exibirTela(); 
        
        /*
    public static void main(String[] args) {
        
        PessoaMusicaDao pmdao = new PessoaMusicaDao();
        
        List<PessoaMusicaModel> listaPessoa_Musica = pmdao.buscarTodos();
        
        for(PessoaMusicaModel pmm : listaPessoa_Musica){
            System.out.println("oi");
        }
        
          PontoModel ponto = new  PontoModel("Roberto", "5 da tarde", 15);
        PontosDao pontoDao = new PontosDao();
        pontoDao.gravar(ponto);
        System.out.print(ponto);
        
           TreinoModel t = new TreinoModel("Supino", "Malhe bastante");
        TreinoDAO treinoDAO = new TreinoDAO();
        treinoDAO.gravar(t);
        System.out.println(t);
*/
    }
}