public class Czytelnik {
    private String imie;
    private String nazwisko;
    private int numerKarty;
    private int liczbaWypozyczen;

    public Czytelnik(String imie, String nazwisko, int numerKarty, int liczbaWypozyczen) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numerKarty = numerKarty;
        this.liczbaWypozyczen = 0;
    }
    public void wypiszDane() {
        System.out.println("Czytelnik: " + this.imie + " " + this.nazwisko + " Nr karty: " + this.numerKarty + "Wypozyczono: " + this.liczbaWypozyczen);
    }
    public void zwiekszLiczbeWypozyczen() {
        this.liczbaWypozyczen++;
    }
    public void zmniejszliczbeWypozyczen() {
        if (this.liczbaWypozyczen > 0) {
            this.liczbaWypozyczen--;
        }
    }

}
