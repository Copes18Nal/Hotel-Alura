package Controladores;

import java.sql.Connection;
import java.sql.Date;
import java.util.List;

import DAO.HuespedesDAO;
import factory.ConexionDataBase;
import modelo.Huespedes;

public class HuespedesControlador {

	private HuespedesDAO huespedDao;

	public HuespedesControlador() {
		Connection con = new ConexionDataBase().conectarBase();
		this.huespedDao = new HuespedesDAO(con);
	}
	
	public void guardar(Huespedes huespedes) {
		this.huespedDao.guardar(huespedes);
	}

	public List<Huespedes> listarHuespedesId(String text) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Huespedes> listarHuespedes() {
		// TODO Auto-generated method stub
		return null;
	}

	public void actualizar(String nombre, String apellido, Date fechaN, String nacionalidad, String telefono,
			Integer idReserva, Integer id) {
		// TODO Auto-generated method stub
		
	}

	public void Eliminar(Integer valueOf) {
		// TODO Auto-generated method stub
		
	}

}
