package Invididualno;
public class Vozilo {
    private String proizvodjac;
    private int godinaProizvodnje;
    private int kubikaza;
    private String boja;

    public Vozilo(String proizvodjac, int godinaProizvodnje, int kubikaza, String boja) { // Konstruktor 
        this.proizvodjac = proizvodjac;
        this.godinaProizvodnje = godinaProizvodnje;
        this.kubikaza = kubikaza;
        this.boja = boja;
    }

    // Geteri i seteri
    public String getProizvodjac() { return proizvodjac; }
    public void setProizvodjac(String proizvodjac) { this.proizvodjac = proizvodjac; }

    public int getGodinaProizvodnje() { return godinaProizvodnje; }
    public void setGodinaProizvodnje(int godinaProizvodnje) { this.godinaProizvodnje = godinaProizvodnje; }

    public int getKubikaza() { return kubikaza; }
    public void setKubikaza(int kubikaza) { this.kubikaza = kubikaza; }

    public String getBoja() { return boja; }
    public void setBoja(String boja) { this.boja = boja; }

    // Metoda za izračunavanje cijene vozila,osnovna cijena je 100e
    public double izracunajCijenu() {
        double cijena = 100;

        // Ako je vozilo starije od 2010 godine povecavamo cijenu za 30eu
        if (godinaProizvodnje < 2010) {
            cijena += 30;
        } else if (godinaProizvodnje <= 2020) {
            cijena += 10;
        } else {
            cijena += 50;
        }

        // Provjeravamo kubikazu da li je preko 2000 ako jeste cijenu povecavamo za 50
        if (kubikaza > 2000) {
            cijena += 50;
        }

        return cijena;
    }

    // Ispisujemo podatke 
    public void ispisiPodatke() {
        System.out.println("Proizvođač: " + getProizvodjac());
        System.out.println("Godina proizvodnje: " + getGodinaProizvodnje());
        System.out.println("Kubikaža: " + getKubikaza());
        System.out.println("Boja: " + getBoja());
        System.out.println("Cijena: " + izracunajCijenu() + " EUR");
    }
}


	


