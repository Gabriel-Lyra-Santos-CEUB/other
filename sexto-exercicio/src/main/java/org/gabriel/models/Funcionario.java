package org.gabriel.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @Builder 
@AllArgsConstructor @NoArgsConstructor
@Table(name="tb_funcionario")
public class Funcionario {

    @Id
    @Column(name = "idt")
    private Integer id;

    @Column(name = "nome")
    @NotNull @NotBlank
    private String nome;

    @Column(name = "salario")
    @NotNull @Positive
    private Double salario;
    
}
