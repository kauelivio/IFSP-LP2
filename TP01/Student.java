/*						AULA ASSINCRONA 12/11 - LP2I4

	KAUÊ DE JESUS LIVIO CB3005461 E PEDRO PAULO DOS REIS FARIA CB3007278
	
*/

public class Student extends Person{
	
	//Atributos
	private String program;
	private int year;
	private double fee;
	
	//Metodos
	public Student(String name, String address, String program, int year, double fee){
		super(name, address);
		this.program = program;
		this.year = year;
		this.fee = fee;
	}
	
	public String getProgram(){
		return program;
	}
	
	public void setProgram(String program){
		this.program = program;
	}
	
	public int getYear(){
		return year;
	}
	
	public void setYear(int year){
		this.year = year;
	}
	
	public double getFee(){
		return fee;
	}
	
	public void setFee(double fee){
		this.fee = fee;
	}
	
	public String toString(){
	return "Student[Person[" + name + ", address = " + address + "], program = " + program + ", year = " + year + ", fee = " + fee + "]";
	}
}