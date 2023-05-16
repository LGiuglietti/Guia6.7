package Modulos;

public class PortaAviones extends Barco implements IAccionesBuque{
    private int cantAviones;
    private int tripulantes;

    public PortaAviones(double eslora, double manga, double lineaFlotacion, int cantAviones, int tripulantes, String nombre) {
        super(eslora, manga, lineaFlotacion,nombre);
        this.cantAviones = cantAviones;
        this.tripulantes = tripulantes;
    }

    public PortaAviones() {
        super();
        this.cantAviones = 0;
        this.tripulantes = 0;
    }

    public int getCantAviones() {
        return cantAviones;
    }
    public int getTripulantes() {
        return tripulantes;
    }

    @Override
    public String toString() {
        return "PortaAviones{" +
                "cantAviones=" + cantAviones +
                ", tripulantes=" + tripulantes +
                "} " + super.toString();
    }

    public String despege()
    {
        return "via libre para despege";
    }
    //implementacion interfaz IAccionesBuque


    @Override
    public String msgeSocorro() {
        String msgeS=new String("Atencion, Porta aviones: "+getNombre()+", necesitamos ayuda, estamos bajo ataque");
        return msgeS;
    }

    @Override
    public String alarma() {
        String aux=new String("Atencion soldados del: "+getNombre()+", TODOS A SUS ESTACIONES");
        return aux;
    }
}
