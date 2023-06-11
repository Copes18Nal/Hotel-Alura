package Controladores;

import java.sql.Connection;
import java.sql.Date;
import java.util.List;

import DAO.ReservaDAO;
import factory.ConexionDataBase;
import modelo.Reserva;

public class ReservaControlador {

	private ReservaDAO reservaD;

	public ReservaControlador() {
		
		Connection con  = new ConexionDataBase().conectarBase();
		this.reservaD = new ReservaDAO(con);
	}

	public void guardar(Reserva reserva) {
		this.reservaD.guardar(reserva);
	}

	public List<Reserva> buscar() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Reserva> buscarId(String text) {
		// TODO Auto-generated method stub
		return null;
	}

	public void actualizar(Date fechaE, Date fechaS, String valor, String formaPago, Integer id) {
		// TODO Auto-generated method stub
		
	}

	public void Eliminar(Integer valueOf) {
		// TODO Auto-generated method stub
		
	}

}
