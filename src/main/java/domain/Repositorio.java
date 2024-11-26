
package domain;

import jakarta.persistence.*;
import java.io.Serializable;

/**
 *
 * @author Jussara Teixeira
 */
@Entity
public class Repositorio implements Serializable {
    
    @Id
    @SequenceGenerator(sequenceName = "seq_repositorio", name = "seq_repositorio", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_repositorio")
    private Long id;

    @Column
    private String nome;


    public Repositorio() {}

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
}
