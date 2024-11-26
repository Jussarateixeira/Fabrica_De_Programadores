package domain;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;
/**
 *
 * @author Jussara Teixeira
 */

@Entity
public class GitHub implements Serializable {
    
    @Id
    @SequenceGenerator(sequenceName = "seq_github", name = "seq_github", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_github")
    private Long id;

    @Column
    private int estrela;

    // Relacionamento de um GitHub com múltiplos repositórios
    @OneToMany
    private List<Repositorio> repositorios;

    public GitHub() {}

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getEstrela() {
        return estrela;
    }

    public void setEstrela(int estrela) {
        this.estrela = estrela;
    }

    public List<Repositorio> getRepositorios() {
        return repositorios;
    }

    public void setRepositorios(List<Repositorio> repositorios) {
        this.repositorios = repositorios;
    }
}
