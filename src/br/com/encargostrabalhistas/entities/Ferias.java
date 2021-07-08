package br.com.encargostrabalhistas.entities;

import br.com.encargostrabalhistas.services.Encargos;

public class Ferias implements Encargos {

    private Funcionario funcionario;

    @Override
    public double getValor() {
        double umTercoDeFerias = this.funcionario.getSalario()/3;
        double valorSalarioEFerias = this.funcionario.getSalario() + umTercoDeFerias;
        return valorSalarioEFerias;
    }

    @Override
    public double getValorMensal() {
        return getValor()/12;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
}
