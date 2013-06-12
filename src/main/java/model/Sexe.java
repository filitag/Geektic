package model;

public enum Sexe {
	F("Femme"),
	H("Homme");
	
		    
	private String name = "";
		    
	//Constructeur
	Sexe(String name){
		this.name = name;
	}
		    
		  public String toString(){
		    return name;
		  }
}

