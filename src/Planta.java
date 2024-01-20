public class Planta {
    private String nombre;
    private String nombre_cientifico;
    private int altura;
    private boolean floreciendo;

    public Planta(String nombre, String nombre_cientifico, int altura) {
        this.nombre = nombre;
        this.nombre_cientifico = nombre_cientifico;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNombre_cientifico() {
        return nombre_cientifico;
    }

    public int getAltura() {
        return altura;
    }

    public boolean isFloreciendo() {
        floreciendo = altura >30;
        return floreciendo;
    }

    @Override
    public String toString() {
        return "Planta{" +
                "nombre='" + nombre + '\'' +
                ", nombre_cientifico='" + nombre_cientifico + '\'' +
                ", altura=" + altura +
                ", floreciendo=" + floreciendo +
                '}';
    }
}
