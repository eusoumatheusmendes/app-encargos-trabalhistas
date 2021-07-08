package br.com.encargostrabalhistas.entities;

import br.com.encargostrabalhistas.rules.SalarioInferiorAoSalarioMinimoException;

public class Funcionario {

    private String nome;
    private double salario;
    private int matricula;

    public Funcionario(String nome, double salario, int matricula){
        verificarSalario(salario);
        verificarMatricula(matricula);
        this.nome = nome;
        this.salario = salario;
        this.matricula = matricula;
    }

    public void verificarSalario(double valor){
        if(valor < 1100){
            throw new SalarioInferiorAoSalarioMinimoException("Salário não deve ser inferior " +
                    "ao salário mínimo" +valor);
        }
    }

    public void verificarMatricula(int numero){
        if(numero <=0){
            throw new IllegalArgumentException("Matrícula inválida! Verifique-a, por favor. " +numero);
        }
    }
}
