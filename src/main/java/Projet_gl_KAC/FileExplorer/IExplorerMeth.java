package Projet_gl_KAC.FileExplorer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import java.sql.Connection;

public class IExplorerMeth implements IExplorer {

	@Override
	public void addDossier(Dossier d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addFile(File f, int idDos) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<File> getFilesParMC(String mc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<File> getFileParDoss(int idDOs) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Dossier> getDossiers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Dossier getDossier(int idDoss) {
		// TODO Auto-generated method stub
		return null;
	}
/*
	@Override
	public void addDossier(Dossier d) {
		Connection conn = SingletonConnexion.getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement(
					" insert into dossier(NOM_DOSS) values VALUES(?)");
			ps.setString(1,d.getNomDoss());
			ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void addFile(File f, int idDos) {
		Connection conn = SingletonConnexion.getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement(
					" insert into fichier values(?,?,?,?)");
			ps.setInt(1,f.getIdFichier());
			ps.setString(2,f.getNomFichier());
			ps.setString(3,f.getTypeFichier());
			ps.setInt(4, idDos);
			ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public List<File> getFilesParMC(String mc) {
		Connection conn = SingletonConnexion.getConnection();
		List<File> files = new ArrayList<File>();
		try {
			PreparedStatement ps = conn.prepareStatement(
					" select * from fichier where NOM_FICH like ? ");			
			ps.setString(1,"%"+mc);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				File f = new File();
				f.setIdFichier(rs.getInt("ID_FICH"));
				f.setNomFichier(rs.getString("NOM_FICH"));
				f.setTypeFichier(rs.getString("TYPE_FICH"));
				int idDoss = rs.getInt("ID_DOSS");
				PreparedStatement ps1 = conn.prepareStatement(
						" select * from dossier where ID_DOSS = ? ");
				ps1.setInt(1, idDoss);
				ResultSet rs1 = ps1.executeQuery();
				if(rs1.next()){
					Dossier dos = new Dossier();
					dos.setIdDoss(rs1.getInt("ID_DOSS"));
					dos.setNomDoss(rs1.getString("NOM_DOSS"));
					f.setDossier(dos);
					ps1.close();
				}
				files.add(f);
			}
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return files;
	}

	@Override
	public List<File> getFileParDoss(int idDos) {
		Connection conn = SingletonConnexion.getConnection();
		List<File> files = new ArrayList<File>();
		try {
			PreparedStatement ps = conn.prepareStatement(
					" select * from fichier where ID_DOSS = ? ");			
			ps.setInt(1,idDos);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				File f = new File();
				f.setIdFichier(rs.getInt("ID_FICH"));
				f.setNomFichier(rs.getString("NOM_FICH"));
				f.setTypeFichier(rs.getString("TYPE_FICH"));
				int idDoss = rs.getInt("ID_DOSS");
				PreparedStatement ps1 = conn.prepareStatement(
						" select * from dossier where ID_DOSS = ? ");
				ps1.setInt(1, idDoss);
				ResultSet rs1 = ps1.executeQuery();
				if(rs1.next()){
					Dossier dos = new Dossier();
					dos.setIdDoss(rs1.getInt("ID_DOSS"));
					dos.setNomDoss(rs1.getString("NOM_DOSS"));
					f.setDossier(dos);
					ps1.close();
				}
				files.add(f);
			}
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return files;
	}

	@Override
	public List<Dossier> getDossiers() {
		Connection conn = SingletonConnexion.getConnection();
		List<Dossier> dossiers = new ArrayList<Dossier>();
		try {
			
			PreparedStatement ps = conn.prepareStatement(
					" select * from user where ID_USER = ? ");			
			ps.setInt(1,idDos);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				File f = new File();
				f.setIdFichier(rs.getInt("ID_FICH"));
				f.setNomFichier(rs.getString("NOM_FICH"));
				f.setTypeFichier(rs.getString("TYPE_FICH"));
				int idDoss = rs.getInt("ID_DOSS");
				PreparedStatement ps1 = conn.prepareStatement(
						" select * from dossier where ID_DOSS = ? ");
				ps1.setInt(1, idDoss);
				ResultSet rs1 = ps1.executeQuery();
				if(rs1.next()){
					Dossier dos = new Dossier();
					dos.setIdDoss(rs1.getInt("ID_DOSS"));
					dos.setNomDoss(rs1.getString("NOM_DOSS"));
					f.setDossier(dos);
					ps1.close();
				}
				files.add(f);
			}
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return files;
	}

	@Override
	public Dossier getDossier(int idDoss) {
		// TODO Auto-generated method stub
		return null;
	}
*/
}
