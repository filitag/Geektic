package model;


public class Geek {

	/**
	 * @param args
	 */
	private int id;
	private String pseudo;
	private int age;
	private String sexe;
	private String hobbie;
	private int cpt_id=0;
	
	public Geek(String pseudonyme,int age,String interet)
	{
		setId(cpt_id++);
		pseudonyme = this.pseudo;
		age = this.age;		
		interet = this.hobbie;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getHobbie() {
		return hobbie;
	}

	public void setHobbie(String hobbie) {
		this.hobbie = hobbie;
	}

	
	

}
