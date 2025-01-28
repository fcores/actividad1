public class Moto extends Vehiculo {

    String tipo;

    public Moto(String matricula, String marca, String modelo, String tipo) {
        super(matricula, marca, modelo);
        this.tipo = tipo;
    }
}
