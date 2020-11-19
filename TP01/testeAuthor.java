/*						AULA ASSINCRONA 12/11 - LP2I4

	KAUÊ DE JESUS LIVIO CB3005461 E PEDRO PAULO DOS REIS FARIA CB3007278
	
*/

public class testeAuthor{
	public static void main(String[] args){
		
		Author Pedro = new Author("Pedro Paulo", "pedrinho@gmail.com", 'm');
		
		System.out.println("Getters");
		System.out.println("Nome   = " + Pedro.getName());
		System.out.println("Email  = " + Pedro.getEmail());
		System.out.println("Genero = " + Pedro.getGender());
		
		System.out.println();
		System.out.println("Setters");
		
		Pedro.setEmail("pedrinho@gmail.com");
		System.out.println("Email  = " + Pedro.getEmail());
		
		System.out.println();
		System.out.println("Metodos");
		System.out.println(Pedro.toString());
		
	}
	
}