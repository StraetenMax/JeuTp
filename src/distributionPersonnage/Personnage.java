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
	
	public void personnageMarche(){
		System.out.println("Le personnage marche");
	}
	
	public void personnageDors(){
		System.out.println("Le personnage dors");
	}
	
	public void description(){
		System.out.println("Le personnage de race "+race+", mesure "+taille+" mm et pèse "+poids+" kg");
	}
	
	
	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public int getTaille() {
		return taille;
	}

	public void setTaille(int taille) {
		this.taille = taille;
	}

	public int getPoids() {
		return poids;
	}

	public void setPoids(int poids) {
		this.poids = poids;
	}
	public String description1(){
		String pers = "Mon personnage "+this.getRace()+" mesure "+this.getTaille()+" mm et pèse "+this.getPoids()+" kg";
		return pers;
	}
	
	
}
