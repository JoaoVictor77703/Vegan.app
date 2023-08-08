package br.com.etecia.veganapp;

public class Filmes {
    private String titulo;

    private String descriçao;

    private String categoria;

    private String imagem;

    //criar o contrutor comparando alt+insert


    public Filmes(String titulo, String descriçao, String categoria, String imagem) {
        this.titulo = titulo;
        this.descriçao = descriçao;
        this.categoria = categoria;
        this.imagem = imagem;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescriçao() {
        return descriçao;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getImagem() {
        return imagem;
    }
}
