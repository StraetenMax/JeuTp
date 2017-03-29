package distributionPersonnage;

public class Personnage {
	//Attributs
	private String race;
	private int taille, poids;
	
	//constructeur
	public Personnage(){
		race = "";
		taille = 0;
		poids = 0;
		System.out.println("Le personnage vide");
	}
	
	//contructeur initialisé
	public Personnage(String cRace, int cTaille, int cPoids){
		race = cRace;
		taille = cTaille;
		poids = cPoids;
		System.out.println("Le personnage initialié");
	}
}
