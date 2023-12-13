public class Examen {

    private double calificacion;

    private String titulo = "Programacion";

    public Examen(double calificacion, String titulo) {
        this.calificacion = calificacion;
        this.titulo = titulo;
    }

    public double getCalificacion() {

        for (int i = 0; i <=10; i++) {

            System.out.println(i);
        }

        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Examen{" +
                "calificacion=" + calificacion +
                ", titulo='" + titulo + '\'' +
                '}';
    }
}
