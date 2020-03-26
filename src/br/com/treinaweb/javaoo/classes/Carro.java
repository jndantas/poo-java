package br.com.treinaweb.javaoo.classes;

public final class Carro extends VeiculoBase {

    private int quantidadePortas;

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    public void setQuantidadePortas(int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }

    public Carro(){
        this.quantidadeRodas = 4;
    }

    @Override
    public void preparar() {
        System.out.println("Colocar o cinto de segurança");
    }
}
