import java.util.List;

public class Application {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		System.out.println("Hello world!");
//		
//		Product p = new Product();
//		p.name = "TV";
//		p.voorraad = 10;
//		p.prijs = 399.99;
//		
//		Product p2 = new Product();
//		p2.name = "Laptop";
//		p2.voorraad = 100;
//		p2.prijs = 899.99;
//		
//		System.out.println(p.name);
//		System.out.println(p2.name);
//		
//		p.printName();
//		p.printVoorraad();
//		p.printPrijs();
//		
//		p2.printName();
//		p2.printVoorraad();
//		p2.printPrijs();
//		
//		// p.stelNaamIn("Wasmachine");
//		// p.printName();
//		
//		Product p3 = new Product();
//		p3.stelNaamIn("Tosti-ijzer");
//		p3.stelVoorraadIn(25);
//		p3.stelAanbiedingIn(true);
//		p3.stelPrijsIn(69.95);
//		
//		p3.printName();
//		p3.printVoorraad();
//		p3.printAanbieding();
//		p3.printPrijs();
//		
//		String productName = p3.watIsJouwNaam();
//		System.out.println("Product naam uit de method is " + productName);
//		int productVoorraad = p3.watIsJouwVoorraad();
//		System.out.println("De voorraad uit de method is " + productVoorraad + " stuks.");
//		boolean productAanbieding = p3.benJijInDeAanbieding();
//		System.out.println("Volgens de method ben ik in de aanbieding: " + productAanbieding);
//		double productPrijs = p3.watIsJouwPrijs();
//		System.out.println("De prijs uit de method is €" + productPrijs);
//		
//		Product p4 = new Product("PC", 11, true, 1599.95);
//		p4.printName();
//		p4.printVoorraad();
//		p4.printAanbieding();
//		p4.printPrijs();
		
//		Dier dier = new Dier();
//		dier.name = "Dier";
		
//		Hond hond = new Hond();
//		hond.name = "Woefje";
//		hond.printName();
//		hond.maakGeluid();
//		
//		Kat kat = new Kat();
//		kat.name = "Poes";
//		kat.printName();
//		kat.maakGeluid();
//		
//		Dier d = new Hond();
//		d.maakGeluid();
//		
//		List<Dier> dieren; //abstract method kan ook over een lijst met verschillende dieren methods uitvoeren
		
		
		
		Volleybal volleybal = new Volleybal();
		volleybal.teamnaam = "volleybal team 1";
		volleybal.aantalTeamleden = 6;
		volleybal.zaalsport = true;
		
		volleybal.printSportnaam();
		volleybal.printTeamnaam();
		volleybal.printTeamleden();
		volleybal.printZaalsport();
		volleybal.printEindscore("21-25");
		volleybal.soortVeld();
		
		Tennis tennis = new Tennis();
		tennis.teamnaam = "Roger Federer";
		tennis.aantalTeamleden = 1;
		tennis.zaalsport = false;
		
		tennis.printSportnaam();
		tennis.printTeamnaam();
		tennis.printTeamleden();
		tennis.printZaalsport();
		tennis.printEindscore("60-30");
		tennis.soortVeld();
		
		Student student1 = new Student();
		student1.setName("Martine");
		student1.setStudentCode(1466917);
		student1.setAverage(8.33);
		System.out.println("Naam van de student is " + student1.getName());
		System.out.println("Studentcode van de student is " + student1.getStudentCode());
		System.out.println("Gemiddelde van de student is " + student1.getAverage());
	}

	
}
