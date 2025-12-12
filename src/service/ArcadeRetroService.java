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
	

}
