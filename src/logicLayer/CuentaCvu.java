package logicLayer;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class CuentaCvu {

	private String cvu;
	private double saldo;
	private Cliente titular;
	private List<Operacion> operaciones = new ArrayList<>();
	
	public CuentaCvu(String cvu, Cliente titular, double saldoInicial) {
		this.cvu = cvu;
		this.titular = titular;
		this.saldo = saldoInicial;
	}

	public String getCvu() {
		return cvu;
	}

	public void setCvu(String cvu) {
		this.cvu = cvu;
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

	public List<Operacion> getOperaciones() {
		return operaciones;
	}

	public void setOperaciones(List<Operacion> operaciones) {
		this.operaciones = operaciones;
	}
	
	public void depositar(double monto) {
		if (monto > 0) {
			saldo += monto;
			operaciones.add(new Operacion(TipoOperacion.DEPOSITO,monto));
			JOptionPane.showMessageDialog(null, "Deposito exitoso.\nNuevo saldo: $"+saldo);
		}else {
			JOptionPane.showMessageDialog(null, "El monto debe ser mayor a cero");
		}
	}
	
	public boolean retirar(double monto) {
		if (monto > 0 && monto <= saldo) {
			saldo -= monto;
			operaciones.add(new Operacion(TipoOperacion.RETIRO, monto));
			JOptionPane.showMessageDialog(null, "Retiro exitoso.\nNuevo saldo: $"+saldo);
			return true;
		}else {
			JOptionPane.showMessageDialog(null, "Fondos insuficientes o monto invalido");
			return false;
		}
	}
	
	public void trasnferi(CuentaCvu destino, double monto) {
		if (destino == null) {
			JOptionPane.showMessageDialog(null, "La cuenta de destino no existe");
		}
		
		if (retirar(monto)) {
			destino.depositar(monto);
			operaciones.add(new Operacion(TipoOperacion.TRANSFERENCIA, monto));
			JOptionPane.showMessageDialog(null, "Transferencia realizada a "+ destino.getTitular().getNombre());
		}
		
	}
	
    public void mostrarDatos() {
        String info = "-------- CUENTA CVU --------\n" +
                      "CVU: " + cvu + "\n" +
                      "Titular: " + titular.getNombre() + "\n" +
                      "Saldo: $" + saldo + "\n" +
                      "----------------------------";
        JOptionPane.showMessageDialog(null, info);
    }
	
	
}
