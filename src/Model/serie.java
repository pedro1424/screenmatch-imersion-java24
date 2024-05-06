package Model;

public class serie extends Titulo{

    private int temporada;

    private int episodioTemporada;

    private int duracionepisodio;

    @Override
    public int getTimeduracion() {
        return duracionepisodio* episodioTemporada * temporada;


    }


    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public int getEpisodioTemporada() {
        return episodioTemporada;
    }

    public void setEpisodioTemporada(int episodioTemporada) {
        this.episodioTemporada = episodioTemporada;
    }

    public int getDuracionepisodio() {
        return duracionepisodio;
    }

    public void setDuracionepisodio(int duracionepisodio) {
        this.duracionepisodio = duracionepisodio;
    }
}
