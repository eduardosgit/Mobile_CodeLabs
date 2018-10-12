package com.eduardo.listapaises;

public class Pais {

    public int rank;
    public String nome;
    public int populacao;
    public int imagem;

    public Pais (int rank, String nome, int populacao, int imagem) {
        this.rank = rank;
        this.nome = nome;
        this.populacao = populacao;
        this.imagem = imagem;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPopulacao() {
        return populacao;
    }

    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }
}
