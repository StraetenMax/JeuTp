package distributionPersonnage;

public class PersonnageJoueur extends Personnage {
		//attribut /propriété
	private String nom;

		//constructeur
	public PersonnageJoueur(){
		super();
		nom ="";
		System.out.println("Je suis le personnage Joueur");
	}
	 //constructeur initialisé
	public PersonnageJoueur(String cRace, int cTaille, int cPoids, String cNom){
		super(cRace, cTaille, cPoids);
		nom = cNom;
		System.out.println("Le personnage joueur est là");
	}
	public String getNom(){
		return nom;
	}
	public void setNom(String nom){
		this.nom = nom;
	}

	public void persJoueurMarche(){
		System.out.println("le personnage joueur marche");
	}

	public String persdescription1(){
		String des = (super.description1()+" et s'appelle "+this.getNom());
		return des;
				
	}
	
	
	
}
