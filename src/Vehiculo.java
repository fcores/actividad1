public abstract class Vehiculo {

    protected String matricula;
    protected String marca;
    protected String modelo;

    public Vehiculo(String matricula,String marca,String modelo){
        this.marca= marca;
        this.modelo= modelo;
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public abstract String mostrarInfo();
}
