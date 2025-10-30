package Invididualno;

public class VozilaMain { // glavna klasa sa main metodom 
    public static void main(String[] args) {
        Vozilo[] vozila = new Vozilo[4]; // niz vozila koji moze da sadrzi 4 objekta tipa vozilo,automobil,kamion ili kombi

        vozila[0] = new Automobil("Audi", 2015, 2000, "Crna", 4, "dizel"); 
        vozila[1] = new Kamion("MAN", 1998, 5000, "Bijela", 10000, true);
        vozila[2] = new Kombi("Mercedes", 2018, 2200, "Siva", 8);
        vozila[3] = new Automobil("Fiat", 2005, 1400, "Plava", 2, "benzin");

        double ukupnaCijena = 0;

        System.out.println("=== Podaci o vozilima ===");
        for (Vozilo v : vozila) {
            v.ispisiPodatke();
            System.out.println("------------------------");
            ukupnaCijena += v.izracunajCijenu();
        }

        System.out.println("Ukupna cijena svih vozila: " + ukupnaCijena + " EUR");

        System.out.println("\n=== Filtrirani podaci ===");
        filtriraj(vozila);
    }

    public static void filtriraj(Vozilo[] vozila) {
        for (Vozilo v : vozila) {
            System.out.println("Klasa: " + v.getClass().getSimpleName());
            System.out.println("Proizvođač: " + v.getProizvodjac());
            System.out.println("Cijena: " + v.izracunajCijenu() + " EUR");
            System.out.println("------------------------");
        }
    }


	
		

	}


