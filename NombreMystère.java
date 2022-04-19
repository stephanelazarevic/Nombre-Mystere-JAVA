package MonPackage;
 
public class NombreMyst�re 
{

	public static void main(String[] args) 
	{ 
		
		// D�claration des variables
		
		String J1, J2;
		double NbS, Rep;
		int NbC;
		
		// Saisie par l'utilisateur
		
		System.out.println("Bienvenue dans le jeu myst�re");
		J1 = Saisie.lire_String("Veuillez saisir le nom du joueur 1");
		J2 = Saisie.lire_String("Veuillez saisir le nom du joueur 2");
		
		// Traitement  
		
		do 
		{ 
			NbS = Saisie.lire_double(J1 + " veuillez saisir un nombre compris entre 1 et 100 (1 et 100 y compris)");
		} while (NbS < 1 || NbS > 100); 
		
		NbC = 0;
		System.out.println(J2 + " vous avez 10 essais pour retrouver le nombre myst�re");
		 
		for (NbC = 1; NbC <=10; NbC++) 
		{
			Rep = Saisie.lire_double(J2 + " quel est le nombre myst�re selon vous ?");
			while (Rep < 1 || Rep > 100) 
			{
				Rep = Saisie.lire_double("Erreur, veuillez saisir un nombre compris entre 1 et 100 (1 et 100 y compris)");
			}
			if (Rep < NbS)
			{
				System.out.println("Trop bas !");
			}
			else if (Rep > NbS)
			{
				System.out.println("Trop haut !");
			}
			else 
			{
				System.out.println("Gagn� ! Bravo, vous avez trouv� le nombre myst�re en " + NbC + " coups");
				break;
			}
			
		}
		
		// Affichage r�sultat
		
		System.out.println("C'est termin� !");
		
	}
}
