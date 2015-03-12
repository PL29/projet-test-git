package com.metier;
import java.util.*;

import javax.persistence.*;


/**
 * @author lequay-l
 * classe m�tier qui g�re une station  avec sa liste de bornes
 * 
 */
@Entity
@Table(name="station")
public class Station {
	@Id
	@GeneratedValue
	@Column(name="idStation")
	private int idStation;
	@Column(name="libelleEmplacement")
	private String libelleEmplacement;
	@OneToMany
	@JoinColumn(name="idStation")
	private List<Borne> lesBornes;
	/**
	 * constructeur utilis� par la classe StationDAO
	 * @param idStation
	 * @param libelleEmplacement
	 * 
	 */
	public Station(int idStation, String libelleEmplacement) {
		super();
		this.idStation = idStation;
		this.libelleEmplacement = libelleEmplacement;
		this.lesBornes = new ArrayList<Borne>();
	}
	/**
	 * constructeur pour nouvelle station, pas idStation car num�ro auto
	 * @param libelleEmplacement
	 */

	public Station(String libelleEmplacement) {
		super();
		this.libelleEmplacement = libelleEmplacement;
		this.lesBornes = new ArrayList<Borne>();
	}
	/**
	 * 
	 */
	public Station() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setIdStation(int idStation) {
		this.idStation = idStation;
	}
	/**
	 * accesseur sur le libelle emplacement de la station
	 * @return libelleEmplacement
	 * 
	 */
	public String getLibelleEmplacement() {
		return libelleEmplacement;
	}
	/**
	 * modificateur sur le libelle emplacement de la station
	 * @param libelleEmplacement
	 */
	public void setLibelleEmplacement(String libelleEmplacement) {
		this.libelleEmplacement = libelleEmplacement;
	}
	
	/**
	 * red�finition de la m�thode toString()
	 * affiche l'idStation et le libell� emplacement
	 */
	@Override
	public String toString() {
		return "Station [idStation=" + idStation + ", libelleEmplacement="
				+ libelleEmplacement + "]";
	}


	public List<Borne> getLesBornes() {
		return lesBornes;
	}
	public void setLesBornes(List<Borne> lesBornes) {
		this.lesBornes = lesBornes;
	}
	public int getIdStation() {
		return idStation;
	}
	public void addBorne(Borne b) {
		lesBornes.add(b);
	}

}

