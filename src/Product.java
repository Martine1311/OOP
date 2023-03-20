
public class Product {
	
	public String name;
	public int voorraad;
	public boolean aanbieding;
	public double prijs;
	
	public Product() {
		System.out.println("In constructor");
	}
	
	public Product(String name) {
		this.name = name;
	}
	
	public Product(int voorraad) {
		this.voorraad = voorraad;
	}
	
	public Product(String name, int voorraad, boolean aanbieding, double prijs) {
		this.name = name;
		this.voorraad = voorraad;
		this.aanbieding = aanbieding;
		this.prijs = prijs;
	}
	
	public void printName() {
		System.out.println("Naam is " + name);
	} 
	
	public void printVoorraad() {
		System.out.println("Er zijn " + voorraad + " stuks op voorraad.");
	}
	
	public void printAanbieding() {
		System.out.println("Dit product is in de aanbieding: " + aanbieding);
	}
	
	public void printPrijs() {
		System.out.println("De prijs is €" + prijs);
	}
	
	public void stelNaamIn(String name) {
		this.name=name;
	}
	
	public void stelVoorraadIn(int voorraad) {
		this.voorraad = voorraad;
	}
	
	public void stelAanbiedingIn(boolean aanbieding) {
		this.aanbieding = aanbieding;
	}
	
	public void stelPrijsIn(double prijs) {
		this.prijs = prijs;
	}
	
	public String watIsJouwNaam() {
		return name;
	}
	
	public int watIsJouwVoorraad() {
		return voorraad;
	}
	
	public boolean benJijInDeAanbieding() {
		return aanbieding;
	}
	
	public double watIsJouwPrijs() {
		return prijs;
	}
}
