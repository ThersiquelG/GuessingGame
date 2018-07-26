package myPackage;

import java.util.Scanner;

public class Game {
	
	//Method pour convertir String "S" en un tableau de charact�re
		char[] motVersTab(String s) {
			int taille = s.length();
			char[] Tab = new char[taille];
			for(int i = 0 ; i<taille; i++) {
				Tab[i] = s.charAt(i);
			}
			return Tab;
		}

		/* method pour changer le tableau du mot � trouv� en '?'
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

		//mise � jour du tableau de boolean
		boolean[] metAjour(char[] mot, boolean[] vu, char c) {
			for(int i = 0; i< mot.length; i++) {
				if(mot[i] == c) {
					vu[i] = true;
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
		
		//Partie
		
		void partie(String mot) {
			
			//Tableau de booleans �quivalent � la longueur du tableau de notre mot
			boolean[] vu = new boolean[motVersTab(mot).length];
			
			//Appel de la method pour afficher notre mot cach�
			affiche(motVersTab(mot), vu);
			
			
			//boucle while qui se termine lorsque la method partieFinie renvoie true
			while(partieFinie(vu) == false ) {
				
				//Cr�ation d'un scanner pour que l'utilisateur puisse entrer une lettre
				Scanner inputLetter = new Scanner(System.in);
				System.out.println("\nVeuillez taper un caract�re");
				String userLetter = inputLetter.nextLine();
				
				char c = userLetter.charAt(0);
				
				//Appel de la method metAjour pour actaliser notre tableau de booleans
				metAjour(motVersTab(mot), vu, c);
				
				//Appel de la method pour afficher notre mot cach�(et le garder actualis� en rapport avec l'input de l'utilisateur
				affiche(motVersTab(mot), vu);
				
				
				//Si la method partieFinie renvoie true, alors la boucle s'arr�te
				if (partieFinie(vu))
				{	
					//afficher un message pour indiquer � l'utilisateur que la partie est finie
					System.out.println("\nMerci d'avoir jouer ! :^)");
				}
				
			}
		}
}
