package modele;

import java.lang.reflect.Array;

public class Bateau {
	public class Bateau {
	private String nom;
	private int unites;
	private boolean enVie;
	private int[] position;
	
	public Bateau(String nom, int unites) {
		this.nom = nom;
		this.unites = unites;
		enVie = true;
		position = new int[unites];
	}
	
	public boolean isEnVie() {
		return enVie;
	}
	public void setEnVie(boolean enVie) {
		this.enVie = enVie;
	}
	
	public int[] getPosition() {
		return position;
	}
	
	public void setPosition(int[] position) {
		this.position = position;
	}
	
	public String getNom() {
		return nom;
	}
	
	public int getUnites() {
		return unites;
	}

	Bateau bateau1 = new Bateau("bateau patrouille", 2);
	Bateau bateau2 = new Bateau("sous-marin", 3);
	Bateau bateau3 = new Bateau("destroyer", 3);
	Bateau bateau4 = new Bateau("porte avion", 4);
}
}
