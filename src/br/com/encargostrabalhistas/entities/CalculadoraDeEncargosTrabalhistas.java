package br.com.encargostrabalhistas.entities;

import br.com.encargostrabalhistas.services.Encargos;

public class CalculadoraDeEncargosTrabalhistas {

    private double total;
    private double custoMensal;

    public void calcularEncargosTotais(Encargos encargos){
       this.total += encargos.getValor();
    }

    public void calcularEncargosMensais(Encargos encargos){
        this.custoMensal += encargos.getValorMensal();
    }

    public double getTotal() {
        return total;
    }

    public double getCustoMensal() {
        return custoMensal;
    }
}
