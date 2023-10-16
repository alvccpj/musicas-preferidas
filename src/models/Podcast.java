package models;

import models.Audio;

public class Podcast extends Audio {
    private String apresentador;
    private String descricao;

    public Podcast(String titulo, int totalReproducoes, int totalCurtidas, String classificacao, String apresentador, String descricao) {
        super(titulo, totalReproducoes, totalCurtidas, classificacao);
        this.apresentador = apresentador;
        this.descricao = descricao;
    }

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
