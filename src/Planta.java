public class Planta {
    private String nombre;
    private String nombrecientifico;
    private  boolean floreciendo;

    private int altura;

    public Planta(String nombre, String nombrecientifico, int altura) {
        this.nombre = nombre;
        this.nombrecientifico = nombrecientifico;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNombrecientifico() {
        return nombrecientifico;
    }

    public boolean isFloreciendo() {
        floreciendo = altura>30;
        return floreciendo;
    }

    public int getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return "Planta{" +
                "nombre='" + nombre + '\'' +
                ", nombrecientifico='" + nombrecientifico + '\'' +
                ", floreciendo=" + floreciendo +
                ", altura=" + altura +
                '}';
    }
}
