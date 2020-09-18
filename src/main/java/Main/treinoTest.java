package Main;

import Dao.TreinoDAO;
import Model.TreinoModel;


public class treinoTest {
      public static void main(String[] args){
          //titulo e descricao
        TreinoModel t = new TreinoModel("Supino", "Malhe bastante");
        TreinoDAO treinoDAO = new TreinoDAO();
        treinoDAO.gravar(t);
        System.out.println(t);
    }
}
