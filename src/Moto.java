public class Moto extends Vehiculo {

    public String getTipo() {
        return tipo;
    }

    private String tipo;

    public Moto(String matricula, String marca, String modelo, String tipo) {
        super(matricula, marca, modelo);
        this.tipo = tipo;
    }

    @Override
    public String mostrarInfo() {
        return "El vehiculo con matricula " + getMatricula() + " es de la marca " + getMarca() + " y del modelo " + getModelo() + " y es del tipo " + getTipo();
    }
}
