/*						AULA ASSINCRONA 12/11 - LP2I4

	KAUÊ DE JESUS LIVIO CB3005461 E PEDRO PAULO DOS REIS FARIA CB3007278
	
*/

public class Book{
	
	//Atributos
	private String name;
	private Author[] authors;
	private double price;
	private int qty = 0;
	
	//Metodos
	public Book(String name, Author[] authors, double price){
		this.name = name;
		this.authors = authors;
		this.price = price;
	}
	
	public Book(String name, Author[] authors, double price, int qty){
		this.name = name;
		this.authors = authors;
		this.price = price;
		this.qty = qty;
	}
	
	public String getName(){
		return name;
	}
	
	public String getAuthors(){
		
		String text = "";
		
		for(int i = 0; i < authors.length; i++){
			text += authors[i].toString();
		}
		
		return text;
		
	}
	
	public double getPrice(){
		return price;
	}
	
	public void setPrice(double price){
		this.price = price;
	}
	
	public int getQty(){
		return qty;
	}
	
	public void setQty(int qty){
		this.qty = qty;
	}
	
	public String toString(){
		
		String text = "{";
		
		for(int i = 0; i < authors.length; i++){
			text += authors[i].toString();
		}
		text += "}";
		
		return "Book[name = " + name + ", Authors =" + text + ", price = " + price + ", qty = " + qty + "]";
	}
	
	public String getAuthorNames(){
		String text = "";
		
		for(int i = 0; i < authors.length; i++){
			text += authors[i].getName() + " - ";
		}
		
		return text;
	}
	
	
	
}