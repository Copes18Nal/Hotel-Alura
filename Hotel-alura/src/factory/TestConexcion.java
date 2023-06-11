package factory;

import java.sql.Connection;
import java.sql.SQLException;

public class TestConexcion {
	
	public static void main(String[] args) throws SQLException {
		
		ConexionDataBase con = new ConexionDataBase();
		Connection cone = con.conectarBase();
		
		System.out.println("Conecto bien!!!");
		cone.close();
		
		System.out.println("Cerro Bien!!!");
		
		
		
	}

}
