

package dao;

import domain.Repositorio;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
/**
 *
 * @author Jussara Teixeira
 */
@Stateless
public class RepositorioDAO {

    @PersistenceContext
    private EntityManager entityManager; 

    public void salvar(Repositorio repositorio) {
        entityManager.persist(repositorio);
    }
    public void atualizar(Repositorio repositorio) {
        entityManager.merge(repositorio);
        entityManager.flush(); // Envia a atualização imediatamente ao banco
    }
}
