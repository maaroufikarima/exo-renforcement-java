package pkgMain;

public class Main {

	public static void main(String[] args) {
		int a=10;
		int b=5;
		//Fonctionnement du système try catch
		try {

			//j'affiche un simple msg avant de faire le calcul
			System.out.println("debut try");
			//effectuer une operation qui lance une exception
			int rtat=a/b;
			excecuterActionsMIAN_SUCCES();
			System.out.println("le resultat est ["+rtat+"]");


		} catch (Exception e) {
			//afficher un msg d'erreur
			System.out.println("une erreur a été detectée grace au sys try catch,");
			System.out.println("l'erreur contient["+e.getMessage()+"]");
			System.out.println("le msg complet est["+e.toString()+"]");
			excecuterActionsMAIN_ERROR();
		}
		finally {
			System.out.println("ceci va s'executer meme si on est passé par le catch" );
			excecuterActionsMIAN_ALL_CASES();
			
		}
	}

	//methode qui execute les instructions: dans le cas de success
	private static void excecuterActionsMIAN_SUCCES(){
		System.out.println("je vais faire de mon mieux pour effectuer "
				+"standards prevues lorsqu'il nya pas de problemes");
	}
	
	//methode qui execute les actions dans le cas d'echec
	private static void excecuterActionsMAIN_ERROR(){
		System.out.println("je vais faire de mon mieux pour effectuer "
				+"les actions d'urgence, mm s'il y a eu un problrmr grave "
				+"dans le main qui est en train de se terminer");
	}
	
	//methode qui execute les instructions: dans TOUS les cas 
	private static void excecuterActionsMIAN_ALL_CASES(){
		System.out.println("je vais faire de mon mieux pour effectuer "
				+"standards prevues dans tous les cas");
	}
}
