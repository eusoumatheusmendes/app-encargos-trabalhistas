package br.com.encargostrabalhistas.entities;

import br.com.encargostrabalhistas.rules.SalarioInferiorAoSalarioMinimoException;

public class Funcionario {

    private String nome;
    private double salario;
    private int matricula;
    private static int quantidadeDeFuncionarios;

    public Funcionario(String nome, double salario, int matricula){
        verificarSalario(salario);
        verificarMatricula(matricula);
        this.nome = nome;
        this.salario = salario;
        this.matricula = matricula;
        Funcionario.quantidadeDeFuncionarios++;
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public static int getQuantidadeDeFuncionarios() {
        return Funcionario.quantidadeDeFuncionarios;
    }
}
