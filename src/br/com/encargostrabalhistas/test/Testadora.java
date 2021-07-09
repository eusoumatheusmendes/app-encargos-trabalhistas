package br.com.encargostrabalhistas.test;

import br.com.encargostrabalhistas.entities.*;

public class Testadora {

    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario("Matheus Mendes", 10000, 192837);

        DecimoTerceiro decimoTerceiro = new DecimoTerceiro();
        decimoTerceiro.setFuncionario(funcionario1);

        Ferias ferias = new Ferias();
        ferias.setFuncionario(funcionario1);

        Fgts fgts = new Fgts();
        fgts.setFuncionario(funcionario1);

        CalculadoraDeEncargosTrabalhistas calc = new CalculadoraDeEncargosTrabalhistas();

        calc.calcularEncargosMensais(decimoTerceiro);
        calc.calcularEncargosMensais(ferias);
        calc.calcularEncargosMensais(fgts);

        calc.calcularEncargosTotais(decimoTerceiro);
        calc.calcularEncargosTotais(ferias);
        calc.calcularEncargosTotais(fgts);

        System.out.println("Você tem um custo mensal de "
                +calc.getCustoMensal() + " com o funcionário " +funcionario1.getNome());

        System.out.println("Você tem um custo total de "
                +calc.getTotal() + " com o funcionário " +funcionario1.getNome());


    }
}
