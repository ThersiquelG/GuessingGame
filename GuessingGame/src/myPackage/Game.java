package myPackage;

public class Game {
	
	//Method pour convertir String "S" en un tableau de charact�re
	char[] motVersTab(String s) {
		char[] Tab = s.toCharArray();
		return Tab;
	}
	
	/* method pour changer le tableau du mot � trouv� en '?'
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
	
	//mise � jour du tableau de boolean
	
}
