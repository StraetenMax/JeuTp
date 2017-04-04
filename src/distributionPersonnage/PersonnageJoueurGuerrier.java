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
		
		public boolean estMoinsFortQue(PersonnageJoueurGuerrier pJG1){
			 boolean personnageJoueurGuerrierEstMoinsFortQue = true;
			if(pJG1.getForce()< this.getForce()){
				personnageJoueurGuerrierEstMoinsFortQue = true;
			}else{
				personnageJoueurGuerrierEstMoinsFortQue = false;
			}
			return personnageJoueurGuerrierEstMoinsFortQue;
		}
			
}
