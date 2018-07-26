package myPackage;

public class Game {
	//Method pour convertir String "S" en un tableau de charactère
	char[] motVersTab(String s) {
		int taille = s.length();
		char[] Tab = new char[taille];
		for(int i = 0 ; i<taille; i++) {
			Tab[i] = s.charAt(i);
		}
		return Tab;
	}

	/* method pour changer le tableau du mot à trouvé en '?'
	 * via un tableau de boolean
	 */
	void affiche(char[] mot, boolean[] vu) {
		for(int i = 0; i< mot.length ; i++) {
			if(vu[i] == true) {
				System.out.print(mot[i]);
			} else {
				System.out.print('?');
			}
		}
		

	}

	//mise à jour du tableau de boolean
	boolean[] metAjour(char[] mot, boolean[] vu, char c) {
		for(int i = 0; i< mot.length; i++) {
			if(mot[i] == c) {
				vu[i] = true;
			} else {
				vu[i] = false;
			}
		}
		return vu;
	}	

	//Fin de partie
	boolean partieFinie(boolean[] vu) {
		for(int i = 0; i<vu.length;i++) {
			if(vu[i] == false) {
				return false;
			} 
		}	return true;
	}

}

