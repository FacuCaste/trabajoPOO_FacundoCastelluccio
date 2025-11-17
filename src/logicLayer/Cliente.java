package logicLayer;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	private String nombre;
    private String dni;
    private String usuario;
    private String contrasenia;
    private String alias;

    private List<CuentaCvu> cuentas = new ArrayList<>();

    public Cliente(String nombre, String dni, String usuario, String contrasenia) {
        this.nombre = nombre;
        this.dni = dni;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.alias = usuario + ".alias"; 
    }

    public void agregarCuenta(CuentaCvu cuenta) {
        cuentas.add(cuenta);
    }



    public String getDni() {
        return dni;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public String getAlias() {
        return alias;
    }

	public String getNombre() {
		// TODO Auto-generated method stub
		return null;
	}

}
