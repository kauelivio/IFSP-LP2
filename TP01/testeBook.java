/*						AULA ASSINCRONA 12/11 - LP2I4

	KAUÊ DE JESUS LIVIO CB3005461 E PEDRO PAULO DOS REIS FARIA CB3007278
	
*/

public class testeBook{
	public static void main(String[] args){
		
		Author[] autores = new Author[2];
		autores[0] = new Author("Pedrinho", "pedro@gmail.com", 'm');
		autores[1] = new Author("Kauezinho", "kaue@gmail.com", 'm');
		
		Book Cirandinha = new Book("Ciranda", autores , 19);
		
		Book Cirandao = new Book("Ciranda", autores , 19, 52);
		
		System.out.println("Getters");
		System.out.println("Nome    = " + Cirandinha.getName());
		System.out.println("Autores = " + Cirandinha.getAuthors());
		System.out.println("Preco   = " + Cirandinha.getPrice());
		System.out.println("Qty     = " + Cirandinha.getQty());

		System.out.println();
		System.out.println("Setters");
		
		Cirandinha.setPrice(50);
		System.out.println("Preco  = " + Cirandinha.getPrice());
		Cirandao.setQty(789);
		System.out.println("Qty    = " + Cirandinha.getQty());

		
		System.out.println();
		System.out.println("Metodos");
		System.out.println(Cirandinha.toString());
		
	}
	
}