/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Dao.Pessoa_MusicaDao;
import Model.Pessoa_MusicaModel;

/**
 *
 * @author asg75
 */
public class assosPMTeste {
    public static void main(String[] args) {
        Pessoa_MusicaDao pmd = new Pessoa_MusicaDao();
        
        Pessoa_MusicaModel pmm = new Pessoa_MusicaModel(1, 1);
        
        pmd.gravar(pmm);
    }
}
