public class Main {
    public static void main(String[] args) {
        Ksiazka harryPotter = new Ksiazka("Harry Potter", "J.K Rowling", 300, true);
        Ksiazka PercyJackson = new Ksiazka("Percy Jackson", "Rick Riordan", 312, false);
        Ksiazka Malpy = new Ksiazka("Małpy", "Ałbena Grabowska", 125, true);

        System.out.println("Informacje o ksiazce");
        harryPotter.wypiszInfo();
        PercyJackson.wypiszInfo();
        Malpy.wypiszInfo();


    }
}
