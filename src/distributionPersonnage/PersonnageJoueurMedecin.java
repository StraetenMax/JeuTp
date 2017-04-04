package distributionPersonnage;

public class PersonnageJoueurMedecin extends PersonnageJoueur{
	//attribut - propriétés
		private int nbMedicaments;
		
	// constructeurs
		public PersonnageJoueurMedecin(){		
			super();
			nbMedicaments = 0;
			System.out.println("je suis le joueur Médecin");
		}
		
		public PersonnageJoueurMedecin(String pRace, int pTaille, int pPoids, String pNom, int pNbMedicaments){
			super(pRace, pTaille, pPoids, pNom);
			nbMedicaments = pNbMedicaments;
			System.out.println("je suis le joueur Médecin 2");
		}
		public int getNbMedicaments(){
			return nbMedicaments;
		}
		public void setNbMedicaments(int fNbMedicaments){
			nbMedicaments = fNbMedicaments;
		}
}
