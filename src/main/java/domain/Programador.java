

package domain;

import jakarta.persistence.*;
import java.io.Serializable;
/**
 *
 * @author Jussara Teixeira
 */

@Entity
@Table(name = "programador")
public class Programador implements Serializable {
    
    @Id
    @SequenceGenerator(sequenceName = "seq_programador", name = "seq_programador", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_programador")
    private Long id;

    @Column(nullable = false)
    private String nome;

    @OneToOne // Define um relacionamento 1:1 com GitHub
    private GitHub github;

    public Programador() {
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public GitHub getGithub() {
        return github;
    }

    public void setGithub(GitHub github) {
        this.github = github;
    }

    public void setID(long l) {
        
    }
}
