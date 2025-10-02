package Televizor;

public class Mainklasa {
	public static void main(String[] args) {
	Televizor tv = new Televizor(5, "National Geographic", 7);

    tv.ispisi();

    tv.pojacajTon();
    System.out.println("\nNakon pojacavanja tona:");
    tv.ispisi();

    tv.setNazivKanala("Rtcg");
    tv.setBrojKanala(4);
    tv.setJacinaTona(2);

    System.out.println("\nNakon promjene kanala i jacine tona:");
    tv.ispisi();
}
}
