package org.gabriel.models;

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

    @Override
    public String toString() {
        return "Conta [numeroConta=" + numeroConta + ", saldo=" + saldo + ", valorLimite=" + valorLimite + ", titular="
                + titular + "]";
    }

    public String memoryAddress() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
}
