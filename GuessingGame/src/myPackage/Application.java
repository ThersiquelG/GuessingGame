package myPackage;

public class Application {
	static Game Game1 = new Game();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("La partie commence !");
		
		boolean[] vu = new boolean[Game1.motVersTab("Dragon").length];
		
		Game1.affiche(Game1.motVersTab("Dragon"), vu);
		 
	}

}
