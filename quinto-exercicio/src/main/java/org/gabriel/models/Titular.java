package org.gabriel.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class Titular {

    private String nomeTitular;

    private String sobrenomeTitular;

    private String cpfTitular;

    public String nomeCompleto() {
        return this.nomeTitular + " " + this.sobrenomeTitular;
    }

    @Override
    public String toString() {
        return "Titular [nomeTitular=" + nomeTitular + ", sobrenomeTitular=" + sobrenomeTitular + ", cpfTitular="
                + cpfTitular + "]";
    }

    public String memoryAddress() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
    
}
