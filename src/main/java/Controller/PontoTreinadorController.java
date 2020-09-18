/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Dao.PontosDao;
import Model.PontoModel;
import View.TelaPontoTreinadorView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author asg75
 */
public class PontoTreinadorController {
    private final TelaPontoTreinadorView telaPonto = new TelaPontoTreinadorView();
    
    public PontoTreinadorController(String nomeDoInstrutor, int idDoInstrutor){
        telaPonto.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        PontoModel pm = new PontoModel(nomeDoInstrutor,getCurrentDate(),idDoInstrutor);
        adicionarAcaoBotaoBaterPonto(pm);
        adicionarHistoricoDePontosBatidos(idDoInstrutor);
        telaPonto.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        exibirTela();
    }
    
    public void adicionarAcaoBotaoBaterPonto(PontoModel pontoBatido){
        telaPonto.addAcaoBotaoBaterPonto(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                PontosDao pDaoRepository = new PontosDao();
                pDaoRepository.gravar(pontoBatido);
                telaPonto.setVisible(false);
                telaPonto.dispose();
            }
        });
        
      
    }
    
    public String getCurrentDate(){
         DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
          LocalDateTime now = LocalDateTime.now();
          return dtf.format(now);  
    }
    
    public void adicionarHistoricoDePontosBatidos(int idInstrutor){
        StringBuffer sb = new StringBuffer();
        PontosDao pDaoRepository = new PontosDao();
        List<PontoModel> listaPontos = pDaoRepository.buscarTodos();
        
        for(PontoModel pm : listaPontos){
            if(pm.getIdDoInstrutor()==idInstrutor){
                 
                sb.append(pm.getHorario()+"\n");
            }
        }
        telaPonto.setTextArea(sb.toString());
    }
    
    public void exibirTela(){
        telaPonto.setVisible(true);
    }
}
