package controllers;

public class etudiant {
	//private int id;
	private String Mati�res;
	private int Notes;
	private String R�sultat;

public etudiant(){
	super();
}
public etudiant(String Mati�res , int Notes , String R�sultat){
	super();
	//this.id=id;
	this.Mati�res=Mati�res;
	this.Notes=Notes;
	this.R�sultat=R�sultat;
}
/*public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}*/
public String getMati�res() {
	return Mati�res;
}
public void setMati�res(String mati�res) {
	Mati�res = mati�res;
}
public int getNotes() {
	return Notes;
}
public void setNotes(int notes) {
	Notes = notes;
}
public String getR�sultat() {
	return R�sultat;
}
public void setR�sultat(String r�sultat) {
	R�sultat = r�sultat;
}
}
