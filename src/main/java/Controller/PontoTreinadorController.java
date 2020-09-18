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

/**
 *
 * @author asg75
 */
public class PontoTreinadorController {
    private final TelaPontoTreinadorView telaPonto = new TelaPontoTreinadorView();
    
    public PontoTreinadorController(String nomeDoInstrutor){
        PontoModel pm = new PontoModel(nomeDoInstrutor,getCurrentDate());
        adicionarAcaoBotaoBaterPonto(pm);
        adicionarHistoricoDePontosBatidos(nomeDoInstrutor);
        exibirTela();
    }
    
    public void adicionarAcaoBotaoBaterPonto(PontoModel pontoBatido){
        telaPonto.addAcaoBotaoBaterPonto(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                PontosDao pDaoRepository = new PontosDao();
                pDaoRepository.gravar(pontoBatido);
            }
        });
    }
    
    public String getCurrentDate(){
         DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
          LocalDateTime now = LocalDateTime.now();
          return dtf.format(now);  
    }
    
    public void adicionarHistoricoDePontosBatidos(String nomeInstrutor){
        StringBuffer sb = new StringBuffer();
        PontosDao pDaoRepository = new PontosDao();
        List<PontoModel> listaPontos = pDaoRepository.buscarTodos();
        for(PontoModel pm : listaPontos){
            if(pm.getNomeDoInstrutor().equals(nomeInstrutor)){
                sb.append(pm.getHorario()+"\n");
            }
        }
        telaPonto.setTextArea(sb.toString());
    }
    
    public void exibirTela(){
        telaPonto.setVisible(true);
    }
}
