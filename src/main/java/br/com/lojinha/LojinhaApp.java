package br.com.lojinha;

import br.com.lojinha.enus.tamanho;
import br.com.lojinha.pojo.ItemIncluso;
import br.com.lojinha.pojo.Produto;

import java.util.ArrayList;
import java.util.List;


public class LojinhaApp {
    public static void main(String[] args) {
        Produto meuProduto = new Produto("Sony", tamanho.MEDIO);


        meuProduto.setNome("Playstation 4");
        meuProduto.setValor(1800.00);



        List<ItemIncluso> itensInclusos = new ArrayList<>();
        ItemIncluso primeiroItemIncluso = new ItemIncluso("Controle", 2);
        itensInclusos.add(primeiroItemIncluso);

        ItemIncluso segundoItemIncluso = new ItemIncluso("Console", 1);
        itensInclusos.add(segundoItemIncluso);

        ItemIncluso terceiroItemIncluso = new ItemIncluso("NF",1 );
        itensInclusos.add(terceiroItemIncluso);





        meuProduto.setItensInclusos(itensInclusos);

        System.out.println(meuProduto.getMarca());


    }
}
