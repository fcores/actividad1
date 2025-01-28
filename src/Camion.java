public class Camion extends Vehiculo {

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    private int capacidadCarga;

    public Camion(String matricula, String marca, String modelo, int capacidadCarga) {
        super(matricula, marca, modelo);
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public String mostrarInfo() {
        return "El vehiculo con matricula " + getMatricula() + " es de la marca " + getMarca() + " y del modelo " + getModelo() + " y tiene una capacidad de " + getCapacidadCarga() + " toneladas";
    }
}
