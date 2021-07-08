package br.com.encargostrabalhistas.entities;

import br.com.encargostrabalhistas.services.Encargos;

public class DecimoTerceiro implements Encargos {

    private Funcionario funcionario;

    public Funcionario getFuncionario() {
        return funcionario;
    }

    @Override
    public double getValor() {
        return this.funcionario.getSalario();
    }

    @Override
    public double getValorMensal() {
        return this.getValor()/12;
    }
}
