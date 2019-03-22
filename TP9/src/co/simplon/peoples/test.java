package co.simplon.peoples;

import co.simplon.towns.Ville;

public class test {
	   public static void main(String[] args) {
		   Employe e1 = new Employe("sebastien","blaizot",40," 29 lotissement  montgiscard",new Ville ("paris" ,"france",10000),"mcDo",3000);
		   Employe e2 = new Employe("franck","dubosc",45,"30 chemin du padrole",new Ville("ploucland","france",10000),"koumik",20000);
		   Employe e3 = new Employe("grand", "schtroumpf",80,"10 rue AB production", new Ville("schtroumpfland","magicland",200),"boss",100);
		   Employe monTableau[ ] = new Employe[3];
		   
		   monTableau[0] = new Employe("dupont","henri",51,"3 rue des rosiers à Nice",new Ville("Lille :","france :",1978),"McDO",2000);
		   
		   
		   for (int i = 0; i < monTableau.length; i++) {
			    System.out.println(monTableau[i]);
		   
		   
		   System.out.println(e1);
	   }
}
}