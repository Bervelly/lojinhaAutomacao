package br.com.lojinha.pojo;

import br.com.lojinha.enums.ProdutosDisponiveis;

import java.util.List;

public class Produto {
    private ProdutosDisponiveis nome;
    private String marca;
    protected double valor;
    private List<String>modelo;
    private List<ItensInclusos>itensInclusos;

    public Produto(String marcaInicial, ProdutosDisponiveis novoProduto){
        this.marca = marcaInicial;
        this.nome = novoProduto;

    }

    public ProdutosDisponiveis getNome() {
        return this.nome;
    }

    public void setNome (ProdutosDisponiveis novoNome) {
        this.nome = novoNome;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String novaMarca) {

        this.marca = novaMarca;
    }

    public Double getValor() {

        return this.valor;
    }

    public void setValor (Double novoValor) {
        if (novoValor > 0) {
            this.valor = novoValor;
        }   else {
            throw new IllegalArgumentException("Valor não pode ser zero");
        }

           }

    public List<String> getModelo() {

        return this.modelo;
    }

    public void setModelo(List<String> novoModelo) {

        this.modelo = novoModelo;
    }

    public List<ItensInclusos> getItensInclusos() {
        return this.itensInclusos;
    }

    public void setItensInclusos(List<ItensInclusos>novosItensInclusos) {

        this.itensInclusos = novosItensInclusos;
    }
}
