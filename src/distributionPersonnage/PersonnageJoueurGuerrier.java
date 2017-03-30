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
		
		public int getForce(){
			return force;
		}
		
		public int getNiveauEnergie(){
			return niveauEnergie;	
		}
		
		public boolean getFatigue(){
			return fatigue;
		}
		public void setForce(int cForce){
			force = cForce;
		}
		public void setNiveau(int cNiveauEnergie){
			niveauEnergie = cNiveauEnergie;
		}
		public void estMoinsFortQue(int nForce){
			if(force< nForce){
				System.out.println("dont la force" );
			}else{
				System.out.println("ddd est la force");
			}
		}
}
