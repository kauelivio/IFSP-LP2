/*						AULA ASSINCRONA 12/11 - LP2I4

	KAUÊ DE JESUS LIVIO CB3005461 E PEDRO PAULO DOS REIS FARIA CB3007278
	
*/

public class Author{
	
	//Atributos
	private String name;
	private String email;
	private char gender;
	
	//Metodos
	Author(String name, String email, char gender){
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	
	public String getName(){
		return name;
	}
	
	public String getEmail(){
		return email;
	}
	
	public char getGender(){
		return gender;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	
	public String toString(){
		return "Author[name = " + name + ", email = " + email + ", gender = " + gender + "]";
	}
}