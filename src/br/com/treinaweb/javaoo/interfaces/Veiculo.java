package br.com.treinaweb.javaoo.interfaces;

import br.com.treinaweb.javaoo.excecoes.AbastecimentoVeiculoLigadoException;

public interface Veiculo {

    void preparar();
    void abastecer(float litros) throws AbastecimentoVeiculoLigadoException;

}
