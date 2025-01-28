public class Auto extends Vehiculo {

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    private int cantidadPuertas;

    public Auto(String matricula, String marca, String modelo,int cantidadPuertas) {
        super(matricula, marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
    }

    @Override
    public String mostrarInfo() {
        return "El vehiculo con matricula " + getMatricula() + " es de la marca " + getMarca() + " y del modelo " + getModelo() + " y tiene " + getCantidadPuertas() + " puertas";
    }
}
