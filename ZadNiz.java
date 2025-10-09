package Niz;
import java.util.Scanner;
public class ZadNiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		        Scanner unos = new Scanner(System.in);

		        // Unos dužine niza
		        System.out.print("Unesite duzinu niza: ");
		        int n = unos.nextInt();

		        int[] bodovi = new int[n];

		        // Unos elemenata niza
		        System.out.println("Unesite " + n + " elemenata (broj bodova):");
		        for (int i = 0; i < n; i++) {
		            bodovi[i] = unos.nextInt();
		        }

		        // Izračun prosječnog broja bodova
		        double suma = 0;
		        for (int i = 0; i < n; i++) {
		            suma += bodovi[i];
		        }
		        double prosjek = suma / n;

		        // Pronalaženje najmanjeg elementa i njegovog indeksa
		        int min = bodovi[0];
		        int indeksMin = 0;
		        for (int i = 1; i < n; i++) {
		            if (bodovi[i] < min) {
		                min = bodovi[i];
		                indeksMin = i;
		            }
		        }

		        // Ispis rezultata
		        System.out.println("\nProsjecan broj bodova: " + prosjek);
		        System.out.println("Najmanji element u nizu: " + min);
		        System.out.println("Indeks najmanjeg elementa: " + indeksMin);

		        unos.close();
		    }
		

	}


