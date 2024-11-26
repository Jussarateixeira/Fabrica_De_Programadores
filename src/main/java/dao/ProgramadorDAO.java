package dao;

import domain.Programador;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

/**
 *
 * @author Jussara Teixeira
 */

@Stateless
public class ProgramadorDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public void salvar(Programador programador) {
        entityManager.persist(programador);
    }
}
