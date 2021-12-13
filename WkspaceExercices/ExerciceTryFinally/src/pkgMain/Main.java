package pkgMain;

public class Main {

	public static void main(String[] args) {

		//Fonctionnement du système try catch
		try {
			
			//j'affiche un simple msg avant de faire le calcul
			System.out.println("debut try");
			//effectuer une operation qui lance une exception
			int rtat=10/5;
			System.out.println("le resultat est ["+rtat+"]");
			//je demande a effectuer les actions d'urgence
			//mais elle ne vont pas s'exceuter!!!
			excecuterActionsDurgence();
			
		} catch (Exception e) {
			//afficher un msg d'erreur
			System.out.println("une erreur a été detectée grace au sys try catch,");
			System.out.println("l'erreur contient["+e.getMessage()+"]");
			System.out.println("le msg complet est["+e.toString()+"]");
		}
		finally {
			System.out.println("ceci va s'executer meme si on est passé par le catch" );
		}

	}
	//methode qui execute les actions d'urgence
	private static void excecuterActionsDurgence(){
	System.out.println("je vais faire de mon mieux pour effectuer "
						+"les actions d'urgence, mm s'il y a eu un problrmr grave "
						+"dans le main qui est en train de se terminer");
	}
}
