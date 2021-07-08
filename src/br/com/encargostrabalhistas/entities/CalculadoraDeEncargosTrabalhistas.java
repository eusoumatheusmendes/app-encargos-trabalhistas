package br.com.encargostrabalhistas.entities;

import br.com.encargostrabalhistas.services.Encargos;

public class CalculadoraDeEncargosTrabalhistas {

    private double total;

    public double getTotal(Encargos encargos){
       this.total += encargos.getValor();
       return this.total;
    }

    public double getEncargosMensais(){
        return this.total/12;
    }
}
