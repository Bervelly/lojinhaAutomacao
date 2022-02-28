package br.com.lojinha;

import br.com.lojinha.enums.ProdutosDisponiveis;
import br.com.lojinha.pojo.ItensInclusos;
import br.com.lojinha.pojo.Produto;
import br.com.lojinha.pojo.ProdutoImportado;
import br.com.lojinha.pojo.ProdutoNacional;

import java.util.ArrayList;
import java.util.List;

public class LojinhaApp {
    public static void main(String[] args) {

        Produto meuProduto = new Produto("Apple", ProdutosDisponiveis.SMARTPHONE);

        List<String> modelo = new ArrayList<>();
        modelo.add("iphone x");//0
        modelo.add("iphone 11");//1
        modelo.add("iphone 12");//2
        modelo.add("iphone 13");//3
        meuProduto.setModelo(modelo);

        meuProduto.setValor(3999.99);

        List<ItensInclusos> itensInclusos = new ArrayList<>();

        ItensInclusos primeiroItem = new ItensInclusos("carregador", 1);
        itensInclusos.add(primeiroItem);//0

        ItensInclusos segundoItem = new ItensInclusos("fones de ouvido", 2);
        itensInclusos.add(segundoItem);//1

        ItensInclusos terceiroItem = new ItensInclusos("manual de intruções", 1);
        itensInclusos.add(terceiroItem);//2


        meuProduto.setItensInclusos(itensInclusos);

        System.out.println(meuProduto.getMarca());
        System.out.println(meuProduto.getNome());
        System.out.println(meuProduto.getModelo().get(1));


        for (ItensInclusos listarItensInclusos: meuProduto.getItensInclusos()){
            System.out.println(listarItensInclusos.getNome());
            System.out.println(listarItensInclusos.getQuantidade());
        }
        ProdutoNacional meuProdutoNacional = new ProdutoNacional("LG", ProdutosDisponiveis.SMARTWATCH);
        meuProdutoNacional.setImpostoNacional(0.55);
        System.out.println(meuProdutoNacional.getImpostoNacional());
        System.out.println(meuProdutoNacional.getMarca());
        System.out.println(meuProdutoNacional.getNome());

        ProdutoImportado meuProdutoImportado = new ProdutoImportado("SAMSUNG", ProdutosDisponiveis.SMARTPHONE);
        meuProdutoImportado.setTaxaImportação(0.80);
        meuProdutoImportado.setValor(-100);
        System.out.println(meuProdutoImportado.getTaxaImportação());
        System.out.println(meuProdutoImportado.getMarca());
        System.out.println(meuProdutoImportado.getNome());
    }
}
