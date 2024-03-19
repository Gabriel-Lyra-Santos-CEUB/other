package org.gabriel.rotinas;

import org.gabriel.models.Conta;
import org.gabriel.models.Titular;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MainRotinas {

    private Titular titular = new Titular("Gabriel", "Lyra", "12345678900");
    private Conta conta = new Conta(1234, 7320.0, this.titular);

    // TITULAR
    public String titularAsString(){
        return this.titular.toString();
    }

    public String titularNomeCompleto(){
        return this.titular.nomeCompleto();
    }

    public void changeTitularName() {
        this.titular.setNomeTitular("Marcos");
    }



    // CONTA
    public String contaAsString(){
        return this.conta.toString();
    }

    public String contaMemoryAddress(){
        return this.conta.memoryAddress();
    }

    // CONTA e TITULAR
    public String memoryAddresses(){
        return "Conta: " + this.conta.memoryAddress() + " Titular: " + this.conta.getTitular().memoryAddress();
    }

    public String changeTitularNameThenContaAsString() {
        this.titular.setNomeTitular("Marcos");
        return contaAsString();
    }

    public String changeTitularNameThroughContaThenContaAsString() {
        conta.getTitular().setNomeTitular("Rafael");
        return contaAsString();
    }

    public String changeTitularNameThroughContaThenTitularAsString() {
        conta.getTitular().setNomeTitular("Rafael");
        return titularAsString();
    }

    public String titularThroughContaAsString(){
        return this.conta.getTitular().toString();
    }
    
}
