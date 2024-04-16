package org.gabriel.rotinas;

import org.gabriel.dao.FuncionarioDAO;
import org.gabriel.dao.GenericDAO;
import org.gabriel.models.Funcionario;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.NotFoundException;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@ApplicationScoped
public class MainRotinas {

    @Inject
    private FuncionarioDAO funcionarioDAO;

    @Inject
    private GenericDAO genericDAO;

    public Funcionario findFuncionarioById(Integer id) throws NotFoundException {
        Funcionario entity = funcionarioDAO.findByIdOptional(id)
            .orElseThrow(() -> {
                Response response = Response.status(Response.Status.NOT_FOUND)
                    .type(MediaType.APPLICATION_JSON)
                    .build();
                return new NotFoundException(response);
            });

        log.info("Funcionario found with id: {}", id);
        return entity;
    }


    public void createDatabaseEmpresa() {
        genericDAO.createDatabaseEmpresa();
    }

    public void createTableFuncionario() {
        genericDAO.createTableFuncionario();
    }
    
}
