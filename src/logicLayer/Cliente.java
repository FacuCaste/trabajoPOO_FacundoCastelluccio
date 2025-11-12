package logicLayer;

public class Cliente {
	
	private String nmobre;
	private String dni;
	private String ususario;
	private String contrasenia;
	private CuentaCvu cuenta;
	
	public Cliente(String nmobre, String dni, String ususario, String contrasenia, CuentaCvu cuenta) {
		this.nmobre = nmobre;
		this.dni = dni;
		this.ususario = ususario;
		this.contrasenia = contrasenia;
		this.cuenta = cuenta;
	}

	public String getNmobre() {
		return nmobre;
	}

	public void setNmobre(String nmobre) {
		this.nmobre = nmobre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getUsusario() {
		return ususario;
	}

	public void setUsusario(String ususario) {
		this.ususario = ususario;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public CuentaCvu getCuenta() {
		return cuenta;
	}

	public void setCuenta(CuentaCvu cuenta) {
		this.cuenta = cuenta;
	}
	
	
	

}
