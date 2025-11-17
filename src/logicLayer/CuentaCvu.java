package logicLayer;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class CuentaCvu extends Cuenta{

	private String cvu;
    private String alias;

    public CuentaCvu(int numeroCuenta, Cliente titular, double saldoInicial, String cvu, String alias) {
        super(numeroCuenta, titular, saldoInicial);
        this.cvu = cvu;
        this.alias = alias;
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


	
	
	
}
