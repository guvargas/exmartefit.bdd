/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author guand
 */
public class desc {
      protected EntityManagerFactory emf;
    protected EntityManager em;
   public static void main(String[] args){
       System.out.println("Aa");
         }
    public desc() {
        emf = Persistence.createEntityManagerFactory("hibernatejpa");
        em = emf.createEntityManager();
                fecharConexao();

    }
      
    protected void fecharConexao() {
        em.close();
        emf.close();
    }
}
