/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projet_gl_KAC.FileExplorer;

import java.io.Serializable;

public class User implements Serializable {

	private int idUser;
	private String nomUser;
	private String mdpUser;
	private String typeUser;
	private Dossier dossier;
	
	 
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	public User(int idUser, String nomUser, String mdpUser, String typeUser) {
		super();
		this.idUser = idUser;
		this.nomUser = nomUser;
		this.mdpUser = mdpUser;
		this.typeUser = typeUser;
	}


	public int getIdUser() {
		return idUser;
	}


	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}


	public String getNomUser() {
		return nomUser;
	}


	public void setNomUser(String nomUser) {
		this.nomUser = nomUser;
	}


	public String getMdpUser() {
		return mdpUser;
	}


	public void setMdpUser(String mdpUser) {
		this.mdpUser = mdpUser;
	}


	public String getTypeUser() {
		return typeUser;
	}


	public void setTypeUser(String typeUser) {
		this.typeUser = typeUser;
	}


	public Dossier getDossier() {
		return dossier;
	}


	public void setDossier(Dossier dossier) {
		this.dossier = dossier;
	} 
	
	
    
}
