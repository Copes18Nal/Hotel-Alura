package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import factory.ConexionDataBase;

public class usuarios {

	private String nombre;
	private String contreseña;

	public usuarios(String nombre, String contreseña) {
		this.nombre = nombre;
		this.contreseña = contreseña;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContreseña() {
		return contreseña;
	}

	public void setContreseña(String contreseña) {
		this.contreseña = contreseña;
	}
	
	public static boolean validarUsuario(String nombre, String contraseña) {
		ConexionDataBase con = new ConexionDataBase();
		Connection connec = null;
		PreparedStatement state = null;
		ResultSet result = null;
		try {
			connec = con.conectarBase();
			state = connec.prepareStatement("SELECT * FROM usuarios WHERE nombre=? AND contraseña =?");
			state.setString(1, nombre);
			state.setString(2, contraseña);
			result = state.executeQuery();
			return result.next();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}finally {
			try {
				if (result != null)
					result.close();
				if (state != null)
					state.close();
				if (connec != null)
					connec.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
	}
}
