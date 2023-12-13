public class Deposito {

    private int capacidad;

    private String contenido;

    public Deposito(int capacidad, String contenido) {
        this.capacidad = capacidad;
        this.contenido = contenido;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
}
