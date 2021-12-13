package pkgcompte;

public class Titulaire {


	private int m_idTitulaire = 0;
	private String m_str_nomTitulaire = null;

	//constructeur avec parametres

	public Titulaire(int i_idTitulaire, String i_str_nomTitulaire)throws Exception {
		super();
		//Si l’idTitulaire est négatif ou le nomTitulaire est null le constructeur doit lever une exception. 
		if(i_idTitulaire<0) {
			throw new Exception("L'id titulaire ["+i_idTitulaire+"] fourni est négatif, or ce nest pas autorisé !");
		}
		//Egalement, si le nomTitulaire est null , le constructeur doit lever une exception
		if(i_str_nomTitulaire==null) {
			throw new Exception("Le nom titulaire ["+i_str_nomTitulaire+"] fourni est null, or ce nest pas autorisé !");
		}
		//Egalement, si le nomTitulaire est null , le constructeur doit lever une exception
		if(i_str_nomTitulaire.isEmpty()) {
			throw new Exception("Le nom titulaire ["+i_str_nomTitulaire+"] fourni est vide, or ce nest pas autorisé !");
		}
		this.m_idTitulaire = i_idTitulaire;
		this.m_str_nomTitulaire = i_str_nomTitulaire;

	}

	@Override
	public String toString() {
		String o_str_preparationdelavaleurderetour="Titulaire [i_idTitulaire=" + m_idTitulaire + ", i_str_nomTitulaire=" + m_str_nomTitulaire + "]";
		return o_str_preparationdelavaleurderetour;
	}

	public int getidTitulaire() {
		return m_idTitulaire;
	}

	public void set_idTitulaire(int m_idTitulaire) {
		this.m_idTitulaire = m_idTitulaire;
	}

	public String getstr_nomTitulaire() {
		return m_str_nomTitulaire;
	}

	public void set_str_nomTitulaire(String m_str_nomTitulaire) {
		this.m_str_nomTitulaire = m_str_nomTitulaire;
	}






}
