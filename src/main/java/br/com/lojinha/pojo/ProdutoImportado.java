package br.com.lojinha.pojo;

import br.com.lojinha.enums.ProdutosDisponiveis;
import br.com.lojinha.interfaces.Favoritos;

public class ProdutoImportado extends Produto implements Favoritos {
    private double taxaImportação;

    public ProdutoImportado(String marcaInicial, ProdutosDisponiveis novoProduto) {
        super(marcaInicial, novoProduto);
    }
    public void setValor (double novoValor) {
        if (novoValor > -100) {
            this.valor = novoValor;
        } else {
            throw new IllegalArgumentException("Valores devem ser maiores que -100");
        }
    }

    public double getTaxaImportação() {
        return this.taxaImportação;
    }

    public void setTaxaImportação(double novaTaxaImportação) {
        this.taxaImportação = novaTaxaImportação;
    }

    public String getDadosFavoritos() {
        return this.getNome() + ", " + this.getMarca() + "e" + this.getValor();
    }
}