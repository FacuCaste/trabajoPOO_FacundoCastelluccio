package logicLayer;

import java.time.LocalDateTime;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class CuentaCvu {

	private String cvu;
	private String alias;
	private double saldo;
	private Cliente titular;
	private ArrayList<Operacion> operaciones = new ArrayList<Operacion>();
	public CuentaCvu(String cvu, String alias, double saldo, Cliente titular) {

		this.cvu = cvu;
		this.alias = alias + ".alias";
		this.titular = titular;
		this.saldo = 0;
		this.operaciones = new ArrayList<>();
	}
	
	public String getCvu() {
		return cvu;
	}
	public void setCvu(String cvu) {
		this.cvu = cvu;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public Cliente getTitular() {
		return titular;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public ArrayList<Operacion> getOperaciones() {
		return operaciones;
	}
	public void setOperaciones(ArrayList<Operacion> operaciones) {
		this.operaciones = operaciones;
	}
	
	
	public void depositar(double monto) {
		if (monto <= 0) {
			JOptionPane.showMessageDialog(null, "El monto a depositar debe ser mayor a cero.");
		}
		saldo += monto;
		registrarOperacion(new Operacion(TipoOperacion.DEPOSITO, monto, LocalDateTime.now()));
		JOptionPane.showMessageDialog(null, "Deposito exitoso.");
	}
	
	public void retirar(double monto) {
		if (monto <= 0 || monto > saldo) {
			JOptionPane.showMessageDialog(null, "Saldo insuficiente.");
		}else {
			saldo -= monto;
			registrarOperacion(new Operacion(TipoOperacion.RETIRO, monto, LocalDateTime.now()));
			JOptionPane.showMessageDialog(null, "Retiro exitoso.");
		}
	}
	
	public void tranferir(double monto, CuentaCvu destino) {
		if (monto <= 0) {
			JOptionPane.showMessageDialog(null, "No hay suficiente saldo para transferir $"+monto);
		}else {
			saldo-= monto;
			destino.saldo = monto;
			registrarOperacion(new Operacion(TipoOperacion.TRANSFERENCIA, monto, LocalDateTime.now()));
		}
	}
	
	
	public void registrarOperacion(Operacion op) {
        operaciones.add(op);
    }
	
	
	
}
