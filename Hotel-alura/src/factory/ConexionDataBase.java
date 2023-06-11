package factory;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConexionDataBase {
	
	public DataSource dataSou;
	
	public ConexionDataBase() {
		
		ComboPooledDataSource comboPool = new ComboPooledDataSource();
		comboPool.setJdbcUrl("jdbc:mysql://localhost:3306/hotelAlura");
		comboPool.setUser("root");
		comboPool.setPassword("Morita1583");
		
		this.dataSou = comboPool;
	}
	
	public Connection conectarBase() {
		try {
			return this.dataSou.getConnection();
		} catch (SQLException e) {
			System.out.println("Hubo un error!");
			throw new RuntimeException(e);
		}
	}

}
