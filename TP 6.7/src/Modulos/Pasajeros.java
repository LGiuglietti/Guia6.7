package Modulos;

public class Pasajeros extends Barco implements IAccionesBuque{
    private int camas;

    public Pasajeros(double eslora, double manga, double lineaFlotacion, int camas, String nombre) {
        super(eslora, manga, lineaFlotacion,nombre);
        this.camas = camas;
    }
    public  Pasajeros()
    {
        super();
        this.camas=0;
    }

    public int getCamas() {
        return camas;
    }

    @Override
    public String toString() {
        return "Pasajeros{" +
                "camas=" + camas +
                "} " + super.toString();
    }


    //implementacion interfaz IAccionesBuque


    @Override
    public String msgeSocorro() {
        String msgeS=new String("Atencion, buque de pasajeros: "+getNombre()+", necesitamos ayuda, desplegando botes salvavidas");
        return msgeS;
    }

    @Override
    public String alarma() {
        String aux=new String("Aviso a todos los pasajeros de: "+getNombre()+", estamos llegando a puerto");
        return aux;
    }
}
