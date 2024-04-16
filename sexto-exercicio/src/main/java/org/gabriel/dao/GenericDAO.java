package org.gabriel.dao;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;

@ApplicationScoped
public class GenericDAO {

    @Inject
    private EntityManager entityManager;

    public void createDatabaseEmpresa() {
        entityManager.createNativeQuery("CREATE DATABASE IF NOT EXISTS empresa");
    }

    public void createTableFuncionario() {
        entityManager.createNativeQuery(
        "CREATE TABLE IF NOT EXISTS tb_funcionario (idt int, nome varchar(45), salario int(9,2))"
        );
        
    }
    
}
