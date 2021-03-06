package pkgcompte;

public class Compte {
	//declaration des variables membres de la classe
	private int m_int_idCompte;
	private Titulaire m_refTitulaire;
	public Integer m_Integer_solde;


	public Compte(int i_int_idCompte, Titulaire i_refTitulaire, Integer i_Integer_soldeInitial)throws Exception {
		super();
		//Si la r?f?rence vers l?objet Titulaire est null, le constructeur doit lever une exception.
		if(i_refTitulaire==null) {
			throw new Exception("La ref titulaire ["+i_refTitulaire+"] fourni est null, or ce nest pas autoris? !");
		}

		//Si la r?f?rence vers l?objet le solde Initial est null, le constructeur doit lever une exception.
		if(i_Integer_soldeInitial==null) {
			throw new Exception("Le solde initial ["+i_Integer_soldeInitial+"] fourni est null, or ce nest pas autoris? !");
		}

		this.m_int_idCompte = i_int_idCompte;
		this.m_refTitulaire = i_refTitulaire;
		this.m_Integer_solde = i_Integer_soldeInitial;
	}



	@Override
	public String toString() {
		String ValeurdeRetour="Compte [m_int_idCompte=" + m_int_idCompte + ", m_refTitulaire=" + m_refTitulaire + ", m_Integer_solde="
				+ m_Integer_solde + "]";
		return ValeurdeRetour;
	}




	public int get_int_idCompte() {
		return m_int_idCompte;
	}

	public void set_int_idCompte(int m_int_idCompte) {
		this.m_int_idCompte = m_int_idCompte;
	}

	public Titulaire get_refTitulaire() {
		return m_refTitulaire;
	}

	public void set_refTitulaire(Titulaire m_refTitulaire) {
		this.m_refTitulaire = m_refTitulaire;
	}

	public Integer get_Integer_solde() {
		return m_Integer_solde;
	}

	public void set_Integer_solde(Integer m_Integer_solde) {
		this.m_Integer_solde = m_Integer_solde;
	}


	//creation d'une methode pour effectuer un retrait
	public void effectuerUnretrait(Integer i_Integer_montant) throws Exception{
		String tmp = "traitement ?chou?!";
		if (i_Integer_montant == null) {
			throw new Exception("Le montant ["+i_Integer_montant+"] fourni est null, interdit!");
		}
		if (i_Integer_montant < 0) {
			throw new Exception("Le montant ["+i_Integer_montant+"] fourni est n?gatif!, interdit!");
		}
		if (this.m_Integer_solde - i_Integer_montant < 0) {
			throw new Exception("Le montant ["+i_Integer_montant+"] fourni est superieur au solde du compte, interdit!");
		}
		if (this.m_Integer_solde > 10000) {
			throw new Exception("Le montant ["+i_Integer_montant+"] fourni est superieur 10000? autoris?s par retrait, interdit!");
		}

		try {
			this.m_Integer_solde -= i_Integer_montant;
			tmp = "votre retrait a ?t? effectu? avec succ?s!";
		}
		catch(Exception e){
			tmp = e.toString();
		}
		finally {
			System.out.println(tmp + " traitement de la demande termin?!");
		}

	}


	//creation d'une methode pour effectuer un virement
	public void realiserunViremententredeuxComptes(
			/* */ Integer 	i_Integer_montantAvirer, 
			/* */ Compte 	i_refCompteOrigineVirement,
			/* */ Compte 	i_refCompteDestinataireVirement
			) throws Exception{

		String tmp = "traitement ?chou?!";
		if (i_Integer_montantAvirer == null) {throw new Exception("Le montant ["+i_Integer_montantAvirer+"] fourni est null, interdit!");}
		if (i_Integer_montantAvirer < 0) {throw new Exception("Le montant ["+i_Integer_montantAvirer+"] fourni est n?gatif!, interdit!");}

		try {
			i_refCompteOrigineVirement.m_Integer_solde -= i_Integer_montantAvirer;
			i_refCompteDestinataireVirement.m_Integer_solde += i_Integer_montantAvirer;
			tmp = "votre virement a ?t? effectu? avec succ?s!";
		}
		catch(Exception e){
			tmp = e.toString();
		}
		finally {
			System.out.println(tmp + " traitement de la demande termin?!");
		}

	}


}
