package br.com.lojinha.pojo;

import br.com.lojinha.enums.ProdutosDisponiveis;
import br.com.lojinha.interfaces.Favoritos;

public class ProdutoNacional extends Produto implements Favoritos {
    private double impostoNacional;

    public ProdutoNacional(String marcaInicial, ProdutosDisponiveis novoProduto) {
        super(marcaInicial, novoProduto);
    }

    public double getImpostoNacional() {
        return this.impostoNacional;
    }

    public void setImpostoNacional(double novoImpostoNacional) {
        this.impostoNacional = novoImpostoNacional;
    }
    public String getDadosFavoritos(){
        return this.getNome() + ", " + this.getMarca() + "e" + this.getValor();
    }

}

