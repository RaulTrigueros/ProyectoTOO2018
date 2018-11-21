package com.too.gestionMedicamento.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="lote")
public class Lote {
	private int numLote;

	public Lote(int numLote) {
		setNumLote(numLote);
	}

	public int getNumLote() {
		return numLote;
	}

	public void setNumLote(int numLote) {
		this.numLote = numLote;
	}
	
	
	
}
