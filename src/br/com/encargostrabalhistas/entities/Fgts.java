package br.com.encargostrabalhistas.entities;

import br.com.encargostrabalhistas.services.Encargos;

public class Fgts implements Encargos {

    private Funcionario funcionario;

    @Override
    public double getValor() {
        return this.funcionario.getSalario() * 0.08;
    }

    @Override
    public double getValorMensal() {
        return this.funcionario.getSalario() * 0.08;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
}
