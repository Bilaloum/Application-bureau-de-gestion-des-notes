package interfac;

public class etudiant1 {
    String code_apog�;
    String cne;
    String filiere;


    public etudiant1()
    {
    	super();
    }
    public etudiant1(String code_apog�, String cne , String filiere )
    {
    	this.code_apog�=code_apog�;
    	this.cne= cne ;
    	this.filiere=filiere;
    }



    public String getCode_apog�() {
		return code_apog�;
	}
	public void setCode_apog�(String code_apog�) {
		this.code_apog� = code_apog�;
	}


	 public String getCne() {
			return cne;
	}
	public void setCne(String cne) {
			this.cne = cne;
	}

	public String getFiliere() {
				return filiere;
	}
	public void setFiliere(String filiere) {
			this.filiere = filiere;
	}


}
