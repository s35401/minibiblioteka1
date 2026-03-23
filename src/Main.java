public class Main {
    public static void main(String[] args) {
        Biblioteka biblioteka = new Biblioteka(10);

        Ksiazka harryPotter = new Ksiazka("Harry Potter", "J.K Rowling", 300, true);
        Ksiazka PercyJackson = new Ksiazka("Percy Jackson", "Rick Riordan", 312, false);
        Ksiazka Malpy = new Ksiazka("Małpy", "Ałbena Grabowska", 125, true);

        biblioteka.dodajKsiazke(harryPotter);
        biblioteka.dodajKsiazke(PercyJackson);
        biblioteka.dodajKsiazke(Malpy);

        Czytelnik c1 = new Czytelnik("Adam", "Sowa",1213);

        // Zad 4 Scenariusz:
        System.out.println("Stan początkowy:");
        biblioteka.wypiszDostepneKsiazka();

        System.out.println("Wypożyczanie: Percy Jackson:");
        Ksiazka szukana = biblioteka.znajdzKsiazkePoTytule("Percy Jackson");
        if (szukana != null) {
            szukana.wypozycz();
            c1.zwiekszLiczbeWypozyczen();
        }

        System.out.println("Stan po wypożyczeniu ksiązki:");
        biblioteka.wypiszDostepneKsiazka();
        c1.wypiszDane();

        System.out.print("Zwrot ksiązki: ");
        szukana.zwroc();
        c1.zwiekszLiczbeWypozyczen();

        biblioteka.wypiszDostepneKsiazka();

    }
}
