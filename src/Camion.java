public class Camion extends Vehiculo {

    int capacidadCarga;

    public Camion(String matricula, String marca, String modelo, int capacidadCarga) {
        super(matricula, marca, modelo);
        this.capacidadCarga = capacidadCarga;
    }
}
