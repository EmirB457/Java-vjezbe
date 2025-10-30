package Invididualno;
public class Automobil extends Vozilo { // nasledjuje klasu vozilo i ima pristup njenim atributima i metodama
    private int brojVrata; //dodajemo atribute brojVrata i TipMotora ostalo sve nasledjujemo iz klase vozilo
    private String tipMotora;

    public Automobil(String proizvodjac, int godinaProizvodnje, int kubikaza, String boja,
                     int brojVrata, String tipMotora) {
        super(proizvodjac, godinaProizvodnje, kubikaza, boja); // pozivamo konstruktor iz klase vozilo 
        this.brojVrata = brojVrata;
        this.tipMotora = tipMotora;
    }

    public int getBrojVrata() { return brojVrata; }
    public void setBrojVrata(int brojVrata) { this.brojVrata = brojVrata; }

    public String getTipMotora() { return tipMotora; }
    public void setTipMotora(String tipMotora) { this.tipMotora = tipMotora; }

    @Override // nadjacava metodu iz klase vozilo
    public double izracunajCijenu() { //ako je tip motora "dizel" povecavamo cijenu za 20e
        double cijena = super.izracunajCijenu();
        if (getTipMotora().equalsIgnoreCase("dizel")) {
            cijena += 20;
        }
        return cijena;
    }

    @Override
    public void ispisiPodatke() {
        super.ispisiPodatke();
        System.out.println("Broj vrata: " + getBrojVrata());
        System.out.println("Tip motora: " + getTipMotora());
    }
}




