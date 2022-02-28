package br.com.lojinha.pojo;

import java.util.List;

public class ItensInclusos {
   private String nome;
   private int quantidade;

   public ItensInclusos (String nomeInicial, int quantidadeInicial){
      this.nome = nomeInicial;
      this.quantidade = quantidadeInicial;
   }

   public int getQuantidade() {

      return this.quantidade;
   }
   public void setQuantidade(int quantidade){
      this.quantidade = quantidade;

   }

   public String getNome() {
      return this.nome;
   }

   public void setNome(String novoNome) {
      this.nome = novoNome;
   }
}


