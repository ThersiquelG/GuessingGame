package myPackage;

public class Game {
	
	//Method pour convertir String "S" en un tableau de charactère
	char[] motVersTab(String s) {
		char[] Tab = s.toCharArray();
		return Tab;
	}
	
	/* method pour changer le tableau du mot à trouvé en '?'
	 * via un tableau de boolean
	 */
	void affiche(char[] mot, boolean[] vu) {
		for(int i = 0; i<=5 ; i++) {
			if(vu[i] == false) {
				mot[i] = '?';
			}
		}
	  System.out.print(mot);
	
	}
	
	//mise à jour du tableau de boolean
	boolean[] metAjour(char[] mot, boolean[] vu, char c) {
		for(int i = 0; i<= 5; i++) {
			if(mot[i] == c) {
				vu[i] = true;
			}
		}
		
		return vu;
	}
	
	//Fin de partie
	boolean partieFinie(boolean vu[]) {
		for(int i = 0; i<= 5; i++) {
			if(vu[i] == true) {
				return true;
			}
		}
		return false;
	}
	
	
	
	
}
