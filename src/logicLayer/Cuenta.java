package logicLayer;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Cuenta {

	private int numeroCuenta;
	private double saldo;
	private Cliente titular;
	private List<Operacion> operaciones = new ArrayList<>();

    public Cuenta(int numeroCuenta, Cliente titular, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldoInicial;
    }
    

	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
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
        if (monto <= 0) {
            JOptionPane.showMessageDialog(null, "Monto inválido.");
            return;
        }
        saldo += monto;
        operaciones.add(new Operacion(TipoOperacion.DEPOSITO, monto));
        JOptionPane.showMessageDialog(null, "Depósito exitoso.\nSaldo actual: $" + saldo);
    }

    public boolean retirar(double monto) {
        if (monto <= 0) {
            JOptionPane.showMessageDialog(null, "Monto inválido.");
            return false;
        }
        if (monto > saldo) {
            JOptionPane.showMessageDialog(null, "Fondos insuficientes.");
            return false;
        }

        saldo -= monto;
        operaciones.add(new Operacion(TipoOperacion.RETIRO, monto));
        JOptionPane.showMessageDialog(null, "Retiro realizado.\nSaldo actual: $" + saldo);
        return true;
    }

    public void transferir(Cuenta destino, double monto) {
        if (destino == null) {
            JOptionPane.showMessageDialog(null, "Cuenta destino inválida.");
            return;
        }
        if (retirar(monto)) {
            destino.depositar(monto);
            operaciones.add(new Operacion(TipoOperacion.TRANSFERENCIA, monto));
            JOptionPane.showMessageDialog(null, "Transferencia realizada a " + destino.getTitular().getNombre());
        }
    }

}
