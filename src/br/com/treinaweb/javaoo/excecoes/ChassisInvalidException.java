package br.com.treinaweb.javaoo.excecoes;

public class ChassisInvalidException extends Exception {

    public ChassisInvalidException(String chassi){
        super(String.format("Esse chassi é inválido [%s]", chassi));
    }

}
