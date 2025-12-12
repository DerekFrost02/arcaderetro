import java.util.Scanner;

import service.ArcadeRetroService;

public class ArcadeRetroApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scammer = new Scanner(System.in);
		boolean isInLoop = true;
		ArcadeRetroService gameService = new ArcadeRetroService();
		
		while(isInLoop)
		{
			
			System.out.println("1) Aggiungi un gioco in arcade ");
			System.out.println("2) Visualizza la lista di giochi completa ");
			System.out.println("3) Cerca un gioco per una parola chiave nel nome ");
			System.out.println("4) Visualizza solo i giochi con difficolta almeno di 4");
			System.out.println("5) Esci dal menu principale ");
			
			int choose = scammer.nextInt();
			scammer.nextLine();
			
			switch(choose)
			{
			case 1:
				System.out.println("Inserisci nome del gioco: ");
				String nome = scammer.nextLine();
				
				System.out.println("Inserisci anno di uscita del gioco: ");
				int anno = scammer.nextInt();
				scammer.nextLine();
				
				System.out.println("Inserisci livello di difficolta: ");
				int dif = scammer.nextInt();
				scammer.nextLine();
				
				gameService.addGame(nome, anno, dif);
				
				break;
				
			case 2: 
				System.out.println("Visualizza lista: ");
				gameService.printGameList();
			
				break;
			case 3: 
				isInLoop = false;
				break;
			}
			System.out.println();
		}
		
	}

}
