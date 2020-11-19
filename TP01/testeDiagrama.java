/*						AULA ASSINCRONA 12/11 - LP2I4

	KAUÊ DE JESUS LIVIO CB3005461 E PEDRO PAULO DOS REIS FARIA CB3007278
	
*/

public class testeDiagrama{
	public static void main(String[] args){
		
		Student Kaue = new Student("Kaue Livio", "Rua dos Alfeneiros", "ADS", 2016, 0);
		Staff Pedro = new Staff("Pedro Paulo", "Rua Frei Vital", "IFSP - Cubatao", 500000);
		
		System.out.println("Nome  = " + Kaue.getName());
		System.out.println("Ender = " + Kaue.getAddress());
		System.out.println("Curso = " + Kaue.getProgram());
		System.out.println("Ano   = " + Kaue.getYear());
		System.out.println("Taxa  = " + Kaue.getFee());
		
		Kaue.setAddress("Rua Alameda Espirito Santo");
		Kaue.setProgram("ADS");
		Kaue.setYear(2045);
		Kaue.setFee(32);
		
		System.out.println("Nome  = " + Kaue.getName());
		System.out.println("Ender = " + Kaue.getAddress());
		System.out.println("Curso = " + Kaue.getProgram());
		System.out.println("Ano   = " + Kaue.getYear());
		System.out.println("Taxa  = " + Kaue.getFee());
		
		System.out.println("Nome  = " + Pedro.getName());
		System.out.println("Ender = " + Pedro.getAddress());
		System.out.println("Escola= " + Pedro.getSchool());
		System.out.println("Salar = " + Pedro.getPay());
		
		Pedro.setAddress("Av. Paulista");
		Pedro.setSchool("Unip");
		Pedro.setPay(526);
		
		System.out.println("Nome  = " + Pedro.getName());
		System.out.println("Ender = " + Pedro.getAddress());
		System.out.println("Escola= " + Pedro.getSchool());
		System.out.println("Salar = " + Pedro.getPay());
	}
}