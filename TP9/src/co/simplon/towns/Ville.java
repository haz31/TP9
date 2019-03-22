package co.simplon.towns;

public class Ville {
	private String nom; //nom de la ville
	private String pays; // nom du pays
	private int nbHabitants; //nombre d'habitants
	private static int nbInstance = 0;

	public Ville() {
		nom = " ";
		pays = " ";
		nbHabitants = 0;
		nbInstance++;
	}

	public Ville(String n, String p, int nb) {
		nom = n ;
		pays = p ;
		nbHabitants = nb;
		nbInstance++;
	}

	public void setNom(String n) {
		nom = n;
	}
	public String getNom() {
		return nom;
	}
	public void setPays(String p) {
		pays = p;
	}
	public String getPays() {
		return pays;
	}
	public void setNbHabitants(int nb) {
		if(nb < 0 ) {
			nbHabitants = 0;
			System.out.println("Valeur érroné");
		}
		else nbHabitants = nb;
	}
	public int getNbHabitants() {
		return nbHabitants;
	}
	public static int getNbInstance(){return nbInstance;}

	//public void display() {
		//System.out.println("Ville de: "+ getNom() +" en "+ getPays() +" avec "+ getNbHabitants()+" habitants");
	public String toString() {
    	return " " + this.nom + " " + this.pays +" " + this.getNbHabitants() ;
	}

	public void display() {
		// TODO Auto-generated method stub
		
	}
}





