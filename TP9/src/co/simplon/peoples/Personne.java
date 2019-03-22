package co.simplon.peoples;

import co.simplon.towns.Ville;

public class Personne {
	String nom ;
	String prenom ;
	int age ;
	String adresse ;
    Ville VilleNaissance ;
	

	public  void personne() {
		nom = " ";
		prenom = " ";
		age = 0 ;
		adresse = " ";  
		VilleNaissance = new Ville("rien","rien",0) ;
		
	}

	public Personne(String n, String p , int a , String adr, Ville vdn, String entreprise) {
		super();
		nom = n ;
		prenom = p ;
		age = a ;
		adresse = adr ;
		VilleNaissance = vdn ;
	   
	} 


	public void display() {
		System.out.println("<"+nom+" "+prenom+" "+age+"ans"+" "+"habitant"+" "+
	adresse);
		VilleNaissance.display();
		
		
	}
}
