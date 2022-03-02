package br.com.lojinha.pojo;

import br.com.lojinha.enus.tamanho;


import java.util.List;

public class Produto {
    private String nome;
    private String marca;
    private double valor;
    private tamanho tamanho;
    private List<String> itensInclusos;

    public Produto(String marcaInicial, tamanho tamanhoInicial){
         this.marca = marcaInicial;
         this.tamanho = tamanhoInicial;
    }

    public double getValor(){
        return this.valor;
    }
    public void setValor(double novoValor){
        if(novoValor > 0) {
            this.valor = novoValor;
        }else {
               throw new IllegalArgumentException("Valores devem ser maiores que zero");
        }
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String novoNome){
        this.nome = novoNome;
    }
    public String getMarca(){
        return this.marca;
    }
    public void setMarca(String novaMarca){
        this.marca = novaMarca;
    }

    public tamanho getTamanho(){

        return this.tamanho;
    }
    public void setTamanho(tamanho novoTamanho){

        this.tamanho = novoTamanho;

    }


    public List<String> getItensInclusos() {
        return itensInclusos;
    }

    public void setItensInclusos(List<String> novositensInclusos) {
        this.itensInclusos = novositensInclusos;
    }
}
