package logicLayer;

import java.time.LocalDateTime;

public class Operacion {
	
	private TipoOperacion tipo;
	private double monto;
	private LocalDateTime fecha;
	public Operacion(TipoOperacion tipo, double monto, LocalDateTime fecha) {
		this.tipo = tipo;
		this.monto = monto;
		this.fecha = fecha;
	}
	
	public TipoOperacion getTipo() {
		return tipo;
	}
	public void setTipo(TipoOperacion tipo) {
		this.tipo = tipo;
	}
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	
	
	
	

}
