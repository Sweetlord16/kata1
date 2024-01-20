public class Main {
    public static void main(String[] args) {
        Planta rosa = new Planta("Rosa", "Rosa floribunda", 40);
        Planta cactus = new Planta("Cactus", "Cactaceae", 10);

        System.out.println("¿La rosa está floreciendo? " + rosa.isFloreciendo());
        System.out.println("¿El cactus está floreciendo? " + cactus.isFloreciendo());

        System.out.println(rosa.toString());
        System.out.println(cactus.toString());
    }
}
