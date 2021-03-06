import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// classe 5- Tonia Fioretto, Simone Carrella, Paolo Labriola, Pasquale Meo

		/*
		 * Creare una classe Main con metodo main in cui implementare il seguente
		 * programma: Creare una lista dei desideri vuota e chiedere all’utente di
		 * aggiungere i suoi desideri uno alla volta, fino a che sceglie di fermarsi.
		 * Ogni volta che viene aggiunto un desiderio stampare a video quanti desideri
		 * sono contenuti nella lista in quel momento. Al termine dell’inserimento
		 * stampare a video la lista ordinata. …poi, visto che siamo buoni ma non
		 * buonissimi, possiamo anche mettere un limite a quanti desideri può inserire
		 * una persona
		 */
		
		Scanner sc = new Scanner(System.in);
		boolean flag =false;
		String conferma;
		
		//creo lista vuota
		List<String> listaDesideri = new ArrayList<String>(3);
		
		
		do {
			System.out.println("inserisci desiderio");
			listaDesideri.add(sc.nextLine());
			System.out.println("la lista contiene: " + listaDesideri.size() + "desideri.");
			
			//ho deciso che la lista puo contenere tre desideri mettendo il 3 nelle parentesi dell inizializzazione
			if(listaDesideri.size() == 3)
				flag = true; 
			
			else {
				do {
					System.out.println("vuoi inserire un nuovo desiderio?");
					conferma = sc.nextLine();

					if (!conferma.equalsIgnoreCase("si") && !conferma.equalsIgnoreCase("no"))
						System.out.println("rispondi solo si o no.");

				} while (!conferma.equalsIgnoreCase("no") && !conferma.equalsIgnoreCase("si"));
				if (conferma.equalsIgnoreCase("no"))
					flag = true;
			}
			
		}while(!flag);
		
		Collections.sort(listaDesideri);
		System.out.println(listaDesideri);
		
		}
	
	}


