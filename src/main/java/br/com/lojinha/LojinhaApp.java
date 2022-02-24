package br.com.lojinha;

import br.com.lojinha.pojo.Produto;

import java.util.ArrayList;
import java.util.List;


public class LojinhaApp {
    public static void main(String[] args) {
        Produto meuProduto = new Produto();


        meuProduto.setNome("Playstation 4");
        meuProduto.setValor(1800.00);
        meuProduto.setMarca("Sony");
        meuProduto.setTamanho("20x30");

        List<String> itensInclusos = new ArrayList<>();
        itensInclusos.add("Console");
        itensInclusos.add("NF");
        itensInclusos.add("Ccontrole");
        itensInclusos.add("Cabos");
        itensInclusos.add("Manual");
        meuProduto.setItensInclusos(itensInclusos);

        System.out.println(meuProduto.getItensInclusos());


    }
}
