package co.simplon.towns;

public class Capitale extends Ville {
	private String monument;
	
	public Capitale(String nom, String pays, int nb, String monument) {
		super(nom,pays,nb);
		this.monument = monument;
	}
	public String getMonument() {
		return monument;
	}
	public void setMonument(String monument) {
		this.monument = monument;
	}
	public String toString() {
    	return "" + this.getMonument() + super.toString();
	}
}
