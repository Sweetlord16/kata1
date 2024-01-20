import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Planta rosa = new Planta("Rosa", "Rosa Moribunda", 40);
        Planta margarita = new Planta("Margarita", "Margarita chica", 30);

        System.out.println("¿La rosa está floreciendo?" + rosa.isFloreciendo());
        System.out.println("¿La margarita está floreciendo?" + margarita.isFloreciendo());

        System.out.println(rosa.toString());
        System.out.println(margarita.toString());

    }
}
