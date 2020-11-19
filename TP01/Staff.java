/*						AULA ASSINCRONA 12/11 - LP2I4

	KAUÊ DE JESUS LIVIO CB3005461 E PEDRO PAULO DOS REIS FARIA CB3007278
	
*/

public class Staff extends Person{
	
	//Atributos
	private String school;
	private double pay;
	
	//Metodos
	public Staff(String name, String address, String school, double pay){
		super(name, address);
		this.school = school;
		this.pay = pay;
	}
	
	public String getSchool(){
		return school;
	}
	
	public void setSchool(String school){
		this.school = school;
	}
	
	public double getPay(){
		return pay;
	}
	
	public void setPay(double pay){
		this.pay = pay;
	}
	
	public String toString(){
	return "Staff[Person[" + name + ", address = " + address + "], school = " + school + ", pay = " + pay + "]";
	}
}