package co.simplon.peoples;

import co.simplon.towns.Ville;

public class Employe extends Personne{
	private String entreprise;
	private double salaire;
	
	
	
	

	public Employe(String n, String p, int a, String adr, Ville vdn, String entreprise, double salaire) {
		super(n, p, a, adr, vdn, entreprise);
		this.entreprise = entreprise ;
		this.salaire = salaire ;
		
		// TODO Auto-generated constructor stub
	}
	public String getEntreprise() {
		return entreprise;
	}
	public void setEntreprise(String entreprise) {
		this.entreprise=entreprise;
	}
	public double getSalaire() {
		return salaire;
	}
	public void setSalaire(double salaire) {
		this.salaire=salaire;
	}
    public String getNom() {
    	return nom;
    }
    public void setNom(String nom) {
    	this.nom=nom;
    }
    public String getPrenom() {
    	return prenom;
    }
    public void setPrenom(String prenom) {
    	this.prenom=prenom;
    }
    public int getAge() {
    	return age;
    }
    public void setAge( int age) {
    	this.age=age;
    }
    public String getAdresse() {
    	return adresse;
    	}
    public void setAdresse(String adresse) {
    	this.adresse=adresse;
    }
    
    public String toString() {
    	return "" +this.getNom()+" "+this.getPrenom()+" "+this.getAge()+" "+this.getAdresse()+" "+ this.getEntreprise()+" "+this.getSalaire() +" "+"?? :"+ super.toString();
    }
    
    
    
}
