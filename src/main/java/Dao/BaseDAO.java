
package Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public abstract class BaseDAO {

    protected EntityManagerFactory emf;
    protected EntityManager em;

    public BaseDAO() {
        emf = Persistence.createEntityManagerFactory("hibernatejpa");
        em = emf.createEntityManager();
    }

    protected void fecharConexao() {
        em.close();
        emf.close();
    }
}
