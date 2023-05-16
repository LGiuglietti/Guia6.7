import Modulos.Barco;
import Modulos.Pasajeros;
import Modulos.Pesquero;
import Modulos.PortaAviones;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Barco> barcos=new ArrayList<>();
        Barco pasa=new Pasajeros(35,20,5,30,"EL AMANTE");
        barcos.add(0,pasa);
        barcos.add(1,new Pesquero(23,10,3,10,500,"el borracho"));
        barcos.add(2,new PortaAviones(150,56,20,17,150,"chuchu"));

        for(int i=0;i< barcos.size();i++)
        {
            System.out.println(barcos.get(i).toString());
            System.out.println(barcos.get(i).acelerar());
            if(barcos.get(i) instanceof Pasajeros)
            {
                Pasajeros auxPasa=(Pasajeros) barcos.get(i);
                System.out.println(auxPasa.alarma());
                System.out.println(auxPasa.msgeSocorro());
            }
            else if (barcos.get(i) instanceof PortaAviones)
            {
                PortaAviones auxPorta=(PortaAviones) barcos.get(i);
                System.out.println(auxPorta.alarma());
                System.out.println(auxPorta.msgeSocorro());
            }
            else
            {
                Pesquero auxPes=(Pesquero) barcos.get(i);
                System.out.println(auxPes.alarma());
                System.out.println(auxPes.msgeSocorro());
            }
        }

    }
}