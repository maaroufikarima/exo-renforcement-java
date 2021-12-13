package pkgMain;

public class Main {

	public static void main(String[] args) {
		System.out.println("Avant");
		int rtat=10/0;
		System.out.println("Apres");
		//Fonctionnement du système try catch
		try {
			//effectuer une operation qui lance une exception
			//int rtat=10/0;
			System.out.println("le resultat est ["+rtat+"");
		} catch (Exception e) {
			//afficher un msg d'erreur
			System.out.println("une erreur a été detectée grace au sys try catch,");
			System.out.println("l'erreur contient["+e.getMessage()+"]");
			System.out.println("le msg complet est["+e.toString()+"]");
		}


	}

}
