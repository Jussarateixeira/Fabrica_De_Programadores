package dao;

import domain.GitHub;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
/**
 *
 * @author Jussara Teixeira
 */
@Stateless
public class GitHubDAO {

    @PersistenceContext
    private EntityManager entityManager; 

   
    public void salvar(GitHub gitHub) {
        entityManager.persist(gitHub);
    }

   
    public void atualizar(GitHub gitHub) {
        entityManager.merge(gitHub);
        entityManager.flush(); // Garante que a atualização seja enviada imediatamente ao banco
    }
}
