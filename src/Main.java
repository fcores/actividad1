import java.lang.reflect.Array;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Auto auto1 = new Auto("AFDFS","Renuult","12",4);
            Moto moto1 = new Moto("AFDFS","BMW","12","Scooter");
            Camion camion1 = new Camion("AFDFS","SCANIA","Excel",56);

            ArrayList<Vehiculo> listaVehiculo = new ArrayList<Vehiculo>();

            listaVehiculo.add(auto1);
            listaVehiculo.add(moto1);
            listaVehiculo.add(camion1);

            for(Vehiculo vehiculo:listaVehiculo){
                System.out.println(vehiculo.mostrarInfo());
            }
        }
}
