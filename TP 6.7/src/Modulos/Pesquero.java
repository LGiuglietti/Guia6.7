package Modulos;

public class Pesquero extends Barco implements IAccionesBuque{
    private int pescadores;
    private double potencia;

    public Pesquero(double eslora, double manga, double lineaFlotacion, int pescadores, double potencia, String nombre) {
        super(eslora, manga, lineaFlotacion,nombre);
        this.pescadores = pescadores;
        this.potencia = potencia;
    }

    public Pesquero() {
        super();
        this.pescadores=0;
        this.potencia=0;
    }

    public int getPescadores() {
        return pescadores;
    }

    public double getPotencia() {
        return potencia;
    }

    @Override
    public String toString() {
        return "Pesquero{" +
                "pescadores=" + pescadores +
                ", potencia=" + potencia +
                "} " + super.toString();
    }
    @Override
    public String msgeSocorro() {
        String msgeS=new String("Atencion, buque pesquero: "+getNombre()+", necesitamos ayuda, el barco se hunde");
        return msgeS;
    }

    @Override
    public String alarma() {
        String aux=new String("Aviso a los pescadores de: "+getNombre()+", estamos llegando al pozo, TODOS A CUBIERTA");
        return aux;
    }

}
