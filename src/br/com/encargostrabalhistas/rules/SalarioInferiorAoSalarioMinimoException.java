package br.com.encargostrabalhistas.rules;

public class SalarioInferiorAoSalarioMinimoException extends RuntimeException {

    public SalarioInferiorAoSalarioMinimoException(String mensagem) {
        super(mensagem);
    }
}
