public class Biblioteka {
    private Ksiazka[] ksiazki;
    private int liczbaKsiazek;

    public Biblioteka(int pojemnosc) {
        this.ksiazki = new Ksiazka[pojemnosc];
        this.liczbaKsiazek = 0;
    }

    public void dodajKsiazke(Ksiazka ksiazka) {
        if (liczbaKsiazek < this.ksiazki.length) {
            ksiazki[liczbaKsiazek] = ksiazka;
            liczbaKsiazek++;
        } else {
            System.out.println("Nie ma miejsca w Bibliotece");
        }
    }
    public void wypiszDostepneKsiazka() {
        for (int i = 0; i < liczbaKsiazek; i++) {
            if (this.ksiazki[i] != null) {
                ksiazki[i].wypiszInfo();
            }
        }
    }
    public Ksiazka znajdzKsiazkePoTytule(String tytul) {
        for (int i = 0; i < liczbaKsiazek; i++) {
            if (this.ksiazki[i].equals(tytul)) {
                return  this.ksiazki[i];
            }
        }
        return null;
    }
    public int policzDostepneKsiazki() {
        int licznik = 0;
        for (int i = 0; i < liczbaKsiazek; i++) {
            if (this.ksiazki[i].dostepna) {
                licznik++;
            }
        }
        return licznik;
    }
}
