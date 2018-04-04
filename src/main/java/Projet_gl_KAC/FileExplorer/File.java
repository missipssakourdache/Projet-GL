/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projet_gl_KAC.FileExplorer;

import java.io.Serializable;

public class File implements Serializable {

	private int idFichier;
	private String nomFichier;
	private String typeFichier;
	private Dossier Dossier;
	
	
	public File() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public File(int idFichier, String nomFichier, String typeFichier) {
		super();
		this.idFichier = idFichier;
		this.nomFichier = nomFichier;
		this.typeFichier = typeFichier;
	}

	public int getIdFichier() {
		return idFichier;
	}
	public void setIdFichier(int idFichier) {
		this.idFichier = idFichier;
	}
	public String getNomFichier() {
		return nomFichier;
	}
	public void setNomFichier(String nomFichier) {
		this.nomFichier = nomFichier;
	}
	public String getTypeFichier() {
		return typeFichier;
	}
	public void setTypeFichier(String typeFichier) {
		this.typeFichier = typeFichier;
	}
	public Dossier getDossier() {
		return Dossier;
	}
	public void setDossier(Dossier dossier) {
		Dossier = dossier;
	}
    
}
