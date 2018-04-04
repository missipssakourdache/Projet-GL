package Projet_gl_KAC.FileExplorer;

import java.util.List;

public interface IExplorer {
	public void addDossier(Dossier d);
	public void addFile(File f, int idDos);
	public List<File> getFilesParMC(String mc);
	public List<File> getFileParDoss(int idDOs);
	public List<Dossier> getDossiers();
	public Dossier getDossier(int idDoss);
	
}
