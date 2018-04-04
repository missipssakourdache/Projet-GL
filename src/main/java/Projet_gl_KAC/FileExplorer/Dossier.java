/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projet_gl_KAC.FileExplorer;

import java.io.Serializable;
import java.util.ArrayList;

public class Dossier implements Serializable {

	private int idDoss;
	private String nomDoss;
	private ArrayList<File> Files = new ArrayList<File>();
	
	public Dossier() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dossier(String nomDoss) {
		super();
		this.nomDoss = nomDoss;
	}
	
	public int getIdDoss() {
		return idDoss;
	}
	public void setIdDoss(int idDoss) {
		this.idDoss = idDoss;
	}
	public String getNomDoss() {
		return nomDoss;
	}
	public void setNomDoss(String nomDoss) {
		this.nomDoss = nomDoss;
	}
	public ArrayList<File> getFiles() {
		return Files;
	}
	public void setFiles(ArrayList<File> files) {
		Files = files;
	}
	
	
}
