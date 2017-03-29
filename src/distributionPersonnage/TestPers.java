package distributionPersonnage;

public class TestPers {

	public static void main(String[] args) {
		//class Personnage
		Personnage personnage = new Personnage();
		Personnage personnage1 = new Personnage("humain", 180,80);
		personnage1.personnageMarche();
		personnage.personnageDors();
		personnage1.description();
		System.out.println(personnage1.description1());
		System.out.println(personnage1.getPoids());
		System.out.println(personnage1.getTaille());
		
		//class PersonnageJoueur
		PersonnageJoueur persJ1 = new PersonnageJoueur();
		PersonnageJoueur persJ2 = new PersonnageJoueur("Géant", 218, 180, "Paul");
		System.out.println(persJ2.getNom());
		System.out.println(persJ2.getTaille()+" cm");
		PersonnageJoueur persJ3 = new PersonnageJoueur("Geant",218,180,"Paul");
		persJ3.persJoueurMarche();
		System.out.println(persJ3.persdescription1());
	
		//class PersonnageJoueurGuerrier
	PersonnageJoueurGuerrier p1 = new PersonnageJoueurGuerrier();
	PersonnageJoueurGuerrier p2 = new PersonnageJoueurGuerrier("Grand", 300, 200,"Pierre", 30,30,true);
	
	}

}
