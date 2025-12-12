import java.util.Scanner;

import service.ArcadeRetroService;

public class ArcadeRetroApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scammer = new Scanner(System.in);
		boolean isInLoop = true;
		ArcadeRetroService gameService = new ArcadeRetroService();
		
		gameService.printMenu();
		
		while(isInLoop)
		{
			System.out.println(" ");
			System.out.println(" Fai una scelta: ");
			
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
				System.out.println("Inserisci la parola nel nome del gioco: ");
				String word = scammer.nextLine();
				gameService.searchGame(word);
				
				break;
				
			case 4: 
				System.out.println("I giochi con difficolta almeno 4 sono: ");
				gameService.printDifficultGameList();
				
				break;
			case 5:
				gameService.printMenu();
				
				break;
				
			case 6:
				isInLoop = false;
				break;
				
			}
			System.out.println(" ");
			
		}
		
		System.out.println(" Sei uscito dal menu ");
		
	}

}
