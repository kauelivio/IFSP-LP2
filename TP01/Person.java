/*						AULA ASSINCRONA 12/11 - LP2I4

	KAUÊ DE JESUS LIVIO CB3005461 E PEDRO PAULO DOS REIS FARIA CB3007278
	
*/

public class Person{
	
	//Atributos
	protected String name;
	protected String address;
	
	//Metodos
	public Person(String name, String address){
		this.name = name;
		this.address = address;
	}
	
	public String getName(){
		return name;
	}
	
	public String getAddress(){
		return address;
	}
	
	public void setAddress(String address){
		this.address = address;
	}
	
	public String toString(){
	return "Person[" + name + ", address = " + address + "]";
	}
}