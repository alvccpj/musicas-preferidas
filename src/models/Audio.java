package models;

public class Audio {
    private String titulo;
    private int totalReproducoes;
    private int totalCurtidas;
    private String classificacao;

    public Audio(String titulo, int totalReproducoes, int totalCurtidas, String classificacao) {
        this.titulo = titulo;
        this.totalReproducoes = totalReproducoes;
        this.totalCurtidas = totalCurtidas;
        this.classificacao = classificacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public void setTotalReproducoes(int totalReproducoes) {
        this.totalReproducoes = totalReproducoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public void setTotalCurtidas(int totalCurtidas) {
        this.totalCurtidas = totalCurtidas;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public void curte () {
        totalCurtidas++;
    }

    public void reproduz () {
        totalReproducoes++;
    }
}
