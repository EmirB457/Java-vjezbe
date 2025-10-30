package Invididualno;
public class Kombi extends Vozilo { // nasledjuje klasu vozilo i ima pristup njenim atributima i metodama i dodajemo atribut kapacitetPutnika
    private int kapacitetPutnika;

    // Konstruktor nasledjuje klasu vozilo zbog toga sto koristimo super i dodajemo novi atribut kapacitetPutnika
    public Kombi(String proizvodjac, int godinaProizvodnje, int kubikaza, String boja,
                 int kapacitetPutnika) {
        super(proizvodjac, godinaProizvodnje, kubikaza, boja);
        this.kapacitetPutnika = kapacitetPutnika;
    }

    // Kreiranje novog getera
    public int getKapacitetPutnika() {
        return kapacitetPutnika;
    }

    // kreiranje novog setera 
    public void setKapacitetPutnika(int kapacitetPutnika) {
        this.kapacitetPutnika = kapacitetPutnika;
    }

    // Računanje cijene vozila ako je broj putnika veci od 8 povecavamo cijenu za 30e
    @Override 
    public double izracunajCijenu() {
        double cijena = super.izracunajCijenu();
        if (getKapacitetPutnika() > 8) {
            cijena += 30;
        }
        return cijena;
    }

    // Ispisujemo podatke
    @Override
    public void ispisiPodatke() {
        super.ispisiPodatke();
        System.out.println("Kapacitet putnika: " + getKapacitetPutnika());
    }
}