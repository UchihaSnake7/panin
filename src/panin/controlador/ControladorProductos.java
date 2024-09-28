package panin.controlador;

import java.sql.Connection;
import java.sql.SQLException;

import panin.db.ConexionDB;

public class ControladorProductos {
	
	ConexionDB conexionDB;
	
	public ControladorProductos(){
		 conexionDB = new ConexionDB("jdbc:mysql://localhost:3306/panin","root","root");

	}
	
	
	public void obtenerProductos() {
		
		try {
			Connection conexion = conexionDB.obtenerConexion();
			conexionDB.cerrarConexion(conexion);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

}