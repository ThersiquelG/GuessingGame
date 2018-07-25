package myPackage;
import java.util.Scanner;
public class Application {
	static Game Game1 = new Game();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("La partie commence !");
		
		boolean[] vu = new boolean[Game1.motVersTab("Dragon").length];
		
		Game1.affiche(Game1.motVersTab("Dragon"), vu);
		Scanner sc = new Scanner(System.in);
		char c = sc.nextLine().charAt(0);
		Game1.metAjour(Game1.motVersTab("Dragon"), vu, c);
		
		
		
		 
	}

}
