package models;

import models.Audio;

public class Musica extends Audio {
    private String album;
    private String cantor;
    private String genero;

    public Musica(String titulo, int totalReproducoes, int totalCurtidas, double classificacao, String album, String cantor, String genero) {
        super(titulo, totalReproducoes, totalCurtidas, classificacao);
        this.album = album;
        this.cantor = cantor;
        this.genero = genero;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public double getClassificacao() {
        if(this.getTotalReproducoes() > 2000) {
            return 10;
        } else {
            return 8;
        }
    }
}
