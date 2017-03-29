package distributionPersonnage;

public class TestPers {

	public static void main(String[] args) {
		Personnage personnage = new Personnage();
		Personnage personnage1 = new Personnage("humain", 180,80);
		personnage1.personnageMarche();
		personnage.personnageDors();
		personnage1.description();
		System.out.println(personnage1.description1());
	}

}
