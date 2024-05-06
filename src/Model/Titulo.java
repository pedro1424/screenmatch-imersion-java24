package Model;

public class Titulo {
    private String nombre;

    private int fechaLanzamiento;

    private double evaluacion;

    private boolean incluid_basic;

    private  String sinopsis;

    private int timeduracion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(int fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public double getEvaluacion() {
        return evaluacion;
    }


    public boolean isIncluid_basic() {
        return incluid_basic;
    }

    public void setIncluid_basic(boolean incluid_basic) {
        this.incluid_basic = incluid_basic;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public int getTimeduracion() {
        return timeduracion;
    }

    public void setTimeduracion(int timeduracion) {
        this.timeduracion = timeduracion;
    }

    public void muestrafichatecnica() {
        System.out.println("***Ficha Técnica**");
        System.out.println("Nombre del Titulo " + nombre);
        System.out.println("Fecha de Lanzamiento " + fechaLanzamiento );
        System.out.println("Tiempo de duración "  + getTimeduracion() + "  minutos" );

    }

}
