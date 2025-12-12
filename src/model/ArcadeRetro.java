package model;

public class ArcadeRetro 
{
	private String nome;
	private int anno;
	private int difficolta;
	
	public ArcadeRetro(String nome, int anno, int difficolta) {
		super();
		this.nome = nome;
		this.anno = anno;
		this.difficolta = difficolta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}

	public int getDifficolta() {
		return difficolta;
	}

	public void setDifficolta(int difficolta) {
		this.difficolta = difficolta;
	}

	@Override
	public String toString() {
		return "ArcadeRetro [nome = " + nome + ", anno = " + anno + ", difficolta = " + difficolta + "]";
	}
	
	
	

}
