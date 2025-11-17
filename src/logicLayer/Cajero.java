package logicLayer;

import javax.swing.JOptionPane;

public class Cajero {
	
	private String direccion;
	private double saldoDisponible;
	
	public Cajero(String direccion, double saldoDsiponible) {
		this.direccion = direccion;
		this.saldoDisponible = saldoDisponible;
	}
	
	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public double getSaldoDisponible() {
		return saldoDisponible;
	}

	public void setSaldoDisponible(double saldoDisponible) {
		this.saldoDisponible = saldoDisponible;
	}


}
