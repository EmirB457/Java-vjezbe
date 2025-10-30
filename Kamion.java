package Invididualno;

public class Kamion extends Vozilo {  // nasledjuje klasu vozilo i ima pristup njenim atributima i metodama
    private int kapacitetTereta; // dodajemo atribute kapacitetTereta i prikolica koristimo boolean za prikolicu jer moze imati ili ne
    private boolean prikolica;

    public Kamion(String proizvodjac, int godinaProizvodnje, int kubikaza, String boja, // ovo je konstruktor za klasu kamion,nasledjujemo klasu vozilo zbog toga sto koristimo super
                  int kapacitetTereta, boolean prikolica) {
        super(proizvodjac, godinaProizvodnje, kubikaza, boja); // pozivamo konstruktor iz klase vozilo i dodajemo nove atribute za kamion
        this.kapacitetTereta = kapacitetTereta;
        this.prikolica = prikolica;
    }

    public int getKapacitetTereta() { return kapacitetTereta; }
    public void setKapacitetTereta(int kapacitetTereta) { this.kapacitetTereta = kapacitetTereta; }

    public boolean isPrikolica() { return prikolica; }
    public void setPrikolica(boolean prikolica) { this.prikolica = prikolica; }

    @Override
    public double izracunajCijenu() { //ako kamion ima prikolicu cijenu uvecavamo za 50e
        double cijena = super.izracunajCijenu();
        if (prikolica) {
            cijena += 50;
        }
        return cijena;
    }

    @Override // nadjacava metodu iz klase vozilo
    public void ispisiPodatke() {
        super.ispisiPodatke();
        System.out.println("Kapacitet tereta: " + kapacitetTereta);
        System.out.println("Prikolica: " + (prikolica ? "Da" : "Ne"));
    }
}



