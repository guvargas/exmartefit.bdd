/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Dao.PontosDao;
import Model.PontoModel;

/**
 *
 * @author asg75
 */
public class PontoTest {
    public static void main(String[] args) {
        PontoModel ponto = new  PontoModel("Roberto", "5 da tarde", 15);
        PontosDao pontoDao = new PontosDao();
        pontoDao.gravar(ponto);
        System.out.print(ponto);
    }
}
