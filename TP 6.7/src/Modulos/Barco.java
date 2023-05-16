package Modulos;

public abstract class Barco {
    private double eslora;
    private double manga;
    private double lineaFlotacion;
    private String nombre;

    public Barco(double eslora, double manga, double lineaFlotacion, String nombre) {
        this.eslora = eslora;
        this.manga = manga;
        this.lineaFlotacion = lineaFlotacion;
        this.nombre=nombre;
    }
    public Barco()
    {
        this.eslora=0;
        this.lineaFlotacion=0;
        this.manga=0;
        this.nombre="";
    }

    public double getEslora() {
        return eslora;
    }

    public double getManga() {
        return manga;
    }

    public String getNombre() {
        return nombre;
    }

    public double getLineaFlotacion() {
        return lineaFlotacion;
    }
    public String acelerar()
    {
        return "yeyy soy el barco "+getNombre()+" y estoy nadando";
    }

    @Override
    public String toString() {
        return "Barco{" +
                "eslora=" + eslora +
                ", manga=" + manga +
                ", lineaFlotacion=" + lineaFlotacion +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
