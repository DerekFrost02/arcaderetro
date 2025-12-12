package service;

import java.util.ArrayList;

import model.ArcadeRetro;

public class ArcadeRetroService {
	
	ArrayList<ArcadeRetro> games = new ArrayList<ArcadeRetro>();
	
	public void addGame(String n, int y, int dif)
	{
		ArcadeRetro retro = new ArcadeRetro(n, y, dif);
		this.games.add(retro);
	}
	
	public void printGameList()
	{
		for(int i = 0; i < this.games.size(); i++)
		{
			System.out.println(this.games.get(i));
		}
	}
	
	public void printDifficultGameList()
	{
		for(int i = 0; i < this.games.size(); i++)
		{
			if(this.games.get(i).getDifficolta() >= 4)
			{
				System.out.println(this.games.get(i));
			}
		}
	}
	
	public void searchGame(String word)
	{
		boolean isThere = false;
		for(int i = 0; i < this.games.size(); i++)
		{
			if(this.games.get(i).getNome().toUpperCase().contains(word.toUpperCase()) == true)
			{
				System.out.println(this.games.get(i));
				isThere = true;
			}
		}	
		if(isThere == false) 
		{
			System.out.println("La lista non contiene il gioco " + word);
		}
	}
	
	public void printMenu()
	{
		System.out.println("1) Aggiungi un gioco in arcade ");
		System.out.println("2) Visualizza la lista di giochi completa ");
		System.out.println("3) Cerca un gioco per una parola chiave nel nome ");
		System.out.println("4) Visualizza solo i giochi con difficolta almeno di 4");
		System.out.println("5) Visualizza solo le scelte del menu");
		System.out.println("6) Esci dal menu principale ");
	}

}
