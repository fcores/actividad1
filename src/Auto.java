public class Auto extends Vehiculo {

    int cantidadPuertas;

    public Auto(String matricula, String marca, String modelo,int cantidadPuertas) {
        super(matricula, marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
    }
}
