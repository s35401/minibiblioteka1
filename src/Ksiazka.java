public class Ksiazka {
    private String tytul;
    private String autor;
    private int LiczbaStron;
    private boolean dostepna;

    public Ksiazka (String tytul, String autor, int LiczbaStron, boolean dostepna) {
        this.tytul = tytul;
        this.autor = autor;
        this.LiczbaStron = LiczbaStron;
        this.dostepna = dostepna;
    }
    public void wypiszInfo() {
        System.out.println("Tytuł: " + this.tytul);
        System.out.println("Autor: " + this.autor);
        System.out.println("Liczba Stron: " + this.LiczbaStron);
        System.out.println("Dostępna: " + this.dostepna);


    }
    boolean wypozycz() {
        if (dostepna) {
            System.out.println("Książka jest dostępna, Miłego czytania!");
            return dostepna=false;
        }

        else {
            System.out.println("Książka jest niedostępna, Przepraszamy");
            return false;
        }
    }
    void zwroc() {
        dostepna=true;
        System.out.println("Dziękujemy za zwrocenie ksiązki");
    }

}