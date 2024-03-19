package org.gabriel.models;

import java.security.InvalidParameterException;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class Conta {

    private static final double MIL = 1000.0;
    
    public Conta(Integer numeroConta, Double saldo, Titular titular) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.valorLimite = MIL;
        this.titular = titular;
    }

    private Integer numeroConta;

    private Double saldo;

    private Double valorLimite;
    
    private Titular titular;

    public void transfere(Conta conta, Double valorTransferencia){
        if (valorTransferencia > 0.0 && this.saldo > valorTransferencia) {
            this.saldo -= valorTransferencia;
            conta.setSaldo(conta.getSaldo() + valorTransferencia);
        } else if (valorTransferencia < 0.0) {
            throw new InvalidParameterException();
        } else {
            // TODO: change exception to other more relevant
            throw new RuntimeException();
        }
    }

    public void saque(Double valorSaque) throws RuntimeException {
        if (valorSaque > 0.0 && this.saldo > valorSaque){
            this.saldo -= valorSaque;
        } else if (valorSaque < 0.0) {
            throw new InvalidParameterException();
        } else {
            // TODO: change exception to other more relevant
            throw new RuntimeException();
        }
    }

    public void deposito(Double valorDeposito){
        if (valorDeposito > 0.0) {
            this.saldo += valorDeposito;
        } else {
            throw new InvalidParameterException();
        }
    }

    @Override
    public String toString() {
        return "Conta " + 
            "[" + 
            "numeroConta=" + this.numeroConta + 
            ", saldo=" + this.saldo + 
            ", valorLimite=" + this.valorLimite + 
            ", titular=" + this.titular + 
            "]";
    }

    public String memoryAddress() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }

    public String extrato_1() {
        return "extrato_1 " + 
            "[" + 
            "numeroConta=" + this.numeroConta + 
            ", saldo=" + this.saldo + 
            "]";
    }

    public String extrato_2() {
        return "extrato_2 " + 
            "[" + 
            "nomeTitular=" + this.titular.getNomeTitular() + 
            ", sobrenomeTitular=" + this.titular.getSobrenomeTitular() + 
            ", cpf=" + this.titular.getCpfTitular() + 
            ", numeroConta=" + this.getNumeroConta() + 
            ", saldo=" + this.saldo + 
            "]";
    }

}
