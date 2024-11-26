package io.programe.fabricadeprogramadores.resources;

import dao.GitHubDAO;
import dao.ProgramadorDAO;
import dao.RepositorioDAO;
import domain.GitHub;
import domain.Programador;
import domain.Repositorio;
import jakarta.ejb.EJB;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

/**
 * Recurso REST para operações com Programador.
 */
@Path("/programador")
public class ProgramadorResources {

    @EJB
    private ProgramadorDAO programadorDAO;

    @EJB
    private GitHubDAO gitHubDAO;

    @EJB
    private RepositorioDAO repositorioDAO;

    @POST
    @Path("/cadastrar")
    public Response salvarProgramador() {
        // Criando um novo Programador
        Programador p = new Programador();
        p.setID(1L);
        p.setNome("Maria");
        programadorDAO.salvar(p); // Salvando o Programador no banco
  
        // Criando repositórios 
        Repositorio r1 = new Repositorio();
        r1.setNome("Projeto de programação");
        repositorioDAO.salvar(r1);

        Repositorio r2 = new Repositorio();
        r2.setNome("Sistema de listas");
        repositorioDAO.salvar(r2);

        List<Repositorio> repositorios = new ArrayList<>();
        repositorios.add(r1);
        repositorios.add(r2);

        // Criando e associando um GitHub ao Programador
        GitHub github = new GitHub();
        github.setEstrela(4);
        github.setRepositorios(repositorios);
        gitHubDAO.salvar(github);

        return Response.status(Response.Status.CREATED).entity(p).build();
    }
}
