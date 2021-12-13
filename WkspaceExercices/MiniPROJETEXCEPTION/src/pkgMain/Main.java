package pkgMain;

import pkgcompte.Compte;
import pkgcompte.Titulaire;

public class Main {


	public static void main(String[] args)throws Exception {

		// ----------------------------------------------------
		// Cr�ation de variables temporaires r�utilisables
		Integer t_Integer_montantARetirer1 = 100;
		Integer t_Integer_montantARetirer2 = 500;

		Integer t_Integer_montantAVirer1 = 300;
		Integer t_Integer_montantAVirer2 = 100;

		int		t_int_idTitulaire1 = 40;
		int		t_int_idTitulaire2 = 50;
		
		int		t_int_idCompte_titulaire1_courant = 1;
		int		t_int_idCompte_titulaire1_epargne = 2;
		int		t_int_idCompte_titulaire2_courant = 3;
		int		t_int_idCompte_titulaire2_epargne = 4;
		
		String  t_str_nomTitulaire1 = "karima";
		String  t_str_nomTitulaire2 = "jack";
		
		Integer t_Integer_soldeInitialCompte_karima_courant = 1000;
		Integer t_Integer_soldeInitialCompte_karima_epargne = 1000;
		Integer t_Integer_soldeInitialCompte_jack_courant = 1000;
		Integer t_Integer_soldeInitialCompte_jack_epargne = 1000;
		
		Titulaire t_refTitulaire1=null;
		Titulaire t_refTitulaire2=null;
		
		Compte t_refCompte_titulaire1_courant=null;
		Compte t_refCompte_titulaire1_epargne=null;
		Compte t_refCompte_titulaire2_courant=null;
		Compte t_refCompte_titulaire2_epargne=null;

		// ----------------------------------------------------
				
		try {
			//Cr�ation objet Titulaires
			t_refTitulaire1= new Titulaire(t_int_idTitulaire1, t_str_nomTitulaire1);
			t_refTitulaire2= new Titulaire(t_int_idTitulaire2, t_str_nomTitulaire2);
			
			//	Cr�ation objet Comptes
			t_refCompte_titulaire1_courant = new Compte(t_int_idCompte_titulaire1_courant, t_refTitulaire1, t_Integer_soldeInitialCompte_karima_courant);
			t_refCompte_titulaire2_courant = new Compte(t_int_idCompte_titulaire2_courant, t_refTitulaire2, t_Integer_soldeInitialCompte_jack_courant);
			
			//afficher le solde du compte courant de karima avant retrait
			System.out.println("solde du compte courant de karima avant retrait:"+t_refCompte_titulaire1_courant.get_Integer_solde().intValue());
			
			//afficher le solde du compte courant de jack avant retrait
			System.out.println("solde du compte courant de jack avant virement:"+t_refCompte_titulaire2_courant.get_Integer_solde().intValue());
			// effectuer un retrait sur le compte courant de karima
			t_refCompte_titulaire1_courant.effectuerUnretrait(t_Integer_montantARetirer1);
			
			//afficher le solde du compte courant de karima apres retrait
			System.out.println("solde du compte courant de karima apr�s retrait:"+t_refCompte_titulaire1_courant.get_Integer_solde());
			
			// effectuer un retrait sur le compte courant de Jack
			t_refCompte_titulaire2_courant.effectuerUnretrait(t_Integer_montantARetirer2);
			//afficher le solde du compte courant de jack apres retrait
			System.out.println("solde du compte courant de jack apres retrait:"+t_refCompte_titulaire2_courant.get_Integer_solde().intValue());
			
			// Choix 1 : avec une methode statique � la classe Compte
			//on doit effectuer un virement du compte courant de jack vers compte courant de karima
			t_refCompte_titulaire2_courant.realiserunViremententredeuxComptes(t_Integer_montantAVirer1, t_refCompte_titulaire2_courant, t_refCompte_titulaire1_courant);
			
			//afficher le solde du compte courant de karima apres virement a paritir du compte courant de jack
			System.out.println("solde du compte courant de karima apr�s viremnt:"+t_refCompte_titulaire1_courant.get_Integer_solde());
			
			//afficher le solde du compte courant de jack apres virement 
			System.out.println("solde du compte courant de jack apr�s viremnt:"+t_refCompte_titulaire2_courant.get_Integer_solde());
			
			// Choix 2 : avec une methode interne � la classe compte
			// t_refCompte1.recevoirUnVirement(t_Integer_montantAVirer1, t_refCompte2);

		}
		
		catch (Exception e) {
			System.out.println("le msg complet est["+e.toString()+"]");
		}


	}
}





