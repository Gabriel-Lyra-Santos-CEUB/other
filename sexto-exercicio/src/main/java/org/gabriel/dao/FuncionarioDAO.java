package org.gabriel.dao;

import org.gabriel.models.Funcionario;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class FuncionarioDAO implements PanacheRepositoryBase<Funcionario, Integer> {
    
}
