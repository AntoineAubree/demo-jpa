package fr.diginamic.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ville {

	@Id
	private int id;
	@Column(name = "code")
	private int codeCommune;
	@Column(name = "nom")
	private String nomCommune;
	@Column(name = "population")
	private int popTotale;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCodeCommune() {
		return codeCommune;
	}

	public void setCodeCommune(int codeCommune) {
		this.codeCommune = codeCommune;
	}

	public String getNomCommune() {
		return nomCommune;
	}

	public void setNomCommune(String nomCommune) {
		this.nomCommune = nomCommune;
	}

	public int getPopTotale() {
		return popTotale;
	}

	public void setPopTotale(int popTotale) {
		this.popTotale = popTotale;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Ville [id=");
		builder.append(id);
		builder.append(", codeCommune=");
		builder.append(codeCommune);
		builder.append(", nomCommune=");
		builder.append(nomCommune);
		builder.append(", popTotale=");
		builder.append(popTotale);
		builder.append("]");
		return builder.toString();
	}

}
