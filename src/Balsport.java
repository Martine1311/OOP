
public abstract class Balsport {
	
	public String sportnaam;
	public String teamnaam;
	public int aantalTeamleden;
	public boolean zaalsport;
	
	public void printSportnaam() {
		System.out.println("De sport is: " + sportnaam);
	} 
	
	public void printTeamnaam() {
		System.out.println("De teamnaam is: " + teamnaam);
	}
	
	public void printTeamleden() {
		System.out.println("Het aantal teamleden is: " + aantalTeamleden);
	}
	
	public void printZaalsport() {
		System.out.println("Dit is een zaalsportteam: " + zaalsport);
	}
	
	public abstract void printEindscore(String score);
	
	public abstract void soortVeld();
}
