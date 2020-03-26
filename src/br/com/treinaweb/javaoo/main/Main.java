package br.com.treinaweb.javaoo.main;

import br.com.treinaweb.javaoo.classes.Carro;
import br.com.treinaweb.javaoo.classes.VeiculoBase;
import br.com.treinaweb.javaoo.excecoes.AbastecimentoVeiculoLigadoException;
import br.com.treinaweb.javaoo.excecoes.ChassisInvalidException;

public class Main {

    public static void main(String[] args){
        try {
            VeiculoBase corsa = new Carro();
            corsa.setMarca("GM");
            corsa.setNome("Corsa");
            corsa.setChassi("ABCDE");
            corsa.abastecer(10);
            System.out.println(corsa.getNome());
            System.out.println(corsa.getQuantidadeCombustivel());
            System.out.println(corsa.getQuantidadeRodas());
            corsa.abastecer(10);
            corsa.ligar();
            corsa.abastecer(10);
        } catch (AbastecimentoVeiculoLigadoException e) {
            System.out.println("Você não pode abastecer com o veículo ligado");
        } catch (ChassisInvalidException e){
            System.out.println("O chassi é inválido. " + e.getMessage());
        }

        catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }
    }
}
