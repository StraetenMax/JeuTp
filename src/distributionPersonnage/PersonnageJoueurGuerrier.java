package distributionPersonnage;

public class PersonnageJoueurGuerrier extends PersonnageJoueur {
		//attributs - propriétés
		private int force;
		private int niveauEnergie;
		private boolean fatigue;
		
		//constructeur vide
		public PersonnageJoueurGuerrier(){
			super();
			force= 0;
			niveauEnergie = 0;
			fatigue = true;
			System.out.println("Je suis le personnage G");
		}
		
		//constructeur initialisé
		public PersonnageJoueurGuerrier(String cRace, int cTaille, int cPoids, String cNom, int cForce, int cNiveauEnergie,boolean cFatigue){
			super(cRace,cTaille,cPoids,cNom);
			force = cForce;
			niveauEnergie = cNiveauEnergie;
			fatigue = cFatigue;
			System.out.println("Je suis le personnage Guerrier");
		}
}
